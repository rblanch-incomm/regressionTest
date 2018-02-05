package mobile.android.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import mobile.android.TestCapabilities;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AppiumDriverBuilder<SELF, DRIVER extends AppiumDriver> {

    protected String apiKey;
    protected String testReportId;

    public static AndroidDriverBuilder forAndroid() {
        return new AndroidDriverBuilder();
    }

    public static class AndroidDriverBuilder extends AppiumDriverBuilder<AndroidDriverBuilder, AndroidDriver> {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        @Override
        public AndroidDriver build()  {
            File file = new File("wl_pih.app");
            System.out.println("first");
            String path = file.getAbsolutePath();
            System.out.println("second " + path);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, TestCapabilities.DEVICE_NAME);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, TestCapabilities.PLATFORM_NAME);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, TestCapabilities.PLATFORM_VERSION);
            capabilities.setCapability(MobileCapabilityType.APP, TestCapabilities.APP);
//            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, TestCapabilities.AUTOMATION_NAME);

            AndroidDriver<AndroidElement> driver = null;
            try {
                driver = new AndroidDriver(new URL(TestCapabilities.END_POINT), capabilities);
            } catch (MalformedURLException ex) {
                Logger.getLogger(AppiumDriverBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
//                        driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Skip\"]").click();
            System.out.println(driver);
            return driver;
        }
    }

    public abstract DRIVER build();

}
