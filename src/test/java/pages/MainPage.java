package pages;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainPage {

    public Button loginButton =new Button(By.xpath("//a[contains(@href,'login') and @class='_text_13cob_1 _minor-base_13cob_145 _button_1doy8_1 _quaternary_1doy8_206']"),"[Login] button in Main page");

}
