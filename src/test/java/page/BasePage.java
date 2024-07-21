package page;

import helper.browser.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends BrowserDriver {

    /**
     * Clicks on a link identified by its visible text.
     *
     * @param linkText The visible text of the link to click.
     * @throws InterruptedException If the thread is interrupted during sleep.
     */
    public static void clickInLinkByText(String linkText) throws InterruptedException {
        // Verificar que el texto del enlace no sea nulo o vacío
        if (linkText == null || linkText.trim().isEmpty()) {
            throw new IllegalArgumentException("The link text must not be null or empty");
        }

        // Construir el localizador del enlace
        By linkLocator = By.xpath("//a[text()='" + linkText + "'] | //a[@value='" + linkText + "']");

        // Intentar encontrar y hacer clic en el enlace

        // Verificar que el enlace esté visible antes de hacer clic
        if (driver.findElement(linkLocator).isDisplayed()) {
            driver.findElement(linkLocator).click();
        } else {
            throw new IllegalStateException("The link with text '" + linkText + "' is not visible");
        }
    }

    /**
     * Clicks on an Input identified by its visible text.
     *
     * @param inputText The visible text of the link to click.
     * @throws InterruptedException If the thread is interrupted during sleep.
     */
    public static void clickInInputByText(String inputText) throws InterruptedException {
        // Verificar que el texto del enlace no sea nulo o vacío
        if (inputText == null || inputText.trim().isEmpty()) {
            throw new IllegalArgumentException("The input text must not be null or empty");
        }

        // Construir el localizador del enlace
        By linkLocator = By.xpath("//input[text()='" + inputText + "'] | //input[@value='" + inputText + "']");

        // Intentar encontrar y hacer clic en el enlace

        // Verificar que el enlace esté visible antes de hacer clic
        if (driver.findElement(linkLocator).isDisplayed()) {
            driver.findElement(linkLocator).click();
        } else {
            throw new IllegalStateException("The input with text '" + inputText + "' is not visible");
        }
    }

    /**
     * Verify that the success message is present on the page.
     *
     * @param message The expected success message.
     * @param timeout The maximum time in seconds to wait for the message to appear.
     * @throws InterruptedException If the thread is interrupted while waiting.
     */
    public static void verifySuccessMessage(String message, int timeout) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(timeout + 5000L));

        try {
            WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'" + message + "')]")));
            if (messageElement == null) {
                throw new AssertionError("Message with text '" + message + "' was not found.");
            }
        } catch (Exception e) {
            throw new AssertionError("Message with text '" + message + "' was not found within the timeout period.", e);
        }
    }

    public static void sendKeysByLocator(By locator, String message) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(message);
    }

    public static void clickByLocator(By locator) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000L));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }
}
