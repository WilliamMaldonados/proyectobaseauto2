package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.models.LoginData;
import co.com.choucair.certification.proyectobase.userinterface.QaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Login implements Task {
    private final LoginData.UserCredentials credentials;

    public Login(LoginData.UserCredentials credentials) {
        this.credentials = credentials;
    }

    public static Login withCredentials(LoginData.UserCredentials credentials) {
        return instrumented(Login.class, credentials);
    }

@Override

public < T extends Actor> void performAs(T actor){
actor.attemptsTo(
        WaitUntil.the(QaPage.SVE_TITTLE,isCurrentlyVisible()).forNoMoreThan(120).seconds(),
        WaitUntil.the(QaPage.USER_SVE,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
        Enter.theValue(credentials.getUser()).into(QaPage.USER_SVE),
        WaitUntil.the(QaPage.PASSWORD_SVE, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
        Enter.theValue(credentials.getPassword()).into(QaPage.PASSWORD_SVE),
        WaitUntil.the(QaPage.BTN_CONTINUE_SVE,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
        Click.on(QaPage.BTN_CONTINUE_SVE),
        WaitUntil.the(QaPage.BTN_COMERCE,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
        MoveMouse.to(QaPage.BTN_COMERCE),
        MoveMouse.to(QaPage.BTN_MENU_HDC),
        Click.on(QaPage.BTN_MENU_HDC),
        WaitUntil.the(QaPage.BTN_PDC,isCurrentlyVisible()).forNoMoreThan(60).seconds(),
        Click.on(QaPage.BTN_PDC)
);
    }
}
