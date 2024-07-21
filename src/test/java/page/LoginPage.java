package page;

import helper.browser.BrowserDriver;
import helper.data.SharedContext;
import org.openqa.selenium.By;

import static page.BasePage.*;
import static page.BasePage.verifySuccessMessage;

public class LoginPage extends BrowserDriver {


    private static By txtUsername = By.xpath("//form[@name='login']/div/input[@name='username']");
    private static By txtPassword = By.xpath("//form[@name='login']/div/input[@name='password']");
    private static By btnLogin = By.xpath("//form[@name='login']/div/input[@value='Log In']");

    public static void sendUsername() throws InterruptedException {
        sendKeysByLocator(txtUsername, SharedContext.getUsername());
    }

    public static void sendPassword() throws InterruptedException {
        sendKeysByLocator(txtPassword, SharedContext.getPassword());
    }

    public static void clickLogin() throws InterruptedException {
        clickByLocator(btnLogin);
    }

    public static void validateSession() throws InterruptedException {
        verifySuccessMessage("Welcome", 5);
        verifySuccessMessage(SharedContext.getFullname(), 5);
    }
}
