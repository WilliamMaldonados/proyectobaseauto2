package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Forms extends PageObject {
        public static final Target IMPORTS_FORM = Target.the("Imports of Goods Form").located(By.xpath("//a[contains(text(),'Importaciones de Bienes')]"));
        public static final Target F1_BTN_NEW_FORM = Target.the("Button to create a New Form").located(By.xpath("//div//button[@id='nuevoFormulario1']"));
        public static final Target EXPORTS_FORM = Target.the("Exports of Goods Form").located(By.xpath("(//a[normalize-space()='Exportaciones de Bienes'])[1]"));
        public static final Target EXCEPTIONS_FORM = Target.the("btn Exceptions").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[1]/app-vertical-menu/div/ul/li[4]/a"));
        public static final Target FRAME_FORM = Target.the("Frame").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[1]/app-vertical-menu/div/ul/li[6]"));
        public static final Target FORM_TEN = Target.the("Form Ten").located(By.xpath("//a[contains(text(),'Formularios 10')]"));
        public static final Target INDEBTEDNESS_FORM = Target.the("External Indebtedness Form").located(By.xpath("(//a[normalize-space()='Endeudamiento Externo'])[1]"));
        public static final Target INVESTMENTS_FORM = Target.the("International Investment Form").located(By.xpath("//a[contains(text(),'Inversiones Internacionales')]"));
        public static final Target OTHER_OPERATIONS = Target.the("Others Operations Form").located(By.xpath("//a[contains(text(),'Otras Operaciones')]"));
        public static final Target MOVEMENTS_MODULE = Target.the("Button to open movements module").located(By.xpath("//a[contains(text(),'Movimientos')]"));
        public static final Target FORM_LIST = Target.the("form list").located(By.xpath("//table[@id='printTable']"));
        public static final Target DELETE_BUTTON = Target.the("Button to delete form").locatedBy("//tbody/tr[{0}]/td[3]/button[1]");
        public static final Target ACCEPT_DELETE_FORM_BUTTON = Target.the("button to accept delete form").located(By.xpath("//body/ngb-modal-window[1]//button[contains(text(),'Eliminar')]"));
        public static final Target OVERLAY = Target.the("overlay").located(By.cssSelector(".overlay"));
        public static final Target DIAN_REPORTS_BUTTON = Target.the("button to open Dian reports module").located(By.cssSelector("#informesD"));
        public static final Target MESSAGE = Target.the("Alerta creado").located(By.xpath("//section[@class='bc-alert-body']"));
    }

