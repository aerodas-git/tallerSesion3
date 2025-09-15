package control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBox extends ControlBase {

    public TextBox(By locator, String nameControl) {
        super(locator, nameControl);
    }

    public void setText(String value) {
        findControl();
        control.clear();
        control.sendKeys(value);
        this.allureStep("- Set text '" + value + "' on " + nameControl);

    }

    public void setTextEnter(String value) {
        findControl();
        control.clear();
        control.sendKeys(value + Keys.ENTER);
    }
}