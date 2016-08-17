package com.turhanoz.androidutils;

import android.net.Uri;
import android.support.annotation.DrawableRes;

import java.io.File;

public class UriUtils {
    private static final String LOCAL_ASSET_SCHEME = "asset";
    private static final String LOCAL_RESOURCE_SCHEME = "res";

    public static Uri getDrawableUri(@DrawableRes int drawableResId) {
        return new Uri.Builder()
                .scheme(LOCAL_RESOURCE_SCHEME)
                .path(String.valueOf(drawableResId))
                .build();
    }

    public static Uri getFileUri(File file) {
        return Uri.fromFile(file);
    }

    public static Uri getUrlUri(String url){
        return Uri.parse(url);
    }
}
