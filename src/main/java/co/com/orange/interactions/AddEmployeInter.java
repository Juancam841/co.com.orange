package co.com.orange.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.orange.userinterface.PimUI.*;

public class AddEmployeInter implements Interaction {
    private final String firts;
    private final String last;
    private final String id;

    public AddEmployeInter(String firts, String last, String id) {
        this.firts = firts;
        this.last = last;
        this.id = id;
    }

    public static AddEmployeInter crear(String first, String last, String id) {
    return Tasks.instrumented(AddEmployeInter.class, first, last, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(ADDEMPLOYEE_BUTTON),
                Enter.theValue(firts).into(FIRST_TXT),
                Enter.theValue(last).into(LAST_TXT),
                Enter.theValue(id).into(IDCREAR_TXT),
                Click.on(SAVE_BUTTON)
        );
    }
}
