package com.hadi.home

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("imgSrc")
fun bindImage(imageView: ImageView, src: String) {
    Picasso.get().load(src).into(imageView)
}
