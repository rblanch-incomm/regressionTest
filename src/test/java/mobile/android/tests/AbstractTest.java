package mobile.android.tests;

import io.appium.java_client.AppiumDriver;
import mobile.android.PayItHere;
import mobile.android.utilities.AppiumDriverBuilder;
import org.junit.Before;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    protected AppiumDriver driver;
    protected PayItHere app;

    @Before
    public void connect() throws MalformedURLException {
        this.driver = AppiumDriverBuilder.forAndroid().build();
        app = new PayItHere(driver);
    }
}
