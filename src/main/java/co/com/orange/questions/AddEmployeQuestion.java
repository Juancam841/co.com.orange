package co.com.orange.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static co.com.orange.userinterface.PimUI.NAME_TXT;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AddEmployeQuestion implements Question<Boolean> {
    private final String name;

    public AddEmployeQuestion(String name) {
        this.name = name;
    }

    public static AddEmployeQuestion consultar(String name) {
        return new AddEmployeQuestion(name);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resp = false;
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 6);


        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6")));
            String valida = Text.of(NAME_TXT).viewedBy(actor).asString();
            if (valida.equals(name)) {
                resp = true;
            }
            return resp;
        } catch (Exception e) {
            System.out.println(e);
        }

        return resp;
    }
}
