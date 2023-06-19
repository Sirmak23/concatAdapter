package com.irmak.concatadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.irmak.concatadapter.R
import com.irmak.concatadapter.model.Photo

class PhotoAdapter(
    private val photo: Photo
) : RecyclerView.Adapter<PhotoAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageViewBanner = itemView.findViewById<ImageView>(R.id.imageViewPhoto)
        fun bind(photo: Photo) {
            Glide.with(imageViewBanner.context)
                .load(photo.Image)
                .into(imageViewBanner)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout_photo, parent,
                false
            )
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(photo)

}