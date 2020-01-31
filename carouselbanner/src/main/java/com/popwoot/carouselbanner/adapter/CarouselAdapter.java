package com.popwoot.carouselbanner.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;


import com.popwoot.carouselbanner.base.BaseBannerAdapter;
import com.popwoot.carouselbanner.interfaces.OnCarouselItemClickListener;
import com.popwoot.carouselbanner.viewholder.CarouselViewHolder;

import java.util.List;


public class CarouselAdapter extends BaseBannerAdapter<CarouselViewHolder> {

    public CarouselAdapter(List<String> urlList, OnCarouselItemClickListener onBannerItemClickListener) {
        super(urlList, onBannerItemClickListener);
    }

    @Override
    public CarouselViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CarouselViewHolder(new ImageView(parent.getContext()));
    }
}
