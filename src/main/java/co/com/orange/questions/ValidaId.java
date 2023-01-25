package co.com.orange.questions;

import co.com.orange.userinterface.PimUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class ValidaId implements Question<Boolean> {
    private final String id;


    public ValidaId(String id) {
        this.id = id;
    }

    public static ValidaId consulta(String id) {
        return new ValidaId(id);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean validacion = false;
        String response = Text.of(PimUI.ID_TXT).viewedBy(actor).asString();

        WebDriver driver = getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");


        if (id.equals(response)) {
            validacion = true;
        }
        return validacion;
    }
}
