package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class EnterPaymentAmountScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.payithere:id/enter_amount_et")
    public WebElement enterPaymentAmountET;

    @AndroidFindBy(id = "com.incomm.payithere:id/create_payment_button")
    public WebElement createSlipButton;

    public EnterPaymentAmountScreen(AppiumDriver driver) {
        super(driver);
    }
}
