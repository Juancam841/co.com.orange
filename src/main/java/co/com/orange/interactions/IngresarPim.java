package co.com.orange.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.orange.userinterface.PimUI.PIM_BUTTON;

public class IngresarPim implements Interaction {
    public static IngresarPim click() {
        return Tasks.instrumented(IngresarPim.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PIM_BUTTON)
        );
    }
}
