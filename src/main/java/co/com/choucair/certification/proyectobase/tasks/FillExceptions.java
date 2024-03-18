package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.Forms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.choucair.certification.proyectobase.userinterface.FormExceptions.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class FillExceptions implements Task {

    private Map<String,String> data;

    public FillExceptions(Map<String,String> data){this.data=data;}

    public static FillExceptions declare (Map<String,String> data){return Tasks.instrumented(FillExceptions.class,data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Forms.EXCEPTIONS_FORM),
                Click.on(F3a_BTN_NEW_FORM),
                Click.on(F3a_SELECTOR_NUMBER),
                Click.on(F3a_TYPE),
                Click.on(F3a_SELECTOR_OPERATION),
                Click.on(F3a_OPERATION),
                Click.on(F3a_SELECTOR_OPERATION),
                Click.on(F3a_OPERATION),
                Click.on(F3a_SELECTOR_CITY),
                Click.on(F3a_TYPE_CITY),
                Enter.theValue(data.get("F3a_INPUT_NUMBER")).into(F3a_INPUT_NUMBER),
                Click.on(F3a_SELECTOR_ACCOUNT),
                Click.on(F3a_TYPE_ACCOUNT),
                Enter.theValue(data.get("F3a_NUMBER_LENDING_INPUT")).into(F3a_NUMBER_LENDING_INPUT),
                Enter.theValue(data.get("F3a_CREDITOR_NAME_INPUT")).into(F3a_CREDITOR_NAME_INPUT),
                Click.on(F3a_SELECT_COIN),
                Click.on(F3a_TYPE_COIN),
                Scroll.to(F3a_SELECTOR_CODE),
                Click.on(F3a_SELECTOR_CODE),
                Click.on(F3a_TYPE_CODE),
                Click.on(F3a_SELECTOR_NUMERAL),
                Click.on(F3a_TYPE_NUMERAL),
                Enter.theValue(data.get("F3a_INPUT_COIN_NEGOTIATION")).into(F3a_INPUT_COIN_NEGOTIATION),
                Enter.theValue(data.get("F3a_INPUT_COIN_VALOR")).into(F3a_INPUT_COIN_VALOR),
                Click.on(F3a_BTN_ADDITION),
                Scroll.to(F3a_SELECTOR_NUMERAL),
                Enter.theValue(data.get("F3a_NAME_INPUT")).into(F3a_NAME_INPUT),
                Enter.theValue(data.get("F3a_IDENTITY_INPUT")).into(F3a_IDENTITY_INPUT),
                Enter.theValue(data.get("F3a_ADDRESS")).into(F3a_ADDRESS),
                Enter.theValue(data.get("F3a_TELEPHONE")).into(F3a_TELEPHONE),
                Enter.theValue(data.get("F3a_EMAIL")).into(F3a_EMAIL),
                Click.on(F3a_SELECTOR_CITY2),
                Click.on(F3a_TYPE_CITY2),
                Scroll.to(F3a_BTN_SAVE),
                Click.on(F3a_BTN_SAVE),
                WaitUntil.the(Forms.MESSAGE,isCurrentlyVisible()).forNoMoreThan(30).seconds()
        );
    }
}
