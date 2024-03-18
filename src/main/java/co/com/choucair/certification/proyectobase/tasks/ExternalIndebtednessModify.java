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

import static co.com.choucair.certification.proyectobase.userinterface.FormExportPage.*;
import static co.com.choucair.certification.proyectobase.userinterface.FormExternalIndebtednessPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ExternalIndebtednessModify implements Task {

    private Map<String,String> data;

    public ExternalIndebtednessModify(Map<String,String> data){this.data=data;}

    public static ExternalIndebtednessModify declare (Map<String,String> data){return Tasks.instrumented(ExternalIndebtednessModify.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ExternalIndebtedness_FORM),
                Click.on(F3_BTN_NEW_FORM),
                Click.on(F3_SELECTOR_TYPE),
                Click.on(F3_TYPE3),
                Click.on(F3_SELECTOR_OPERATION),
                Click.on(F3_OPERATION),
                Click.on(F3_SELECTOR_CITY),
                Click.on(F3_TYPE_CITY),
                Click.on(F3_SELECTOR_ACCOUNT),
                Click.on(F3_TYPE_ACCOUNT),
                Click.on(F3_BTN_CALENDAR),
                Click.on(F3_DATA_PICKER),
                Enter.theValue(data.get("F3_INPUT_NUMBER_MOD")).into(F3_INPUT_NUMBER_MOD),
                Scroll.to(F3_SELECTOR_ACCOUNT),
                Enter.theValue(data.get("F3_NUMBER_LOAN_ENDORSEMENT")).into(F3_NUMBER_LOAN_ENDORSEMENT),
                Click.on(F3_CODE_COIN_STIPULATE),
                Click.on(F3_CODE_COIN_STIPULATE_TYPE),
                Click.on(F3_CODE_COIN_NEGOTIATION),
                Click.on(F3_CODE_COIN_NEGOTIATION_TYPE),
                Scroll.to(F3_CODE_COIN_STIPULATE),
                WaitUntil.the(F3_CODE_COIN_STIPULATE,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get("F3_INPUT_NAME_CREDITOR")).into(F3_INPUT_NAME_CREDITOR),
                Click.on(F3_SELECTOR_NUMERAL),
                Click.on(F3_TYPE_NUMERAL),
                Enter.theValue(data.get("F3_INPUT_COIN_NEGOTIATION")).into(F3_INPUT_COIN_NEGOTIATION),
                Enter.theValue(data.get("F3_INPUT_COIN_HIRING")).into(F3_INPUT_COIN_HIRING),
                Click.on(F3_BTN_ADDITION),
                Scroll.to(F3_CODE_COIN_STIPULATE),
                WaitUntil.the(F3_INPUT_NAME_F3,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get("F3_INPUT_NAME_F3")).into(F3_INPUT_NAME_F3),
                Enter.theValue(data.get("F3_INPUT_ID_F3")).into(F3_INPUT_ID_F3),
                Click.on(F3_BTN_SAVE),
                WaitUntil.the(Forms.MESSAGE,isCurrentlyVisible()).forNoMoreThan(60).seconds());


    }
}
