package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class HDCApp extends PageObject {


    public static final Target ALERT_LEG = Target.the("Alerta legalizaciones").located(By.xpath("/html/body/ngb-modal-window/div/div/app-legalizations-modal/div/div[2]/p"));
    public static final Target BTN_OK = Target.the("Boton OK").located(By.xpath("(//button[normalize-space()='OK'])[1]"));
    public static final Target Message_IN = Target.the("Mensaje Inicio").located(By.xpath("(//a[normalize-space()='INICIO'])[1]"));

    }

