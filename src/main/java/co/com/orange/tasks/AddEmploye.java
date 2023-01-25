package co.com.orange.tasks;

import co.com.orange.interactions.AddEmployeInter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;

public class AddEmploye implements Task {
    private final String first;
    private final String last;
    private final  String id;

    public AddEmploye(String first, String last, String id) {
        this.first = first;
        this.last = last;
        this.id = id;
    }

    public static AddEmploye crear(String first, String last, String id) {
        return Tasks.instrumented(AddEmploye.class, first, last, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().
                attemptsTo(AddEmployeInter.crear(first, last, id));
    }
}
