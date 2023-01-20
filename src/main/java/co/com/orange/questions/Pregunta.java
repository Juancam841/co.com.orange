package co.com.orange.questions;

import co.com.orange.userinterface.Dashboard2UI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Pregunta implements Question<Boolean> {
    private String resp;

    public Pregunta(String resp) {
        this.resp = resp;
    }

    public static Pregunta hacia(String resp) {
        return new Pregunta(resp);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean validacion = false;
        String response = Text.of(Dashboard2UI.EMPLOYID_TEXTB_2).viewedBy(actor).asString();

        if (resp.equals(response)) {
            validacion = true;
        }
        return validacion;
    }


}

