package driver;

import helper.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import java.time.Duration;
import static constants.GlobalData.WAIT_TIMEOUT;
import static driver.DriverManagerFactory.createUrl;

public class AndroidManager extends DriverManager{
    @Override
    public void createDriver() {
        capabilities.setCapability("deviceName", "android");
        capabilities.setCapability("platformName", PropertiesReader.getProperty("platformNameA"));
        capabilities.setCapability("automationName", PropertiesReader.getProperty("automationNameA"));
        capabilities.setCapability("platformVersion", PropertiesReader.getProperty("platformVersionA"));

        driver = new AndroidDriver(createUrl(), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIMEOUT));
    }
}
