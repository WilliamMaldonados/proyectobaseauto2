package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.ExportGoodsModify;
import co.com.choucair.certification.proyectobase.tasks.GoApp;
import co.com.choucair.certification.proyectobase.tasks.ImportsGoodsModify;
import co.com.choucair.certification.proyectobase.userinterface.HDCLocal;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExportGoodsModifyStepDefinitions {
    @Given("that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDC for modify export goods")
    public void that_the_user_is_logged_into_the_application_of_sucursal_virtual_empresas_and_declarations_of_change_hdc_for_modify_export_goods() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new HDCLocal()));
        theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }
    @When("the user fills the form of export goods for operation modify")
    public void the_user_fills_the_form_of_export_goods_for_operation_modify(DataTable data) {
        List<Map<String,String>> dataform= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(ExportGoodsModify.declare(dataform.get(0)));
    }
    @Then("the user see then form is created successfully in modify for export goods")
    public void the_user_see_then_form_is_created_successfully_in_modify_for_export_goods() {

    }
}
