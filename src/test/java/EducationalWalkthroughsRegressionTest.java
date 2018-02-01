import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class EducationalWalkthroughsRegressionTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "8.1");
//        desiredCapabilities.setCapability("app", "/bitrise/deploy/app-debug.apk");
        desiredCapabilities.setCapability("app", "/Users/rrblanch-incomm/Incomm/Android-WL-Pay-it-Here/app/build/outputs/apk/debug/app-debug.apk");
        desiredCapabilities.setCapability("deviceName", "Android Emulator");
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void VDMOBFirstLoginTest() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("walk_through_fragment_container")));
        String activity = ((AndroidDriver<MobileElement>) driver).currentActivity();
//        System.out.println("ACTIVITY_HERE" + activity);
        if (activity.contains("EducationalActivity")) {
            (new TouchAction(driver))
                .press(1295, 635)
                .moveTo(-1181, 5)
                .release()
                .perform();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            (new TouchAction(driver))
                    .press(1295, 635)
                    .moveTo(-1181, 5)
                    .release()
                    .perform();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            (new TouchAction(driver))
                    .press(1295, 635)
                    .moveTo(-1181, 5)
                    .release()
                    .perform();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            MobileElement el1 = (MobileElement) driver.findElementById("com.incomm.payithere:id/global_big_button");
            el1.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            activity = ((AndroidDriver<MobileElement>) driver).currentActivity();
            assertEquals(activity, ".views.login.LoginActivity");
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
