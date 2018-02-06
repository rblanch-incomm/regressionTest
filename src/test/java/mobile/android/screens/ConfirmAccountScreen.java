package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ConfirmAccountScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.payithere:id/button_accept")
    public WebElement acceptButton;

    public ConfirmAccountScreen(AppiumDriver driver) {
        super(driver);
    }
}
