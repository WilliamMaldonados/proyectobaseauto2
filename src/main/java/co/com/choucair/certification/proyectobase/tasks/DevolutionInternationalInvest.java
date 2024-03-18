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

import static co.com.choucair.certification.proyectobase.userinterface.FormInternationalInvestments.*;
import static co.com.choucair.certification.proyectobase.userinterface.FormInternationalInvestments.F4_BTN_SAVE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class DevolutionInternationalInvest implements Task {

    private Map<String,String> data;

    public DevolutionInternationalInvest(Map<String,String> data){this.data=data;}

    public static DevolutionInternationalInvest declare (Map<String,String> data){return Tasks.instrumented(DevolutionInternationalInvest.class,data);
    }
        @Override
            public
         <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(INTERNATIONAL_INVESTMENTS_FORM),
                    Click.on(F4_BTN_NEW_FORM),
                    Click.on(F4_SELECTOR_TYPE),
                    Click.on(F4_TYPE_3),
                    Click.on(F4_SELECTOR_OPERATION),
                    Click.on(F4_OPERATION),
                    Click.on(F4_SELECTOR_CITY),
                    Click.on(F4_TYPE_CITY),
                    Click.on(F4_SELECTOR_ACCOUNT),
                    Click.on(F4_TYPE_ACCOUNT),
                    Scroll.to(F4_SELECTOR_ACCOUNT),
                    Click.on(F4_RADIO_BTN_1),
                    Click.on(F4_SELECT_COUNTRY_2),
                    Click.on(F4_TYPE_COUNTRY2),
                    Click.on(F4_SELECT_CITY_2),
                    Click.on(F4_TYPE_CITY2),
                    Enter.theValue(data.get("F4_INPUT_PHONE")).into(F4_INPUT_PHONE),
                    Click.on(F4_SELECT_CIUU),
                    Click.on(F4_TYPE_CIUU),
                    Click.on(F4_SELECT_TYPE_DOC),
                    Click.on(F4_TYPE_DOC),
                    Enter.theValue(data.get("F4_INPUT_DOC")).into(F4_INPUT_DOC),
                    Scroll.to(F4_INPUT_DOC),
                    WaitUntil.the(F4_INPUT_DOC,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                    Enter.theValue(data.get("F4_INPUT_NAME")).into(F4_INPUT_NAME),
                    Click.on(F4_SELECT_COUNTRY),
                    Click.on(F4_COUNTRY),
                    Click.on(F4_SELECT_NUMERAL),
                    Click.on(F4_TYPE_NUMERAL),
                    Click.on(F4_SELECT_COIN),
                    Click.on(F4_TYPE_COIN),
                    Enter.theValue(data.get("F4_INPUT_VALUE_COIN")).into(F4_INPUT_VALUE_COIN),
                    Enter.theValue(data.get("F4_INPUT_CHANGE")).into(F4_INPUT_CHANGE),
                    Enter.theValue(data.get("F4_INPUT_PARTICIPANTS")).into(F4_INPUT_PARTICIPANTS),
                    Click.on(F4_BTN_SAVE),
                    WaitUntil.the(Forms.MESSAGE,isCurrentlyVisible()).forNoMoreThan(60).seconds());
        }
    }
