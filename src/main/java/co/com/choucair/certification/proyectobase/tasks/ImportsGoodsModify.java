package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.FormImportPage;
import co.com.choucair.certification.proyectobase.userinterface.Forms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.choucair.certification.proyectobase.userinterface.FormExportPage.F2_BTN_CALENDAR;
import static co.com.choucair.certification.proyectobase.userinterface.FormExportPage.F2_DATA_PICKER;
import static co.com.choucair.certification.proyectobase.userinterface.FormImportPage.*;
import static co.com.choucair.certification.proyectobase.userinterface.FormImportPage.F1_BTN_SAVE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ImportsGoodsModify implements Task {


    private Map<String,String> data;

    public ImportsGoodsModify(Map<String,String> data){this.data=data;}

    public static ImportsGoodsModify declare (Map<String,String> data){return Tasks.instrumented(ImportsGoodsModify.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IMPORTS_FORM),
                Click.on(Forms.F1_BTN_NEW_FORM),
                Click.on(FormImportPage.F1_SELECTOR_INFO_TYPE),
                Click.on(F1_INFO_TYPE_3),
                Click.on(FormImportPage.F1_SELECTOR_CON_NUMBER),
                Click.on(FormImportPage.F1_CON_NUMBER),
                Click.on(F1_BTN_CALENDAR),
                Click.on(F1_DATA_PICKER),
                Enter.theValue(data.get("F1_INPUT_NUMBER_MOD")).into(F1_INPUT_NUMBER_MOD),
                Scroll.to(F1_SELECTOR_CON_NUMBER),
                WaitUntil.the(F1_SELECTOR_CODE_COIN,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(F1_SELECTOR_CODE_COIN),
                WaitUntil.the(FormImportPage.F1_CODE_COIN,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(FormImportPage.F1_CODE_COIN),
                Click.on(F1_SELECTOR_NUMERAL),
                Click.on(F1_NUMERAL1),
                Enter.theValue(data.get("F1_INPUT_AMOUNT")).into(F1_INPUT_CURRENCY_AMOUNT),
                Click.on(F1_SELECTOR_CODE_COIN_2),
                Click.on(F1_CODE_COIN_2),
                Click.on(F1_SELECTOR_NUMERAL_2),
                Click.on(F1_NUMERAL_2),
                Enter.theValue(data.get("F1_INPUT_CURRENCY_AMOUNT_2")).into(F1_INPUT_CURRENCY_AMOUNT_2),
                //Enter.theValue(data.get("F1_INPUT_AMOUNT_2")).into(F1_INPUT_AMOUNT_2),
                Scroll.to(F1_SELECTOR_NUMERAL_2),
                Enter.theValue(data.get("F1_TEXT_AREA")).into(F1_TEXT_AREA),
                Enter.theValue(data.get("F1_IMPORTATION_NUMBER")).into(F1_IMPORTATION_NUMBER),
                Enter.theValue(data.get("F1_IMPORTATION_VALUE")).into(F1_IMPORTATION_VALUE),
                Click.on(F1_BTN_ADDITION),
                Click.on(F1_RADIO_BTN_COMPLETE),
                Click.on(F1_BTN_SAVE),
                WaitUntil.the(Forms.MESSAGE,isCurrentlyVisible()).forNoMoreThan(60).seconds()
        );


    }
}
