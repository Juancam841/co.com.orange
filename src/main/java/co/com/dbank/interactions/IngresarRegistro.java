package co.com.dbank.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromElement;


import java.util.Objects;

import static co.com.dbank.model.TestData.getData;
import static co.com.dbank.userinterface.RegistroUi.*;


public class IngresarRegistro implements Interaction {


    public static IngresarRegistro ejecutar() {
        return Tasks.instrumented(IngresarRegistro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SIGNUP_BUTTON),
                SelectFromOptions.byVisibleText(getData().get("title").toString()).from(TITLE_SELECT),
                Enter.theValue(getData().get("first_name").toString()).into(FIRTS_INPUT),
                Enter.theValue(getData().get("last_name").toString()).into(LAST_INPUT),
                Enter.theValue(getData().get("date_birth").toString()).into(DOB_INPUT),
                Enter.theValue(getData().get("social").toString()).into(SS_INPUT),
                Enter.theValue(getData().get("email").toString()).into(EMAIL_INPUT),
                Enter.theValue(getData().get("pass").toString()).into(PASS_INPUT),
                Enter.theValue(getData().get("pass").toString()).into(CONFIRMPASS_INPUT)
        );

        if (Objects.equals(getData().get("gender").toString(), "M")) {
            actor.attemptsTo(
                    Click.on(GENDERM_CHECK)
            );
        } else {
            actor.attemptsTo(
                    Click.on(GENDERF_CHECK));
        }
        actor.attemptsTo(
                Click.on(NEXT_BUTTON)
        );

    }
}
