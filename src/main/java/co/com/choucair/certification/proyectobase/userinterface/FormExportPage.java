package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormExportPage extends PageObject {

    public static final Target EXPORT_FORM = Target.the("btn Exports form").located(By.id("(//a[normalize-space()='Exportaciones de Bienes'])[1]"));
    public static final Target F2_BTN_NEW_FORM = Target.the("BNT New Form").located(By.xpath("(//button[normalize-space()='Nuevo Formulario'])[1]"));
    public static final Target F2_SELECTOR_TYPE= Target.the("Selector code and number").located(By.xpath("(//select[@id='b1_operationType'])[1]"));
    public static final Target F2_TYPE_OPERATION = Target.the("Selector code and number").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div/div/div[2]/select/option[2]"));
    public static final Target F2_TYPE_OPERATION2 = Target.the("Selector code and number").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div/div/div[2]/select/option[3]"));
    public static final Target F2_TYPE_OPERATION3 = Target.the("Selector modfify").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div/div/div[2]/select/option[5]"));
    public static final Target F2_BTN_CALENDAR= Target.the("Btn Calendar").located(By.xpath("(//button[@id='Btn_b3_calendar'])[1]"));
    public static final Target F2_DATA_PICKER= Target.the("Data picker").located(By.xpath("//*[@id=\"ngb-panel-0\"]/div/div/div[2]/div/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[6]/div[1]/div"));
    public static final Target F2_INPUT_NUMBER_MOD= Target.the("NUmber of Form").located(By.xpath("(//input[@id='b3_number'])[1]"));
    public static final Target F2_SELECTOR_ACCOUNT = Target.the("Selector account").located(By.xpath("(//select[@id='b2_codeAndNumber'])[1]"));
    public static final Target F2_ACCOUNT = Target.the("Selector code coin").located(By.xpath("(//option[@value='80700000022'][normalize-space()='80700000022 - 2198704001 - BANCOLOMBIA - PANAMA'])[1]"));
    public static final Target F2_COIN_REINTEGRATE = Target.the("Selector coin integrate").located(By.xpath("(//select[@id='b5_turningCurrencyCode'])[1]"));
    public static final Target F2_TYPE_COIN= Target.the("Type of coin").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div/div[1]/select/option[2]"));
    public static final Target F2_INPUT_VALOR_COIN= Target.the("Input currency amount").located(By.xpath("(//input[@id='b5_turningCurrencyAmount'])[1]"));
    public static final Target F2_TEXT_AREA_OBSERVATION = Target.the("Text area Observation").located(By.xpath("(//textarea[@id='b6_observation'])[1]"));
    public static final Target F2_NUMBER_EXPORTATION= Target.the("Number Exportation").located(By.xpath("(//input[@id='b7_number'])[1]"));
    public static final Target F2_SELECT_NUMERAL= Target.the("Selector Numeral").located(By.xpath("(//select[@id='b7_numeral'])[1]"));
    public static final Target F2_NUMERAL_TYPE= Target.the("Numeral Type").located(By.xpath("(//option[@value='1030'])[1]"));
    public static final Target F2_INPUT_VALOR_INTEGER2= Target.the("Input valor2").located(By.xpath("(//input[@id='b7_usdValue'])[1]"));
    public static final Target F2_INPUT_VALOR_INTEGER3= Target.the("Input valor3").located(By.xpath("(//input[@id='b7_value'])[1]"));
    public static final Target F2_BTN_ADDITION = Target.the("Button addition").located(By.xpath("(//button[normalize-space()='Adicionar'])[1]"));
    public static final Target F2_BTN_IMPORT_FILE = Target.the("Button Import file").located(By.xpath("(//label[normalize-space()='Importar Archivo'])[1]"));
    public static final Target F2_BTN_DELETE_SELECTION = Target.the("Button delete selection").located(By.xpath("(//button[normalize-space()='Eliminar Seleccionados'])[1]"));
    public static final Target F2_RADIO_INFORMATION_COMPLETE = Target.the("Radio Information Complete").located(By.xpath("(//input[@id='b7_radioButton1'])[1]"));
    public static final Target F2_RADIO_INFORMATION_INCOMPLETE = Target.the("Radio Information inComplete").located(By.xpath("(//input[@id='b7_radioButton2'])[1]"));
    public static final Target F2_BTN_SAVE = Target.the("Button Save Form").located(By.xpath("(//button[normalize-space()='Guardar'])[1]"));
    public static final Target F2_BTN_SAVE_PARTIAL = Target.the("Button Save Form Partial").located(By.xpath("(//button[normalize-space()='Guardar Parcialmente'])[1]"));
    public static final Target F2_BTN_CANCEL= Target.the("Button Cancel Form").located(By.xpath("(//button[normalize-space()='Cancelar'])[1]"));
}
