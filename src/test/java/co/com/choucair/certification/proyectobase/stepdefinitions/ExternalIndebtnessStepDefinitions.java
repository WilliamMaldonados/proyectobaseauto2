package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.ExternalIndebtedness;
import co.com.choucair.certification.proyectobase.tasks.GoApp;
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

public class ExternalIndebtnessStepDefinitions {


    @Given("^that the user is logged into the application Of HDC$")
    public void that_the_user_is_logged_into_the_application_Of_HDC() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new HDCLocal()));
        theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }

    @When("^the user fills the form of external indebtedness$")
    public void the_user_fills_the_form_of_external_indebtedness(DataTable data) {
        List <Map<String,String>> dataform= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(ExternalIndebtedness.declare(dataform.get(0)));
    }

    @Then("^the user see then form is created successfully$")
    public void the_user_see_then_form_is_created_successfully() {


    }
}
