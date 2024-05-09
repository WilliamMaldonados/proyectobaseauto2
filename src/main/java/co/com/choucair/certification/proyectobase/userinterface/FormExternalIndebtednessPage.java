package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormExternalIndebtednessPage extends PageObject {


    public static final Target ExternalIndebtedness_FORM = Target.the("btn Exports form").located(By.xpath("(//a[normalize-space()='Endeudamiento Externo'])[1]"));
    public static final Target F3_BTN_NEW_FORM = Target.the("BNT New Form").located(By.xpath("//button[@id='nuevoFormulario3']"));
    public static final Target F3_SELECTOR_TYPE= Target.the("Selector code and number").located(By.xpath("(//select[@id='numberBlockOne'])[1]"));
    public static final Target F3_TYPE = Target.the("Type code and number").located(By.xpath("(//option[normalize-space()='1. INICIAL'])[1]"));
    public static final Target F3_TYPE3 = Target.the("Type code and number").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div[1]/div[2]/select/option[5]"));
    public static final Target F3_SELECTOR_OPERATION = Target.the("Selector operation").located(By.xpath("(//select[@id='operationBlockOne'])[1]"));
    public static final Target F3_OPERATION = Target.the("Type of operation").located(By.xpath("(//option[normalize-space()='I. Ingreso de Divisas'])[1]"));
    public static final Target F3_SELECTOR_CITY = Target.the("Selector City").located(By.xpath("(//select[@id='cityBlocktwo'])[1]"));
    public static final Target F3_TYPE_CITY= Target.the("Type of City").located(By.xpath("(//option[@value='149'])[1]"));
    public static final Target F3_NUMBER_CC= Target.the("Input number cc").located(By.xpath("(//input[@id='numberBlocktwo'])[1]"));
    public static final Target F3_SELECTOR_ACCOUNT= Target.the("Selector Account Compensation").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[2]/div/div[5]/select"));
    public static final Target F3_TYPE_ACCOUNT = Target.the("Type Account Compensation").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[2]/div/div[5]/select/option[4]"));
    public static final Target F3_BTN_CALENDAR= Target.the("Btn Calendar").located(By.xpath("(//button[@id='btn_b3_calendar'])[1]"));
    public static final Target F3_DATA_PICKER= Target.the("Data picker").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[1]/div[2]/div/div/div[2]/div/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[4]/div"));
    public static final Target F3_INPUT_NUMBER_MOD= Target.the("NUmber of Form").located(By.xpath("(//input[@id='numberBlockthree'])[1]"));
    public static final Target F3_NUMBER_LOAN_ENDORSEMENT= Target.the("Input Number loan aval").located(By.xpath("(//input[@id='loanNumberBlockFour'])[1]"));
    public static final Target F3_CODE_COIN_STIPULATE= Target.the("Selector code coin estipulate").located(By.xpath("(//select[@id='currencyCodeBlockFour'])[1]"));
    public static final Target F3_CODE_COIN_STIPULATE_TYPE= Target.the("Type code coin estipulate").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[2]/div[2]/div/div[3]/div[1]/select/option[2]"));
    public static final Target F3_CODE_COIN_NEGOTIATION= Target.the("Selector code coin negotiation").located(By.xpath("(//select[@id='currencyCodeNegotiationBlockFour'])[1]"));
    public static final Target F3_CODE_COIN_NEGOTIATION_TYPE= Target.the("Type code coin negotiation").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[2]/div[2]/div/div[3]/div[4]/select/option[2]"));
    public static final Target F3_INPUT_NAME_CREDITOR= Target.the("Selector code coin negotiation").located(By.xpath("(//input[@id='creditorNameBlockFour'])[1]"));
    public static final Target F3_SELECTOR_NUMERAL = Target.the("Selector Numeral").located(By.xpath("(//select[@id='numeralBlockFive'])[1]"));
    public static final Target F3_TYPE_NUMERAL = Target.the("Type Numeral").located(By.xpath("(//option[normalize-space()='1630'])[1]"));
    public static final Target F3_INPUT_COIN_NEGOTIATION= Target.the("Input coin negotiation").located(By.xpath("(//input[@id='currencyValueNegotiationBlockFive'])[1]"));
    public static final Target F3_INPUT_COIN_HIRING= Target.the("Input coin hiring").located(By.xpath("(//input[@id='currencyValueBlockFive'])[1]"));
    public static final Target F3_BTN_ADDITION = Target.the("Button Addition").located(By.xpath("(//button[normalize-space()='Adicionar'])[1]"));
    public static final Target F3_INPUT_NAME_F3= Target.the("Input coin negotiation").located(By.xpath("(//input[@id='nameBlockSix'])[1]"));
    public static final Target F3_INPUT_ID_F3= Target.the("Input coin hiring").located(By.xpath("(//input[@id='numberIdentificationBlockSix'])[1]"));
    public static final Target F3_BTN_SAVE= Target.the("Button Save Form").located(By.xpath("(//button[normalize-space()='Guardar'])[1]"));
    public static final Target F3_BTN_SAVE_PARTIAL = Target.the("Button Save Form Partial").located(By.xpath("(//button[normalize-space()='Guardar Parcialmente'])[1]"));
    public static final Target F3_BTN_CANCEL= Target.the("Button Cancel Form").located(By.xpath("(//button[normalize-space()='Cancelar'])[1]"));
}
