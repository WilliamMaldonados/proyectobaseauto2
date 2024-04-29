package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.choucair.certification.proyectobase.userinterface.FormMovements.MF_CHK1;
import static co.com.choucair.certification.proyectobase.userinterface.XmlFm.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Verify_Xml implements Task {

    private Map<String,String> data;

    public Verify_Xml(Map<String,String> data){this.data=data;}

    public static Verify_Xml declare (Map<String,String> data){return Tasks.instrumented(Verify_Xml.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MOVEMENTS_FORM),
                Click.on(BTN_PDF),
                WaitUntil.the(BTN_XML,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(BTN_XML),
                Click.on(SELECT_TD),
                Click.on(TYPE_DOC),
                Enter.theValue(data.get("INPUT_DOC")).into(INPUT_DOC),
                Click.on(BTN_ACCEPT)


        );


    }
}
