package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.GoApp;
import co.com.choucair.certification.proyectobase.tasks.InternationalInvestments;
import co.com.choucair.certification.proyectobase.tasks.OtherOperations;
import co.com.choucair.certification.proyectobase.userinterface.HDCLocal;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OtherOperationsStepDefinitions {

    @Given("^that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDC other operations$")
    public void that_the_user_is_logged_into_the_application_of_Sucursal_Virtual_Empresas_and_Declarations_Of_Change_HDC_other_operations() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new HDCLocal()));
        theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }


    @When("^the user fills the form of other operations$")
    public void the_user_fills_the_form_of_other_operations(DataTable data) {
        List<Map<String,String>> dataform= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(OtherOperations.declare(dataform.get(0)));
    }

    @Then("^the user see then form op is created successfully$")
    public void the_user_see_then_form_op_is_created_successfully() {

    }
}
