package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.GoApp;
import co.com.choucair.certification.proyectobase.tasks.Movements;
import co.com.choucair.certification.proyectobase.tasks.Verify_Xml;
import co.com.choucair.certification.proyectobase.userinterface.HDCLocal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class XmlStepDefinitions {
    @Given("that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDC form movements for xml")
    public void that_the_user_is_logged_into_the_application_of_sucursal_virtual_empresas_and_declarations_of_change_hdc_form_movements_for_xml() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new HDCLocal()));
        theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }
    @When("the user fills the information for consult xml")
    public void the_user_fills_the_information_for_consult_xml(io.cucumber.datatable.DataTable data) {
        List<Map<String,String>> dataform= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(Verify_Xml.declare(dataform.get(0)));
    }
    @Then("the user see then xml is created successfully")
    public void the_user_see_then_xml_is_created_successfully() {

    }


}
