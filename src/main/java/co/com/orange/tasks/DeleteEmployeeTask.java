package co.com.orange.tasks;

import co.com.orange.interactions.DeleteEmployeeInter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;

public class DeleteEmployeeTask implements Task {
    private final String id;

    public DeleteEmployeeTask(String id) {
        this.id = id;
    }

    public static DeleteEmployeeTask ejecutar(String id) {
        return Tasks.instrumented(DeleteEmployeeTask.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().
                attemptsTo(DeleteEmployeeInter.ejecutar(id));
    }
}
