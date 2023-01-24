package co.com.orange.tasks;

import co.com.orange.interactions.IngresarPim;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class Pim implements Task {
    public static Pim Ingresar() {
        return Tasks.instrumented(Pim.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarPim.click()
        );
    }
}
