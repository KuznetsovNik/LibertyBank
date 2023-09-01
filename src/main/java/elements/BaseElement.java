package elements;

import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
public class BaseElement {

    private WebElement webElement;

    public BaseElement() {
    }
}
