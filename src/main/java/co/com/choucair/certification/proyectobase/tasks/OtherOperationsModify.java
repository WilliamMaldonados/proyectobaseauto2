package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.Forms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Map;

import static co.com.choucair.certification.proyectobase.userinterface.FormInternationalInvestments.*;
import static co.com.choucair.certification.proyectobase.userinterface.FormOtherOperations.*;
import static co.com.choucair.certification.proyectobase.userinterface.FormOtherOperations.F5_BTN_SAVE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class OtherOperationsModify implements Task {

    private Map<String,String> data;

    public OtherOperationsModify(Map<String,String> data){this.data=data;}

    public static OtherOperationsModify declare (Map<String,String> data){return Tasks.instrumented(OtherOperationsModify.class,data);


    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OTHER_OPERATIONS_FORM),
                Click.on(F5_BTN_NEW_FORM),
                Click.on(F5_SELECTOR_TYPE),
                Click.on(F5_TYPE_3),
                Click.on(F5_SELECTOR_OPERATION),
                Click.on(F5_OPERATION),
                Click.on(F5_SELECTOR_ACCOUNT),
                Click.on(F5_TYPE_ACCOUNT),
                Click.on(F5_BTN_CALENDAR),
                Click.on(F5_DATA_PICKER),
                Enter.theValue(data.get("F5_INPUT_NUMBER_MOD")).into(F5_INPUT_NUMBER_MOD),
                Scroll.to(F5_SELECTOR_ACCOUNT),
                Click.on(F5_SELECT_COIN),
                Click.on(F5_TYPE_COIN),
                Enter.theValue(data.get("F5_INPUT_COIN")).into(F5_INPUT_COIN),
                Scroll.to(F5_INPUT_COIN),
                WaitUntil.the(F5_INPUT_COIN,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(F5_SELECT_NUMERAL),
                Click.on(F5_TYPE_NUMERAL),
                Hit.the(Keys.ARROW_RIGHT).into(F5_INPUT_VALUE_USD2),
                Hit.the(Keys.ARROW_RIGHT).into(F5_INPUT_VALUE_USD2),
                Enter.theValue(data.get("F5_INPUT_VALUE_USD2")).into(F5_INPUT_VALUE_USD2),
                Enter.theValue(data.get("F5_INPUT_OBSERVATIONS")).into(F5_INPUT_OBSERVATIONS),
                Click.on(F5_SELECT_CONTRAPART),
                Click.on(F5_TYPE_CONTRAPART),
                Click.on(F5_BTN_ADDITION),
                Click.on(F5_BTN_SAVE),
                WaitUntil.the(Forms.MESSAGE,isCurrentlyVisible()).forNoMoreThan(60).seconds());
    }
}

