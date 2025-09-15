package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginSection;
import pages.MainPage;
import pages.MenuSection;
import singletonSession.Session;

import java.time.Duration;

public class LoginTest {
    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();
    MenuSection menuSection = new MenuSection();


    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://www.todoist.com/");

    }


    @Test
    @Epic("Authentication")
    @Feature("Login")
    @Story("IMP123 Login0")
    @DisplayName("Login Successfully Test")
    @Description("This test case is to verify that a user can log in successfully with valid credentials.")
    @Link(name="jira.com/TC666",url="https://jira.com/TC666")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("jira.com/BUG666")
    public void loginExitoso() {
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("arodasp@gmail.com");
        //System.out.println("*** ingresa usuario");
        loginSection.passwordTextBox.setText("Jb123456");
        //System.out.println("*** ingresa password");
        loginSection.loginButton.click();
        //System.out.println("*** click boton");
        //System.out.println("*****************");


        Assertions.assertTrue(menuSection.configurationButton.isControlDisplayed(),"ERROR! The user is not logged in");

    }


    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }



}
