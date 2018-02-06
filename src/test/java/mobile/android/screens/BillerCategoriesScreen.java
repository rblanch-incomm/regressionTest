package mobile.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class BillerCategoriesScreen extends AbstractScreen {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.TextView")
    public WebElement tvBillers;

    @AndroidFindBy(id = "com.incomm.payithere:id/feature_row_title")
    public WebElement comcastBiller;

    public BillerCategoriesScreen(AppiumDriver driver) {
        super(driver);
    }
}
