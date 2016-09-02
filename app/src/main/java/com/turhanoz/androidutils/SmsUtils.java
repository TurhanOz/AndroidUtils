package com.turhanoz.androidutils;

import android.telephony.SmsManager;

import java.util.ArrayList;

public class SmsUtils {

    /**
     * To use this method, check :
     * - if Telephony hardware capability is available (by using HardwareFeatureUtils.isisTelephonyFeatureAvailable()
     * - if SEND_SMS permission is granted (don't forget permission declaration in Manifest)
     * @return
     */
    public static void sendNativeSms(String message, ArrayList<String> phoneNumbers){
        SmsManager smsManager = SmsManager.getDefault();
        ArrayList<String> messageParts = smsManager.divideMessage(message);
        for (String phoneNumber : phoneNumbers) {
            if (messageParts.size() > 1)
                SmsManager.getDefault().sendMultipartTextMessage(phoneNumber, null, messageParts, null, null);
            else
                SmsManager.getDefault().sendTextMessage(phoneNumber, null, message, null, null);
        }
    }
}
