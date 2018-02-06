package mobile.android.tests;

import org.junit.Test;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class MoreMenuRegressionTest extends AbstractTest{

    @Test
    public void navigateMoreMenu() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        if (app.gettingStartedScreen().skip != null) {
            app.gettingStartedScreen().skip.click();
        }

        app.loginScreen().logInButton.click();
        app.navigationBarScreen().navigationItem3.click();
        app.moreMenuScreen().helpCell.click();
        app.helpScreen().aboutCell.click();
        app.navigationBarScreen().navigateUp.click();
        app.navigationBarScreen().navigateUp.click();
        app.moreMenuScreen().faqsCell.click();
        app.faqScreen().firstItem.click();
        app.navigationBarScreen().navigateUp.click();
        app.navigationBarScreen().navigateUp.click();
        app.moreMenuScreen().learnMoreCell.click();
        app.navigationBarScreen().navigateUp.click();
        app.moreMenuScreen().logoutButton.click();

        Assert.assertNotNull(app.loginScreen().appBar);
    }
}
