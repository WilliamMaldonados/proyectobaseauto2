package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormOtherOperations extends PageObject {


    public static final Target OTHER_OPERATIONS_FORM= Target.the("btn Exports form").located(By.xpath("(//a[normalize-space()='Otras Operaciones'])[1]"));
    public static final Target F5_BTN_NEW_FORM = Target.the("BNT New Form").located(By.xpath("(//button[normalize-space()='Nuevo Formulario'])[1]"));
    public static final Target F5_SELECTOR_TYPE= Target.the("Selector code and number").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div[1]/div[2]/select"));
    public static final Target F5_TYPE = Target.the("Type code and number").located(By.xpath("//option[normalize-space()='INICIAL']"));
    public static final Target F5_TYPE_2 = Target.the("Type code and Devolution").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div[1]/div[2]/select/option[4]"));
    public static final Target F5_TYPE_3 = Target.the("Type code and Modification").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div[1]/div[2]/select/option[6]"));
    public static final Target F5_SELECTOR_OPERATION = Target.the("Selector operation").located(By.xpath("(//select[@id='b1_operationOf'])[1]"));
    public static final Target F5_OPERATION = Target.the("Type of operation").located(By.xpath("(//option[normalize-space()='Ingreso de Divisas'])[1]"));
    public static final Target F5_SELECTOR_ACCOUNT= Target.the("Selector Account Compensation").located(By.xpath("(//select[@id='b2_codeAndNumber'])[1]"));
    public static final Target F5_TYPE_ACCOUNT = Target.the("Type Account Compensation").located(By.xpath("(//option[@value='80700000022'][normalize-space()='80700000022 - 2198704001 - BANCOLOMBIA - PANAMA'])[1]"));
    public static final Target F5_BTN_CALENDAR= Target.the("Btn Calendar").located(By.xpath("(//button[@id='btn_b3_calendar'])[1]"));
    public static final Target F5_DATA_PICKER= Target.the("Data picker").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[1]/div[2]/div/div/div[2]/div/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[6]/div[1]/div"));
    public static final Target F5_INPUT_NUMBER_MOD= Target.the("NUmber of Form").located(By.xpath("(//input[@id='b3_number'])[1]"));
    public static final Target F5_SELECT_COIN= Target.the("Selector coin").located(By.xpath("(//select[@id='b5_turningCurrencyCode'])[1]"));
    public static final Target F5_TYPE_COIN= Target.the("type coin").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div/div/div/div[1]/select/option[3]"));
    public static final Target F5_INPUT_COIN= Target.the(" input coin").located(By.xpath("(//input[@id='b5_turningCurrencyAmount'])[1]"));
    public static final Target F5_INPUT_VALUE_USD= Target.the("Input value usd").located(By.xpath("(//input[@id='b5_turningCurrencyAmount'])[1]"));
    public static final Target F5_SELECT_NUMERAL = Target.the("Selector Numeral").located(By.xpath("(//select[@id='b6_numeral'])[1]"));
    public static final Target F5_TYPE_NUMERAL = Target.the("Type Numeral").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[4]/div[2]/div/form/div[1]/div[1]/select/option[2]"));
    public static final Target F5_INPUT_VALUE_USD2 = Target.the("Input Value usd2").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[4]/div[2]/div/form/div[1]/div[2]/input"));
    public static final Target F5_SELECT_CONTRAPART = Target.the("Selector Contrapart").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[4]/div[2]/div/form/div[1]/div[4]/select"));
    public static final Target F5_TYPE_CONTRAPART = Target.the("Type Contrapart").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[4]/div[2]/div/form/div[1]/div[4]/select/option[2]"));
    public static final Target F5_BTN_ADDITION= Target.the("Button Save Form").located(By.xpath("(//button[normalize-space()='Adicionar'])[1]"));
    public static final Target F5_INPUT_OBSERVATIONS = Target.the("Input observations").located(By.xpath("(//textarea[@id='b6_observation'])[1]"));
    public static final Target F5_BTN_SAVE= Target.the("Button Save Form").located(By.xpath("(//button[normalize-space()='Guardar'])[1]"));
    public static final Target F5_BTN_SAVE_PARTIAL = Target.the("Button Save Form Partial").located(By.xpath("(//button[normalize-space()='Guardar Parcialmente'])[1]"));
    public static final Target F5_BTN_CANCEL= Target.the("Button Cancel Form").located(By.xpath("(//button[normalize-space()='Cancelar'])[1]"));
}
