package com.turhanoz.androidutils;

import android.content.Context;
import android.util.TypedValue;

public class UnitUtils {

    public static float convertDpToPx(Context context, int valueInDp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, context.getResources().getDisplayMetrics());
    }
}
