package com.popwoot.carouselbanner.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.popwoot.carouselbanner.R;
import com.popwoot.carouselbanner.base.BaseBannerAdapter;
import com.popwoot.carouselbanner.interfaces.OnCarouselItemClickListener;
import com.popwoot.carouselbanner.viewholder.CoolCarouselViewHolder;

import java.util.List;


public class CoolCarouselAdapter extends BaseBannerAdapter<CoolCarouselViewHolder> {

    public CoolCarouselAdapter(List<String> urlList, OnCarouselItemClickListener onBannerItemClickListener) {
        super(urlList, onBannerItemClickListener);
    }

    @Override
    public CoolCarouselViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CoolCarouselViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false));
    }
}
