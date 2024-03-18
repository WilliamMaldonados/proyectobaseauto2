package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.FillExceptions;
import co.com.choucair.certification.proyectobase.tasks.FillExceptionsModify;
import co.com.choucair.certification.proyectobase.tasks.GoApp;
import co.com.choucair.certification.proyectobase.userinterface.HDCLocal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExceptionsModifyStepDefinitions {

    @Given("that the user is logged into the application HDC for modify exceptions")
    public void that_the_user_is_logged_into_the_application_hdc_for_modify_exceptions() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new HDCLocal()));
        theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }

    @When("the user fills the form exceptions for modify")
    public void the_user_fills_the_form_exceptions_for_modify(io.cucumber.datatable.DataTable data) {
        List<Map<String,String>> dataform= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(FillExceptionsModify.declare(dataform.get(0)));
    }

    @Then("the user see then form is created successfully in modify for exceptions")
    public void the_user_see_then_form_is_created_successfully_in_modify_for_exceptions() {

    }

}
