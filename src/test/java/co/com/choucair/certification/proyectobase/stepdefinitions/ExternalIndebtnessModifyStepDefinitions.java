package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.ExportGoods;
import co.com.choucair.certification.proyectobase.tasks.ExternalIndebtedness;
import co.com.choucair.certification.proyectobase.tasks.ExternalIndebtednessModify;
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

public class ExternalIndebtnessModifyStepDefinitions {
    @Given("that the user is logged into the application Of HDC for modyfy f3")
    public void that_the_user_is_logged_into_the_application_of_hdc_for_modyfy_f3() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new HDCLocal()));
        theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }
    @When("the user fills the form of external indebtedness for modify")
    public void the_user_fills_the_form_of_external_indebtedness_for_modify(io.cucumber.datatable.DataTable data) {
        List <Map<String,String>> dataform= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(ExternalIndebtednessModify.declare(dataform.get(0)));
    }
    @Then("the form is created successfully for modify")
    public void the_form_is_created_successfully_for_modify() {

    }

}
