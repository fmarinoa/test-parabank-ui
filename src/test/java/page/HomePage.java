package page;

import helper.browser.BrowserDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BrowserDriver {

    public static void open_parabank() throws InterruptedException {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
    }
}
