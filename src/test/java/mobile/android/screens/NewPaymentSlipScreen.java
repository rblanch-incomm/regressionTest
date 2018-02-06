package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NewPaymentSlipScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.payithere:id/categories_text_view")
    public WebElement findBillerByCategory;

    public NewPaymentSlipScreen(AppiumDriver driver) {
        super(driver);
    }

}
