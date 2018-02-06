package mobile.android;

import io.appium.java_client.AppiumDriver;
import mobile.android.screens.*;

public class PayItHere {
    private final AppiumDriver driver;

    public PayItHere(AppiumDriver driver) {
        this.driver = driver;
    }

    public GettingStartedScreen gettingStartedScreen() {return new GettingStartedScreen(driver);}
    public LoginScreen loginScreen() {return new LoginScreen(driver);}
    public NavigationBarScreen navigationBarScreen() {return new NavigationBarScreen(driver);}
    public MoreMenuScreen moreMenuScreen() {return new MoreMenuScreen(driver);}
    public HelpScreen helpScreen() {return new HelpScreen(driver);}
    public FAQScreen faqScreen() {return new FAQScreen(driver);}
    public NewPaymentSlipScreen newPaymentSlipScreen() {return new NewPaymentSlipScreen(driver);}
    public BillerCategoriesScreen billerCategoriesScreen() {return new BillerCategoriesScreen(driver);}
    public BillerFeeSelectionScreen billerFeeSelectionScreen() {return new BillerFeeSelectionScreen(driver);}
    public EnterAccountScreen enterAccountScreen() {return new EnterAccountScreen(driver);}
    public ConfirmAccountScreen confirmAccountScreen() {return new ConfirmAccountScreen(driver);}
    public EnterPaymentAmountScreen enterPaymentAmountScreen() {return new EnterPaymentAmountScreen(driver);}
    public PaymentSlipScreen paymentSlipScreen() {return new PaymentSlipScreen(driver);}
}
