package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.models.LoginData;
import co.com.choucair.certification.proyectobase.tasks.ExportGoods;
import co.com.choucair.certification.proyectobase.tasks.ImportsGoods;
import co.com.choucair.certification.proyectobase.tasks.GoApp;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.userinterface.HDCLocal;

import co.com.choucair.certification.proyectobase.userinterface.QaPage;
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

public class ImportsGoodsStepDefinitions {

    co.com.choucair.certification.proyectobase.models.ImportsGoods importsGoods;


    @Given("that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDCF1")
    public void that_the_user_is_logged_into_the_application_of_sucursal_virtual_empresas_and_declarations_of_change_hdcf1() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new HDCLocal()));
        theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }
    @When("^the user fills the form of import goods$")
    public void the_user_fills_the_form_of_import_goods(DataTable data) {
        List<Map<String,String>> dataform= data.asMaps(String.class,String.class);
        theActorInTheSpotlight().attemptsTo(ImportsGoods.declare(dataform.get(0)));
    }
    @Then("the user should see the operation registered for import goods")
    public void the_user_should_see_the_operation_registered_for_import_goods() {

    }

    }





