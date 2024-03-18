package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.HDCApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationLog implements Question<Boolean>{


    private  String item;

    public ValidationLog(String item){this.item = item;
    }
    public static ValidationLog theItemExist(String item){return new ValidationLog(item);}

    @Override
    public Boolean answeredBy(Actor actor){
        return Text.of(HDCApp.ALERT_LEG).equals(item);
    }


}
