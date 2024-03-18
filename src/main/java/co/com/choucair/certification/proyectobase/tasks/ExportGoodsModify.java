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
import static co.com.choucair.certification.proyectobase.userinterface.FormImportPage.F1_INPUT_NUMBER_MOD;
import static co.com.choucair.certification.proyectobase.userinterface.FormInternationalInvestments.F4_BTN_CALENDAR;
import static co.com.choucair.certification.proyectobase.userinterface.FormInternationalInvestments.F4_DATA_PICKER;
import static co.com.choucair.certification.proyectobase.userinterface.FormOtherOperations.*;
import static co.com.choucair.certification.proyectobase.userinterface.FormOtherOperations.F5_BTN_SAVE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ExportGoodsModify implements Task {


    private Map<String,String> data;

    public ExportGoodsModify(Map<String,String> data){this.data=data;}

    public static ExportGoodsModify declare (Map<String,String> data){return Tasks.instrumented(ExportGoodsModify.class,data);


    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Forms.EXPORTS_FORM),
                Click.on(F2_BTN_NEW_FORM),
                Click.on(F2_SELECTOR_TYPE),
                Click.on(F2_TYPE_OPERATION3),
                Click.on(F2_SELECTOR_ACCOUNT),
                Click.on(F2_ACCOUNT),
                Click.on(F2_BTN_CALENDAR),
                Click.on(F2_DATA_PICKER),
                Enter.theValue(data.get("F2_INPUT_NUMBER_MOD")).into(F2_INPUT_NUMBER_MOD),
                Scroll.to(F2_SELECTOR_ACCOUNT),
                WaitUntil.the(F2_SELECTOR_ACCOUNT,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(F2_COIN_REINTEGRATE),
                Click.on(F2_TYPE_COIN),
                Scroll.to(F2_COIN_REINTEGRATE),
                WaitUntil.the(F2_COIN_REINTEGRATE,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get("F2_INPUT_VALOR_COIN")).into(F2_INPUT_VALOR_COIN),
                Enter.theValue(data.get("F2_TEXT_AREA_OBSERVATION")).into(F2_TEXT_AREA_OBSERVATION),
                Enter.theValue(data.get("F2_NUMBER_EXPORTATION")).into(F2_NUMBER_EXPORTATION),
                Click.on(F2_SELECT_NUMERAL),
                Click.on(F2_NUMERAL_TYPE),
                Enter.theValue(data.get("F2_INPUT_VALOR_INTEGER2")).into(F2_INPUT_VALOR_INTEGER2),
                Click.on(F2_BTN_ADDITION),
                Click.on(F2_RADIO_INFORMATION_COMPLETE),
                Click.on(F2_BTN_SAVE),
                WaitUntil.the(Forms.MESSAGE,isCurrentlyVisible()).forNoMoreThan(60).seconds());


    }
}