package driver;

import helper.PropertiesReader;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class DriverManager {

    protected AppiumDriver driver;
    protected DesiredCapabilities capabilities = new DesiredCapabilities();

    protected abstract void createDriver();

    public AppiumDriver getDriver() {
        if (null == driver) {
            capabilities.setCapability("app", PropertiesReader.getProperty("application"));
            createDriver();
        }
        return driver;
    }
}
