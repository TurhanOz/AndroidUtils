package com.turhanoz.androidutils;

import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;

import java.util.ArrayList;

public class SmsUtils {

    /**
     * To use this method, check :
     * - if Telephony hardware capability is available (by using HardwareFeatureUtils.isisTelephonyFeatureAvailable()
     * - if SEND_SMS permission is granted (don't forget permission declaration in Manifest)
     * - if isSimReady() (otherwise crash in Android)
     *
     * @return
     */
    public static void sendNativeSms(String message, ArrayList<String> phoneNumbers) {
        SmsManager smsManager = SmsManager.getDefault();
        ArrayList<String> messageParts = smsManager.divideMessage(message);
        for (String phoneNumber : phoneNumbers) {
            if (messageParts.size() > 1)
                SmsManager.getDefault().sendMultipartTextMessage(phoneNumber, null, messageParts, null, null);
            else
                SmsManager.getDefault().sendTextMessage(phoneNumber, null, message, null, null);
        }
    }

    /**
     * Check whether the SIM card is ready (helpfull to send native SMS)
     * if not, don't try to call SmsManager to send messages (android internal crash);
     *
     * required in Manifest the READ_PHONE_STATE
     * <uses-permission android:name="android.permission.READ_PHONE_STATE"/>
     *
     * @param context
     * @return
     */
    public static boolean isSimReady(Context context) {
        TelephonyManager manager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return manager.getSimState() == TelephonyManager.SIM_STATE_READY;
    }
}
