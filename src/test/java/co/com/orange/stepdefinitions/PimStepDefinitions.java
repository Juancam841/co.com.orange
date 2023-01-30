package co.com.orange.stepdefinitions;

import co.com.orange.questions.AddEmployeQuestion;
import co.com.orange.questions.ValidaId;
import co.com.orange.tasks.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class PimStepDefinitions {


    @When("Consulto parametros {word}")
    public void consulto_parametros(String employee) {
        OnStage.theActorCalled("User").
                attemptsTo(Pim.Ingresar());
        OnStage.theActorInTheSpotlight().
                attemptsTo(EmployeeList.consultar(employee));

    }
    @Then("Se muestran los resultados {word}")
    public void se_muestran_los_resultados(String id) {
        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.seeThat(ValidaId.consulta(id)));
    }

    @When("Creo un empleado {word} {word} {word}")
    public void creo_un_empleado(String first, String last, String id) {
        OnStage.theActorCalled("User").
                attemptsTo(Pim.Ingresar());
        OnStage.theActorInTheSpotlight().
                attemptsTo(AddEmploye.crear(first, last, id));
    }

    @Then("Se muestra el empleado {word} {word}")
    public void se_muestra_el_empleado(String first, String last) {
        String name = first+" "+last;
        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.seeThat(AddEmployeQuestion.consultar(name)));
    }


    @When("Elimino un empleado {word}")
    public void elimino_un_empleado(String id) {
        OnStage.theActorInTheSpotlight().
                attemptsTo(DeleteEmployeeTask.ejecutar(id));
    }

    @Then("Se muestra el mensaje")
    public void se_muestra_el_mensaje() {

    }
}
