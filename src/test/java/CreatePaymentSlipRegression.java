import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertEquals;

public class CreatePaymentSlipRegression {

    private AndroidDriver driver;
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "8.1");
//        desiredCapabilities.setCapability("platformVersion", "8.0");
//        desiredCapabilities.setCapability("app", "/bitrise/deploy/app-debug.apk");
        desiredCapabilities.setCapability("app", "/Users/rrblanch-incomm/Incomm/Android-WL-Pay-it-Here/app/build/outputs/apk/debug/app-debug.apk");
        desiredCapabilities.setCapability("deviceName", "Android Emulator");
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        MobileElement el1 = (MobileElement) driver.findElementById("com.incomm.payithere:id/skip_btn");
        if (el1 != null) {
            el1.click();
        }
    }

    @Test
    public void VDMOBCreatePaymentSlipTest() {
        String accountNumber = "56139025378326";
        String paymentSlipAmount = "445";

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el1 = (MobileElement) driver.findElementById("com.incomm.payithere:id/login_sign_in_bt");
        el1.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]");
        el2.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el3 = (MobileElement) driver.findElementById("com.incomm.payithere:id/categories_text_view");
        el3.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[6]");
        el4.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el5 = (MobileElement) driver.findElementById("com.incomm.payithere:id/feature_row_title");
        el5.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el6 = (MobileElement) driver.findElementById("com.incomm.payithere:id/select_payment_fee_container");
        el6.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText");
        el7.sendKeys(accountNumber);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText");
        el8.sendKeys(accountNumber);
        driver.hideKeyboard();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el9 = (MobileElement) driver.findElementById("com.incomm.payithere:id/global_big_button");
        el9.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el10 = (MobileElement) driver.findElementById("com.incomm.payithere:id/button_accept");
        el10.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el11 = (MobileElement) driver.findElementById("com.incomm.payithere:id/enter_amount_et");
        el11.sendKeys(paymentSlipAmount);
        driver.hideKeyboard();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el12 = (MobileElement) driver.findElementById("com.incomm.payithere:id/create_payment_button");
        el12.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el13 = (MobileElement) driver.findElementById("com.incomm.payithere:id/save_for_later_link_tv");
        el13.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView\n");
        System.out.println("Element: " + el14);
        System.out.println("Value: " + paymentSlipAmount);
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}



