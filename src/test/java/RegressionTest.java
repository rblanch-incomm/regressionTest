import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class RegressionTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "8.1");
        desiredCapabilities.setCapability("app", "/Volumes/UUI/Projects/MyApplication2/app/build/outputs/apk/debug/app-debug.apk");
        desiredCapabilities.setCapability("deviceName", "Android Emulator");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.example.rrblanch_incomm.myapplication:id/next_view_btn");
        el1.click();
        MobileElement text1 = (MobileElement) driver.findElementById("com.example.rrblanch_incomm.myapplication:id/passed_text_tv");
        assertEquals(text1.getText(), "pass me");
    }

    @Test
    public void sampleTest2() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.example.rrblanch_incomm.myapplication:id/edit_text_et");
        el1.sendKeys("defaulted");
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.rrblanch_incomm.myapplication:id/next_view_btn");
        driver.hideKeyboard();
        el2.click();
        MobileElement text1 = (MobileElement) driver.findElementById("com.example.rrblanch_incomm.myapplication:id/passed_text_tv");
        assertEquals(text1.getText(), "defaulted");
    }

    @Test
    public void shouldFail() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.example.rrblanch_incomm.myapplication:id/edit_text_et");
        el1.sendKeys("defaulted");
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.rrblanch_incomm.myapplication:id/next_view_btn");
        driver.hideKeyboard();
        el2.click();
        MobileElement text1 = (MobileElement) driver.findElementById("com.example.rrblanch_incomm.myapplication:id/passed_text_tv");
        assertEquals(text1.getText(), "defaultede");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
