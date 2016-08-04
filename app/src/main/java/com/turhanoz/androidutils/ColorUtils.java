package com.turhanoz.androidutils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;

public class ColorUtils {

    @ColorInt
    public static int getColorIntFromColorRes(Context context, @ColorRes int resId) {
        try {
            return ContextCompat.getColor(context, resId);
        } catch (Resources.NotFoundException e) {
            return ContextCompat.getColor(context, android.R.color.transparent);
        }
    }

    @ColorInt
    public static int getColorIntFromColorString(String color) {
        try {
            return Color.parseColor(color);
        } catch (IllegalArgumentException e) {
            return Color.parseColor("#FF000000");
        }
    }
}
