package com.turhanoz.androidutils;

import android.net.Uri;
import android.support.annotation.DrawableRes;

public class UriUtils {
    private static final String LOCAL_ASSET_SCHEME = "asset";
    private static final String LOCAL_RESOURCE_SCHEME = "res";

    public static Uri getDrawableUri(@DrawableRes int drawableResId) {
        return new Uri.Builder()
                .scheme(LOCAL_RESOURCE_SCHEME)
                .path(String.valueOf(drawableResId))
                .build();
    }
}
