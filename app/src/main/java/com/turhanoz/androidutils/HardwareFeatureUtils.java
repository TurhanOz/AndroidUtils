package com.turhanoz.androidutils;

import android.content.Context;
import android.content.pm.PackageManager;

public class HardwareFeatureUtils {

    /**
     * You can use a permission that requires an hardware feature. (such as SEND_SMS that requires
     * Telephony hardware capability)
     * By setting only the permission, all devices that don't have related hardware capabilities
     * will be disqualified (your app won't even show on store)
     *
     * To prevent this, one can define the hardware feature (needed by the permission) as optional,
     * and then check programatically if the feature is available (by using this util method)
     *
     * list of permission-hardware feature mapping here :
     * https://developer.android.com/guide/topics/manifest/uses-feature-element.html#permissions-features
     *
     * example in manifest
     * <uses-permission android:name="android.permission.SEND_SMS"/>
     *
     * <uses-feature
     *   android:name="android.hardware.telephony"
     *   android:required="false" >
     *  </uses-feature>
     * @param context
     * @return
     */
    public static boolean isTelephonyFeatureAvailable(Context context) {
        return isFeatureAvailable(context, PackageManager.FEATURE_TELEPHONY);
    }

    public static boolean isCameraFeatureAvailable(Context context) {
        return isFeatureAvailable(context, PackageManager.FEATURE_CAMERA);
    }

    public static boolean isFrontCameraFeatureAvailable(Context context) {
        return isFeatureAvailable(context, PackageManager.FEATURE_CAMERA_FRONT);
    }

    private static boolean isFeatureAvailable(Context context, String feature){
        PackageManager pm = context.getPackageManager();
        return pm.hasSystemFeature(feature);
    }
}
