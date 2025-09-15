package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import pages.LoginSection;
import pages.MainPage;
import pages.MenuSection;
import pages.TareaSection;
import singletonSession.Session;

import java.awt.*;

public class AddTaskTest {

    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();
    MenuSection menuSection = new MenuSection();
    TareaSection tareaSection = new TareaSection();


    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://www.todoist.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

    @Test
    @Epic("Add Task")
    @Feature("Task")
    @Story("IMP123 Task section")
    @DisplayName("Add Task Successfully Test")
    @Description("This test case is to verify that a user can add task in successfully with valid credentials.")
    @Link(name="jira.com/TC667",url="https://jira.com/TC667")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("jira.com/BUG667")
    public void addTaskTest() throws InterruptedException {
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("arodasp@gmail.com");
        //System.out.println("*** ingresa usuario");
        loginSection.passwordTextBox.setText("Jb123456");
        //System.out.println("*** ingresa password");
        loginSection.loginButton.click();
        //System.out.println("*** click boton login");

        menuSection.addTareaButton.click();
        //System.out.println("*** click boton añadir tarea");
        String taskName = "Task Taller 3";
        tareaSection.descriptionTextBox.click();
        tareaSection.nameTextBox.setText(taskName);
        tareaSection.descriptionTextBox.click();
        tareaSection.descriptionTextBox.setText("Se añade una tarea como test adicional de "+taskName);
        tareaSection.okAddButton.click();
        menuSection.labelTask.pause();


        Assertions.assertTrue(menuSection.labelTask.isControlDisplayed(),"ERROR! Task cannot be added");

    }

}
