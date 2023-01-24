package co.com.orange.tasks;

import co.com.orange.interactions.IngresarEmployeeList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;

public class EmployeeList implements Task {
    private final String employee;

    public EmployeeList(String employee){
        this.employee=employee;
    }

    public static EmployeeList consultar(String employee) {
        return Tasks.instrumented(EmployeeList.class, employee);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarEmployeeList.consultar(employee)
        );
    }
}
