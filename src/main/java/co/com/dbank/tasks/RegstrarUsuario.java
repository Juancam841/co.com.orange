package co.com.dbank.tasks;

import co.com.dbank.interactions.IngresarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class RegstrarUsuario implements Task {


    public static RegstrarUsuario ejecutar() {
        return Tasks.instrumented(RegstrarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarRegistro.ejecutar()
        );
    }
}
