import driver.DriverManagerFactory;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    AppiumDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverManagerFactory.getManager().getDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
