package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.HDCLocal;
import co.com.choucair.certification.proyectobase.userinterface.QaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Openup implements Task {
private QaPage qapage;
    public static Openup thepage(){
        return Tasks.instrumented(Openup.class);
    }


    @Override
   public  < T extends Actor> void performAs( T actor){
        actor.attemptsTo(Open.browserOn(qapage),
                Click.on(HDCLocal.BTN_LOCAL)
        );

    }
}

