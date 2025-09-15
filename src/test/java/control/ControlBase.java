package control;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

public class ControlBase {

    protected By locator;
    protected WebElement control;
    protected String nameControl;

    public ControlBase(By locator, String nameControl){

        this.locator=locator;
        this.nameControl=nameControl;
    }

    @Step("{0}")
    public void allureStep(String action){}

    protected void findControl(){
        control = Session.getInstance().getBrowser().findElement(locator);
    }

    //Acciones comunes de un control: click, si es mostrado o no, recuperar texto

    public void click(){
        findControl();
        control.click();
        this.allureStep("- Click on "+nameControl);

    }

    public boolean isControlDisplayed(){
        this.allureStep("- Is Control "+nameControl+" Displayed? "+
                (Session.getInstance().getBrowser().findElements(locator).size() == 1));
        return Session.getInstance().getBrowser().findElements(locator).size() == 1;
    }

    public void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            throw new RuntimeException(exception);
        }
    }




}
