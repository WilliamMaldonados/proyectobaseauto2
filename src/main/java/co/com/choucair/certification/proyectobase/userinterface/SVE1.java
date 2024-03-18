package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SVE1 extends PageObject {

    public static final Target NICE = Target.the("Authentication").located(By.xpath("(//a[normalize-space()='INICIO'])[1]"));
    public static final Target MENU_IZQ = Target.the("Menu izquierda comercio internacional").located(By.xpath("(//span[normalize-space()='Comercio internacional'])[1]"));
    public static final Target HDC_BTN = Target.the("Boton entrada HDC").located(By.xpath("/html/body/div/div/div/div[1]/div[1]/aside/div/div/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/span"));


}

