package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class GoApp implements Task {

    public GoApp(){

    }
public static GoApp toApp (String objetive){ return Tasks.instrumented(GoApp.class,objetive);
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HDCLocal.BTN_LOCAL,isCurrentlyVisible()).forNoMoreThan(120).seconds(),
                Click.on(HDCLocal.BTN_LOCAL),
                Click.on(HDCLocal.MN_PROCESSING));


}

}
