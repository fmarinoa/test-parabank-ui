package page;

import helper.browser.BrowserDriver;
import org.openqa.selenium.By;

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
        By linkLocator = By.xpath("//a[text()='" + linkText + "']");

        // Intentar encontrar y hacer clic en el enlace

        // Verificar que el enlace esté visible antes de hacer clic
        if (driver.findElement(linkLocator).isDisplayed()) {
            driver.findElement(linkLocator).click();
        } else {
            throw new IllegalStateException("The link with text '" + linkText + "' is not visible");
        }
    }
}
