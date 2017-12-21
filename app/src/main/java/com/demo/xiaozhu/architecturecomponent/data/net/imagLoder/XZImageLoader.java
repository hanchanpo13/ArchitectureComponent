package com.demo.xiaozhu.architecturecomponent.data.net.imagLoder;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * @Description:
 * @Author: fengzeyuan
 * @Date: 17/12/21 下午2:10
 * @Version: 1.0
 */
public class XZImageLoader {

    public static void loadImage(String url, ImageView view) {
        Glide.with(view.getContext())
                .load(url)
                .crossFade()
                .into(view);
    }
}
