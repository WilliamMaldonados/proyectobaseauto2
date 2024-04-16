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


import static co.com.choucair.certification.proyectobase.userinterface.FormMovements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Movements implements Task {
    private Map<String,String> data;

    public Movements(Map<String,String> data){this.data=data;}

    public static Movements declare (Map<String,String> data){return Tasks.instrumented(Movements.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MOVEMENTS_FORM),
                Click.on(MF_BTN_NEW_FORM),
                Click.on(MF_SELECT_ACCOUNT),
                Click.on(MF_TYPE_ACCOUNT),
                Click.on(MF_SELECT_MONTH),
                Click.on(MF_TYPE_MONTH),
                Click.on(MF_BTN_CONSULT),
                WaitUntil.the(MF_CHK1,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Scroll.to(MF_CHK1),
                Click.on(MF_CHK1),
                Click.on(MF_CHK2),
                Click.on(MF_CHK3),
                Click.on(MF_CHK4),
                Click.on(MF_CHK5),
                Click.on(MF_BTN_CONSOLIDATE),
                Scroll.to(MF_BTN_CANCEL),
                Click.on(MF_BTN_SAVE),
                WaitUntil.the(MF_MESSAGE,isCurrentlyVisible()).forNoMoreThan(60).seconds()
                //Click.on(MF_BTN_XML),
                //Click.on(MF_SELECT_TD),
                //Click.on(MF_TYPE_DOC),
                //Enter.theValue(data.get("MF_INPUT_DOC")).into(MF_INPUT_DOC),
                //Click.on(MF_BTN_SAVE_2)

        );


    }
}
