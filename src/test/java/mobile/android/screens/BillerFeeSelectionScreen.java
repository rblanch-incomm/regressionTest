package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class BillerFeeSelectionScreen extends AbstractScreen {

    @AndroidFindBy(id = "com.incomm.payithere:id/fee_container")
    public WebElement firstFee;

    public BillerFeeSelectionScreen(AppiumDriver driver) {
        super(driver);
    }
}
