package com.irmak.concatadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.irmak.concatadapter.R
import com.irmak.concatadapter.model.MyDetail

class MyDetailAdapter(
    private val myDetail: MyDetail
) : RecyclerView.Adapter<MyDetailAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewUser = itemView.findViewById<TextView>(R.id.textViewUser)
        var textViewAboutMe = itemView.findViewById<TextView>(R.id.textViewAboutMe)
        fun bind(user: MyDetail) {
            textViewUser.text = user.name
            textViewAboutMe.text = user.aboutMe
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout_my_detail, parent,
                false
            )
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(myDetail)

}