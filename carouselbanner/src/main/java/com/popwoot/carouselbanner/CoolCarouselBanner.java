package com.popwoot.carouselbanner;

import android.content.Context;
import android.util.AttributeSet;


import androidx.recyclerview.widget.RecyclerView;

import com.popwoot.carouselbanner.adapter.CoolCarouselAdapter;
import com.popwoot.carouselbanner.base.CarouselBannerBase;
import com.popwoot.carouselbanner.interfaces.OnCarouselItemClickListener;
import com.popwoot.carouselbanner.layoutmanager.CoolBannerLayoutManager;

import java.util.List;

public class CoolCarouselBanner extends CarouselBannerBase<CoolBannerLayoutManager, CoolCarouselAdapter> {


    public CoolCarouselBanner(Context context) {
        this(context, null);
    }

    public CoolCarouselBanner(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CoolCarouselBanner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onBannerScrolled(RecyclerView recyclerView, int dx, int dy) {

    }

    @Override
    protected void onBannerScrollStateChanged(RecyclerView recyclerView, int newState) {
        int first = mLayoutManager.getCurrentPosition();
        if (currentIndex != first) {
            currentIndex = first;
            refreshIndicator();
        }
    }

    @Override
    protected CoolBannerLayoutManager getLayoutManager(Context context, int orientation) {
        return new CoolBannerLayoutManager(orientation, dp2px(10),speedPerPixelMillisecond);
    }

    @Override
    protected CoolCarouselAdapter getAdapter(List<String> list, OnCarouselItemClickListener onBannerItemClickListener) {
        return new CoolCarouselAdapter(list,   onBannerItemClickListener);
    }


}