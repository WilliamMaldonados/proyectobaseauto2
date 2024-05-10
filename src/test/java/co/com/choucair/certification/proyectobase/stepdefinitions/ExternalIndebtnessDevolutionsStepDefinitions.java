package co.com.choucair.certification.proyectobase.stepdefinitions;


import co.com.choucair.certification.proyectobase.tasks.ExternalIndebtnessDevolution;
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

public class ExternalIndebtnessDevolutionsStepDefinitions {
    @Given("that the user is logged into the application Of HDC for external indebtness for devolutions")
    public void that_the_user_is_logged_into_the_application_of_hdc_for_external_indebtness_for_devolutions() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new HDCLocal()));
        theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }
    @When("the user fills the form of external indebtedness for devolutions")
    public void the_user_fills_the_form_of_external_indebtedness_for_devolutions(io.cucumber.datatable.DataTable data) {
        List<Map<String,String>> dataform= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(ExternalIndebtnessDevolution.declare(dataform.get(0)));
    }
    @Then("the user fills the form of external indebtedness for devolutions is created successfully")
    public void the_user_fills_the_form_of_external_indebtedness_for_devolutions_is_created_successfully() {

    }
}
