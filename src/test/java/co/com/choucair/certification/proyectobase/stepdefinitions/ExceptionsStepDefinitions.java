package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.FillExceptions;
import co.com.choucair.certification.proyectobase.tasks.GoApp;
import co.com.choucair.certification.proyectobase.userinterface.HDCLocal;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExceptionsStepDefinitions {

    @Given("^that the user is logged into the application HDCF$")
    public void that_the_user_is_logged_into_the_application_HDCF() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new HDCLocal()));
        theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }


    @When("^the user fills the form exceptions$")
    public void the_user_fills_the_form_exceptions(DataTable data) {
        List <Map<String,String>> dataform= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(FillExceptions.declare(dataform.get(0)));
    }

    @Then("^the user should see the form created$")
    public void the_user_should_see_the_form_created() {

    }

}
