package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.Forms;
import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Map;

import static co.com.choucair.certification.proyectobase.userinterface.FormOtherOperations.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class OtherOperations implements Task {

    private Map<String,String> data;

    public OtherOperations(Map<String,String> data){this.data=data;}

    public static OtherOperations declare (Map<String,String> data){return Tasks.instrumented(OtherOperations.class,data);


    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OTHER_OPERATIONS_FORM),
                Click.on(F5_BTN_NEW_FORM),
                Click.on(F5_SELECTOR_TYPE),
                Click.on(F5_TYPE),
                Click.on(F5_SELECTOR_OPERATION),
                Click.on(F5_OPERATION),
                Click.on(F5_SELECTOR_ACCOUNT),
                Click.on(F5_TYPE_ACCOUNT),
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
