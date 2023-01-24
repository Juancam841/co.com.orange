package co.com.orange.stepdefinitions;

import co.com.orange.questions.Pregunta;
import co.com.orange.tasks.Loguearse;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginStepDefinitions {

    @When("Utilizo mis datos de acceso {word} {word}")
    public void utilizo_mis_datos_de_acceso(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Loguearse.enter(user, pass)
        );
    }

    @Then("Accedo a mi cuenta {word} {word}")
    public void accedo_a_mi_cuenta(String id, String id1) {

        String nuevoid = id + " " + id1;
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Pregunta.hacia(nuevoid))
        );

    }
}
