package co.com.choucair.certification.proyectobase.tasks;



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
                WaitUntil.the(MF_BTN_SAVE,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Scroll.to(INPUT_NAME),
                Enter.theValue(data.get("INPUT_NAME")).into(INPUT_NAME),
                Scroll.to(MF_BTN_SAVE),
                Click.on(MF_BTN_SAVE),
                WaitUntil.the(MF_MESSAGE,isCurrentlyVisible()).forNoMoreThan(60).seconds()
        );


    }
}
