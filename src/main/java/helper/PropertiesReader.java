package helper;

import constants.GlobalData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static final Logger logger = LogManager.getLogger(PropertiesReader.class.getName());
    public static String getProperty(String propertyName) {
        Properties property = new Properties();

        try (FileInputStream fis = new FileInputStream(GlobalData.PATH_PROPERTIES)) {
            property.load(fis);
            return property.getProperty(propertyName);
        } catch (IOException e) {
            logger.error("Error: File is not found or it not available or something wrong with reading file!");
            throw new UnsupportedOperationException("Error reading property: " + propertyName);
        }
    }
}
