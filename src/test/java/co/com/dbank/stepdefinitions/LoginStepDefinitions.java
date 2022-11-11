package co.com.dbank.stepdefinitions;

import co.com.dbank.tasks.Loguearse;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginStepDefinitions {

    @When("Utilizo mis datos de acceso {word} {word}")
    public void utilizo_mis_datos_de_acceso(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Loguearse.enter(user, pass)
        );
    }

    @Then("Accedo a mi cuenta")
    public void accedo_a_mi_cuenta() {

    }
}
