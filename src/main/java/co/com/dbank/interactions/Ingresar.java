package co.com.dbank.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.dbank.userinterface.RegistroUi.*;

public class Ingresar implements Interaction {
    private final String user;
    private final String pass;

    public Ingresar(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public static Ingresar datos(String user, String pass) {
    return Tasks.instrumented(Ingresar.class, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(USER_INPUT),
                Enter.theValue(pass).into(PASSLOGIN_INPUT),
                Click.on(SUBMIT_BUTTON)
        );
    }
}
