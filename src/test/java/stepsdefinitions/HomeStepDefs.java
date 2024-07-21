package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.es.Cuando;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static page.BasePage.*;
import static page.HomePage.*;

public class HomeStepDefs {
    private Scenario scenario;

    @Before(order = 1)
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("estoy en la pagina de parabank")
    public void estoyEnLaPáginaDeParabank() throws InterruptedException {
        open_parabank();
        screenShot();
    }

    @Cuando("hago clic en el enlace {string}")
    public void hagoClicEnElEnlace(String arg0) throws InterruptedException {
        clickInLinkByText(arg0);
        screenShot();
    }

    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
}
