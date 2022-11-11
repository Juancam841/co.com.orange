package co.com.dbank.questions;

import co.com.dbank.userinterface.RegistroUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Respuesta implements Question<Boolean> {
    private int resp;

    public Respuesta(int resp) {
        this.resp = resp;
    }

    public static Respuesta hacia(int resp) {
        return new Respuesta(resp);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        int titulo = Text.of(RegistroUi.RESPONSE_H1).viewedBy(actor).asInteger();
        if (resp == titulo){
            result = true;
        }else {
            result = false;
        }
        return result;

    }
}
