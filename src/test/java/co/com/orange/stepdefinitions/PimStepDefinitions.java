package co.com.orange.stepdefinitions;

import co.com.orange.tasks.Abrir;
import co.com.orange.tasks.EmployeeList;
import co.com.orange.tasks.Pim;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class PimStepDefinitions {


    @When("Consulto parametros {word}")
    public void consulto_parametros(String employee) {
        OnStage.theActorCalled("User").
                attemptsTo(Pim.Ingresar());
        OnStage.theActorInTheSpotlight().
                attemptsTo(EmployeeList.consultar(employee));

    }
    @Then("Se muestran los resultados")
    public void se_muestran_los_resultados() {

    }
}
