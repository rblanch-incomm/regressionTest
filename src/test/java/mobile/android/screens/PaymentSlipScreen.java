package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PaymentSlipScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.payithere:id/payment_amount_tv")
    public WebElement slipAmountTV;

    @AndroidFindBy(id = "com.incomm.payithere:id/save_for_later_link_tv")
    public WebElement saveButton;

    public PaymentSlipScreen(AppiumDriver driver) {
        super(driver);
    }
}
