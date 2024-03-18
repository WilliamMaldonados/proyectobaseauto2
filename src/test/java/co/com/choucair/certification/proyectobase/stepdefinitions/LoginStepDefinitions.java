package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.models.LoginData;
import co.com.choucair.certification.proyectobase.questions.ValidationLog;
import co.com.choucair.certification.proyectobase.tasks.GoApp;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.userinterface.HDCLocal;
import co.com.choucair.certification.proyectobase.userinterface.QaPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;




public class LoginStepDefinitions {

 
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());



    }
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn(new QaPage()));
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        LoginData.UserCredentials credentials = new LoginData.UserCredentials("geortiz1", "bbbbbbbb");
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(credentials)
        );
    }

    @Given("^I go to Menu commerce International and enter HDC app$")
    public void iGoToMenuCommerceInternationalAndEnterHDCApp() {theActorInTheSpotlight().attemptsTo(GoApp.toApp(""));
    }


    @Then("^I see mensage of welcome$")
    public void iSeeMensageOfWelcome(String data) {theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLog.theItemExist(data)));
    }


}
