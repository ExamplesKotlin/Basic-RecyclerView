package com.example.recyclerviewbasic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewbasic.model.Person
import kotlinx.android.synthetic.main.recycler_view_item.view.*


class AdaptadorCustom(items: ArrayList<Person>) :
    RecyclerView.Adapter<AdaptadorCustom.ViewHolder>() {

    var items: ArrayList<Person>? = null
    var viewHolder: ViewHolder? = null

    init {
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        viewHolder = ViewHolder(view)
        return viewHolder!!
    }

    override fun getItemCount(): Int {
        return this.items?.count()!!
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.name?.text = item?.name
        holder.picture?.setImageResource(item?.picture!!)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var view = view
        var picture: ImageView? = null
        var name: TextView? = null

        init {
            picture = view.imageView
            name = view.textView
        }
    }

}