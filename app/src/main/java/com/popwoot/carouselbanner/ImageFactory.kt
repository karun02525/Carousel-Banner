package com.popwoot.carouselbanner
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.popwoot.carouselbanner.interfaces.CarouselImageFactory

class ImageFactory : CarouselImageFactory {
    override fun onLoadFactory(url: String, view: ImageView) {
        Glide.with(view).load(url).into(view)
    }
}
