package driver;

import helper.PropertiesReader;
import io.appium.java_client.ios.IOSDriver;
import java.time.Duration;
import static constants.GlobalData.WAIT_TIMEOUT;
import static driver.DriverManagerFactory.createUrl;

public class IphoneManager extends DriverManager{
    @Override
    protected void createDriver() {
        capabilities.setCapability("deviceName", "iphone");
        capabilities.setCapability("platformName", PropertiesReader.getProperty("platformNameI"));
        capabilities.setCapability("automationName", PropertiesReader.getProperty("automationNameI"));
        capabilities.setCapability("platformVersion", PropertiesReader.getProperty("platformVersionA"));

        driver = new IOSDriver(createUrl(), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIMEOUT));
    }
}
