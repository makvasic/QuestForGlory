package mak.onelinecoding.questforglory

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.item_description.view.*
import kotlinx.android.synthetic.main.item_page.view.*
import mak.onelinecoding.questforglory.model.Description
import mak.onelinecoding.questforglory.model.Page
import mak.onelinecoding.questforglory.model.RecyclerViewItem

class RecyclerViewItemsAdapter(private val items: List<RecyclerViewItem>) :
    RecyclerView.Adapter<RecyclerViewItemsAdapter.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return if (viewType == RecyclerViewItem.DESCRIPTION) {
            DescriptionHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_description,
                    parent,
                    false
                )
            )
        } else {
            PageHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_page,
                    parent,
                    false
                )
            )
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) RecyclerViewItem.DESCRIPTION else RecyclerViewItem.PAGE
    }

    abstract class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        abstract fun bind(item: RecyclerViewItem)
    }

    class DescriptionHolder(itemView: View) : ItemHolder(itemView) {
        override fun bind(item: RecyclerViewItem) = with(itemView) {
            val description = item as Description
            descriptionTextView.setText(description.text)
            if (description.image == 0) {
                descriptionImageView.visibility = View.GONE
            } else {
                descriptionImageView.visibility = View.VISIBLE
                descriptionImageView.setImageResource(description.image)
            }
        }

    }

    class PageHolder(itemView: View) : ItemHolder(itemView), View.OnClickListener {

        lateinit var page: Page

        override fun bind(item: RecyclerViewItem) = with(itemView) {
            page = item as Page

            pageTextView.setText(page.text)
            pageImageView.setImageResource(page.image)

            setOnClickListener(this@PageHolder)
        }

        override fun onClick(v: View) {
            Navigation.findNavController(v).navigate(page.id)
        }

    }


}
