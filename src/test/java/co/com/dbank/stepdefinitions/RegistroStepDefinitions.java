package co.com.dbank.stepdefinitions;

import co.com.dbank.questions.Respuesta;
import co.com.dbank.tasks.Cargar;
import co.com.dbank.tasks.RegstrarUsuario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class RegistroStepDefinitions {


    @When("Me registro con todos los datos")
    public void me_registro_con_todos_los_datos(List<Map<String, String>> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Cargar.datos(data.get(0)),
                RegstrarUsuario.ejecutar()
        );
    }

    @Then("La cuenta se crea con sus credenciales {int}")
    public void la_cuenta_se_crea_con_sus_credenciales(int resp) {
        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.seeThat(Respuesta.hacia(resp)));
    }

}
