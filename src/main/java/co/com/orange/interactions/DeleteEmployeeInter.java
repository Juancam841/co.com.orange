package co.com.orange.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static co.com.orange.userinterface.PimUI.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class DeleteEmployeeInter implements Interaction {
    private final String id;

    public DeleteEmployeeInter(String id) {
        this.id = id;
    }

    public static DeleteEmployeeInter ejecutar(String id) {
        return Tasks.instrumented(DeleteEmployeeInter.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(PIM_BUTTON),
                Click.on(EMPLOYEE_BUTTON),
                Enter.theValue(id).into(EMPLOYEEID_TXT),
                Click.on(SEARCH_BUTTON)
        );
        WebDriver driver = getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(DELETE_BUTTON),
                Click.on(CONFIRMDELETE_BUTTON)
        );
    }
}
