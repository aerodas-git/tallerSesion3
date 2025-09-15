package pages;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MenuSection {

    //public Button logoutButton = new Button(By.xpath("//span[text()='Cerrar sesión']") );
    public Button configurationButton = new Button(By.xpath("//button[@id=':r0:']"), "[Menu] button configuration in Menu section");
    public Button addTareaButton = new Button(By.xpath("//button[@class='_19abae45 _56a651f6 e7RD0jj _3930afa0 aa19cb97 _7246d092']"), "[Add Task] button task in Menu section");

    public Label labelTask = new Label(By.xpath("//div[@class='a83bd4e0 _6a3e5ade _19abae45']"),"[List task] label in Menu section");

}
