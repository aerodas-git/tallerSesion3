package pages;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class TareaSection {

    public TextBox nameTextBox = new TextBox(By.xpath("//div[@class='_HPVkMs no-focus-marker wlHEp3M']/div"), "[Task] textbox in Task section");
    public TextBox descriptionTextBox = new TextBox(By.xpath("//div[@class='_HPVkMs task_editor__description_field no-focus-marker']/div"),"[Task description] textbox in Task section");
    public Button okAddButton = new Button(By.xpath("//button[contains(@class,'_19abae45 _56a651f6 _3930afa0 _7ea1378e _7246d092')]"),"[Add Button] button in Tarea section");



}
