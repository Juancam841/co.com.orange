package co.com.orange.tasks;

import co.com.orange.userinterface.OrangePage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task {
    private  OrangePage orangePage;


    public static Abrir explorador() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(orangePage)
        );

    }
}
