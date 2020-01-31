package com.popwoot.carouselbanner.viewholder;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.popwoot.carouselbanner.base.BaseViewHolder;


public class CarouselViewHolder extends BaseViewHolder {

    public CarouselViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView;
        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        imageView.setLayoutParams(params);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
