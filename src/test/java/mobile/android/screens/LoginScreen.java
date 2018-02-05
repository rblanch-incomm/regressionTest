package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.payithere:id/appbar")
    public WebElement appBar;

    @AndroidFindBy(id = "com.incomm.payithere:id/login_sign_in_bt")
    public MobileElement logInButton;

    public LoginScreen(AppiumDriver driver) {
        super(driver);
//        logInButton = (MobileElement) driver.findElementById("com.incomm.payithere:id/login_sign_in_bt");

    }
}
