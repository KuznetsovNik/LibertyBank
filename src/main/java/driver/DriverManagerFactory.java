package driver;

import constants.GlobalData;
import helper.PropertiesReader;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManagerFactory {

    public enum DriverType {
        ANDROID,
        IOS
    }

    public static DriverManager getManager() {

        DriverManager driverManager;

        DriverType type = DriverType.valueOf(PropertiesReader.getProperty("driver").toUpperCase());

        if (type == DriverType.ANDROID) {
            driverManager = new AndroidManager();
        } else {
            driverManager = new IphoneManager();
        }
        return driverManager;
    }

    public static URL createUrl() {
        try {
            return new URL(GlobalData.BASE_URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new UnsupportedOperationException("Can't create URL with this parameter: " + GlobalData.BASE_URL);
        }
    }
}
