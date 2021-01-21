package com.hadi.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hadi.datasource.model.Photo
import com.hadi.home.databinding.ItemPhotoBinding

class PhotosAdapter : ListAdapter<Photo, PhotosAdapter.PhotosViewHolder>(
    object : DiffUtil.ItemCallback<Photo>() {
        override fun areItemsTheSame(oldItem: Photo, newItem: Photo): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Photo, newItem: Photo): Boolean =
            oldItem == newItem
    }
) {
    inner class PhotosViewHolder(private val item: ItemPhotoBinding) :
        RecyclerView.ViewHolder(item.root) {
        fun bindPhoto(photo: Photo) {
            item.photo = photo
            item.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        return PhotosViewHolder(
            ItemPhotoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bindPhoto(it)
        }
    }
}