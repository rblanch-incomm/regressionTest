package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class GettingStartedScreen extends AbstractScreen {
    public WebElement skip;

    public GettingStartedScreen(AppiumDriver driver) {
        super(driver);
        skip = (WebElement) driver.findElementById("com.incomm.payithere:id/skip_btn");
    }
}
