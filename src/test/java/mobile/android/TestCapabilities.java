package mobile.android;

public class TestCapabilities {

    private static boolean isBitriseBuild = (System.getenv().get("REGRESSION_TEST_GIT_URL") != null);
    public static final String APP = isBitriseBuild ? "/bitrise/deploy/app-debug.apk" : "/Users/rrblanch-incomm/Incomm/Android-WL-Pay-it-Here/app/build/outputs/apk/debug/app-debug.apk";
    public static final String PLATFORM_VERSION = isBitriseBuild ? "8.0" : "8.1";
//    Bitrise URL and Version
//    public static final String APP = "/bitrise/deploy/app-debug.apk";
//    public static final String PLATFORM_VERSION = "8.0";

//    Local URL and Version
//    public static final String APP = "/Users/rrblanch-incomm/Incomm/Android-WL-Pay-it-Here/app/build/outputs/apk/debug/app-debug.apk";
//    public static final String PLATFORM_VERSION = "8.1";

    public static final String PLATFORM_NAME = "Android";
    public static final String DEVICE_NAME = "Android Emulator";
    public static final String END_POINT = "http://localhost:4723/wd/hub";
}

