package page;

import helper.browser.BrowserDriver;
import helper.data.UserData;
import org.openqa.selenium.By;

import static page.BasePage.*;

public class RegisterPage extends BrowserDriver {
    private UserData userData;

    public RegisterPage(UserData userData) {
        this.userData = userData;
    }

    private static By txtFirstName = By.xpath("//input[@id='customer.firstName']");
    private static By txtLastName = By.xpath("//input[@id='customer.lastName']");
    private static By txtAddress = By.xpath("//input[@id='customer.address.street']");
    private static By txtCity = By.xpath("//input[@id='customer.address.city']");
    private static By txtState = By.xpath("//input[@id='customer.address.state']");
    private static By txtZipCode = By.xpath("//input[@id='customer.address.zipCode']");
    private static By txtPhone = By.xpath("//input[@id='customer.phoneNumber']");
    private static By txtSSN = By.xpath("//input[@id='customer.ssn']");
    private static By txtUsername = By.xpath("//input[@id='customer.username']");
    private static By txtPassword = By.xpath("//input[@id='customer.password']");
    private static By txtConfirm = By.xpath("//input[@id='repeatedPassword']");

    public void sendKeysRandomForRegister() throws InterruptedException {
        sendKeysByLocator(txtFirstName, userData.getFirstName());
        sendKeysByLocator(txtLastName, userData.getLastName());
        sendKeysByLocator(txtAddress, userData.getAddress());
        sendKeysByLocator(txtCity, userData.getCity());
        sendKeysByLocator(txtState, userData.getState());
        sendKeysByLocator(txtZipCode, userData.getZipCode());
        sendKeysByLocator(txtPhone, userData.getPhone());
        sendKeysByLocator(txtSSN, userData.getSsn());
        sendKeysByLocator(txtUsername, userData.getUsername());
        System.out.println("New username: " + userData.getUsername());
        sendKeysByLocator(txtPassword, userData.getPassword());
        sendKeysByLocator(txtConfirm, userData.getPassword());
        System.out.println("New password: " + userData.getPassword());
    }

}

