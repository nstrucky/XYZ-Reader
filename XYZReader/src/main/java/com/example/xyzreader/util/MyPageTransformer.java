package com.example.xyzreader.util;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.xyzreader.R;

/**
 * Created by Nick on 1/15/2018.
 */

public class MyPageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(@NonNull View page, float position) {
        int pageWidth = page.getWidth();


        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(1);

        } else if (position <= 1) { // [-1,1]
            ImageView imageView = page.findViewById(R.id.photo);
            FloatingActionButton fab = page.findViewById(R.id.share_fab);
            imageView.setTranslationX(-position * (pageWidth / 2)); //Half the normal speed
            fab.setRotation(position * 180f);

        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(1);
        }
    }
}
