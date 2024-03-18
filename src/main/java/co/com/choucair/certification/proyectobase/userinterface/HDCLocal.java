package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://localhost:4300/")


public class HDCLocal extends PageObject {
    public static final Target BTN_LOCAL = Target.the("Boton local").located(By.xpath("(//input[@name='aceptar2'])[1]"));
    public static final Target MN_PROCESSING = Target.the("Processing of Statements of Change menu").located(By.xpath("//*[@id='Procesamiento']"));

}
