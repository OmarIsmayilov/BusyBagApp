package com.omarismayilov.busybag.common.base

import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView
import com.omarismayilov.busybag.R

object BindingAdapter {

    @BindingAdapter("load_url")
    @JvmStatic
    fun loadUrl(view: ShapeableImageView, url: String?) {
        url?.let {
            Glide.with(view)
                .load(it)
                .placeholder(R.color.placeholder)
                .into(view)
        }
    }
}
