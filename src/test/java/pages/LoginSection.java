package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

    public TextBox emailTextBox = new TextBox(By.id("element-0"), "[Email] textbox in Login section");
    public TextBox passwordTextBox = new TextBox(By.id("element-2"),"[Password] textbox in Login section" );
    public Button loginButton = new Button(By.xpath("//button[@class='_19abae45 _8c75067a aKaSZdu _zZFdxj _3930afa0 _7ea1378e _2d084671']"), "[Login] button in Login section");
}