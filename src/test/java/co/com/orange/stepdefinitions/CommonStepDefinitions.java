package co.com.orange.stepdefinitions;

import co.com.orange.tasks.Abrir;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;


public class CommonStepDefinitions {

    @Given("Quiero ejecutar transacciones en la plataforma")
    public void quiero_ejecutar_transacciones_en_la_plataforma() {
        OnStage.theActorCalled("User").attemptsTo(
                Abrir.explorador()
        );
    }
}
