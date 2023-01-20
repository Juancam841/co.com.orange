package co.com.orange.tasks;

import co.com.orange.interactions.Ingresar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class Loguearse implements Task {
    private final String user;
    private final String pass;

    public Loguearse(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static Loguearse enter(String user, String pass) {
        return Tasks.instrumented(Loguearse.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ingresar.datos(user, pass)
        );
    }
}
