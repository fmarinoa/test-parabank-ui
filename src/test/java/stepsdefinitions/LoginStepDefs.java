package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static page.LoginPage.*;
import static page.BasePage.*;

public class LoginStepDefs {
    private Scenario scenario;


    @Before(order = 1)
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Cuando("cierro sesión para probar la cuenta que acabo de crear")
    public void cierroSesiónParaProbarLaCuentaQueAcaboDeCrear() throws InterruptedException {
        clickInLinkByText("Log Out");
        screenShot();
    }

    @E("inicio sesión con la cuenta que acabo de crear")
    public void inicioSesiónConLaCuentaQueAcaboDeCrear() throws InterruptedException {
        sendRandomUsername();
        sendRandomPassword();
        screenShot();
        clickLogin();
    }

    @Entonces("valido haber iniciado sesión exitosamente")
    public void vaidoHaberIniciadoSesiónExitosamente() throws InterruptedException {
        validateRandomUserSession();
        screenShot();
    }

    @Cuando("inicio sesión con con el usuario {string} y contraseña {string}")
    public void inicioSesiónConConElUsuarioYContraseña(String arg0, String arg1) throws InterruptedException {
        sendUsername(arg0);
        sendPassword(arg1);
        screenShot();
        clickLogin();
    }

    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
}
