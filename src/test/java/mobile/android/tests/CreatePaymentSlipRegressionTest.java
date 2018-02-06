package mobile.android.tests;

import mobile.android.utilities.RNG;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class CreatePaymentSlipRegressionTest extends AbstractTest{

    @Test
    public void VDMOBCreatePaymentSlipTest() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        if (app.gettingStartedScreen().skip != null) {
            app.gettingStartedScreen().skip.click();
        }

        String accountNumber = "56139025378326";
        String paymentSlipAmount = RNG.generate();

        app.loginScreen().logInButton.click();
        app.navigationBarScreen().navigationItem2.click();
        app.newPaymentSlipScreen().findBillerByCategory.click();
        app.billerCategoriesScreen().tvBillers.click();
        app.billerCategoriesScreen().comcastBiller.click();
        app.billerFeeSelectionScreen().firstFee.click();
        app.enterAccountScreen().enterAccountNumberET.sendKeys(accountNumber);
        app.enterAccountScreen().confirmAccountNumberET.sendKeys(accountNumber);
        driver.hideKeyboard();
        app.enterAccountScreen().submitButton.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        app.confirmAccountScreen().acceptButton.click();
        app.enterPaymentAmountScreen().enterPaymentAmountET.sendKeys(paymentSlipAmount);
        driver.hideKeyboard();
        app.enterPaymentAmountScreen().createSlipButton.click();
        app.paymentSlipScreen().saveButton.click();
    }
}



