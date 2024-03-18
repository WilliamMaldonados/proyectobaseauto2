package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.FormExportPage;
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

import static co.com.choucair.certification.proyectobase.userinterface.FormExportPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ExportGoods  implements Task {

    private Map<String,String> data;

    public ExportGoods(Map<String,String> data){this.data=data;}

    public static ExportGoods declare (Map<String,String> data){return Tasks.instrumented(ExportGoods.class,data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Forms.EXPORTS_FORM),
                Click.on(F2_BTN_NEW_FORM),
                Click.on(F2_SELECTOR_TYPE),
                Click.on(F2_TYPE_OPERATION),
                Click.on(F2_SELECTOR_ACCOUNT),
                Click.on(F2_ACCOUNT),
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
                WaitUntil.the(Forms.MESSAGE,isCurrentlyVisible()).forNoMoreThan(60).seconds()
        );
    }
}
