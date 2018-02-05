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

}
