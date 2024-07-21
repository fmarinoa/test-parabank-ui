package stepsdefinitions;

import helper.data.SharedContext;
import helper.data.UserData;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import page.RegisterPage;

import static page.BasePage.*;

public class RegisterStepDefs {
    private Scenario scenario;
    private RegisterPage registerPage;

    @Before
    public void setUp() {
        UserData userData = new UserData();
        SharedContext.setUserData(userData);
        registerPage = new RegisterPage(userData);
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Y("lleno el formulario de registro con información aleatoria")
    public void llenoElFormularioDeRegistroConInformaciónAleatoria() throws InterruptedException {
        registerPage.sendKeysRandomForRegister();
        screenShot();
    }

    @Y("hago clic en el botón {string}")
    public void hagoClicEnElBotón(String arg0) throws InterruptedException {
        clickInInputByText(arg0);
    }

    @Entonces("debería ver el mensaje de éxito {string}")
    public void deberíaVerElMensajeDeÉxito(String arg0) throws InterruptedException {
        verifySuccessMessage(arg0, 5);
        screenShot();
    }

    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
}
