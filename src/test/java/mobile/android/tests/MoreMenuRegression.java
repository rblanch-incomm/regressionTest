package mobile.android.tests;

import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class MoreMenuRegression extends AbstractTest{

//    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("platformVersion", "8.1");
////        desiredCapabilities.setCapability("platformVersion", "8.0");
////        desiredCapabilities.setCapability("app", "/bitrise/deploy/app-debug.apk");
//        desiredCapabilities.setCapability("app", "/Users/rrblanch-incomm/Incomm/Android-WL-Pay-it-Here/app/build/outputs/apk/debug/app-debug.apk");
//        desiredCapabilities.setCapability("deviceName", "Android Emulator");
//        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
//
//        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
//
//
//
//
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        MobileElement el1 = (MobileElement) driver.findElementById("com.incomm.payithere:id/skip_btn");
//        if (el1 != null) {
//            el1.click();
//        }
    }

    @Test
    public void sampleTest() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.gettingStartedScreen().skip.click();
        app.loginScreen().logInButton.click();
        app.navigationBarScreen().moreNavigation3.click();
        app.moreMenuScreen().helpCell.click();
        app.helpScreen().aboutCell.click();
        app.navigationBarScreen().navigateUp.click();
        app.navigationBarScreen().navigateUp.click();
        app.moreMenuScreen().faqsCell.click();
        app.faqScreen().firstItem.click();
        app.navigationBarScreen().navigateUp.click();
        app.navigationBarScreen().navigateUp.click();
        app.moreMenuScreen().learnMoreCell.click();
        app.navigationBarScreen().navigateUp.click();
        app.moreMenuScreen().logoutButton.click();

        Assert.assertNotNull(app.loginScreen().appBar);


//        MobileElement el1 = (MobileElement) driver.findElementById("com.incomm.payithere:id/login_sign_in_bt");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]");
//        el2.click();

//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]");
//        el3.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.LinearLayout");
//        el4.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
//        el5.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
//        el6.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]");
//        el7.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]");
//        el8.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
//        el9.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
//        el10.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[6]");
//        el11.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
//        el12.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        MobileElement el13 = (MobileElement) driver.findElementById("com.incomm.payithere:id/global_big_button");
//        el13.click();
    }
}
