package co.com.orange.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.orange.userinterface.PimUI.EMPLOYEEID_TXT;

public class IngresarEmployeeList implements Interaction {
    public IngresarEmployeeList(String employee) {
        this.employee = employee;
    }

    private final String employee;


    public static IngresarEmployeeList consultar(String employee) {
        return Tasks.instrumented(IngresarEmployeeList.class, employee);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        Enter.theValue(employee).into(EMPLOYEEID_TXT)
                );
    }
}
