# Android Utils

A library that groups useful utils for day to day development.

##ColorUtils
- getColorIntFromColorRes(Context context, @ColorRes int resId)
- getColorIntFromColorString(String color)

##HardwareFeatureUtils
- isTelephonyFeatureAvailable(Context context)
- isCameraFeatureAvailable(Context context)
- isFrontCameraFeatureAvailable(Context context)

##UriUtils
- getDrawableUri(@DrawableRes int drawableResId)
- getFileUri(File file)
- getUrlUri(String url)

##SmsUtils
- isSimReady(Context context)
- sendNativeSms(String message, ArrayList<String> phoneNumbers)

##KeyboardUtils
- showVirtualKeyboard(View view)

##ScreenUtils
- getDisplayMetrics(Context context)
- getScreenWidthPx(Context context)
- getScreenHeightPx(Context context)

##UnitUtils
- convertDpToPx(Context context, int valueInDp)