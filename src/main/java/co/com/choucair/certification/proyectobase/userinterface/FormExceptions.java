package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormExceptions extends PageObject {

    public static final Target EXCEPTIONS_FORM = Target.the("btn Exceptions form").located(By.xpath("(//a[normalize-space()='Excepciones Canalización F3A'])[1]"));
    public static final Target F3a_BTN_NEW_FORM = Target.the("BNT New Form").located(By.xpath("(//button[normalize-space()='Nuevo Formulario'])[1]"));
    public static final Target F3a_SELECTOR_NUMBER= Target.the("Selector code and number").located(By.xpath("(//select[@id='numberBlockOne'])[1]"));
    public static final Target F3a_TYPE = Target.the("Type code and number").located(By.xpath("(//option[normalize-space()='1. INICIAL'])[1]"));
    public static final Target F3a_TYPE2 = Target.the("Type code and number").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div[1]/div[2]/select/option[3]"));
    public static final Target F3a_SELECTOR_OPERATION = Target.the("Selector operation").located(By.xpath("(//select[@id='operationBlockOne'])[1]"));
    public static final Target F3a_OPERATION = Target.the("Type of operation").located(By.xpath("(//option[normalize-space()='I. Ingreso de Divisas'])[1]"));
    public static final Target F3a_SELECTOR_CITY = Target.the("Selector City").located(By.xpath("//select[@id='cityBlockTwo']"));
    public static final Target F3a_TYPE_CITY= Target.the("Type of City").located(By.xpath("(//option[@value='149'])[1]"));
    public static final Target F3a_INPUT_NUMBER= Target.the("Input number").located(By.xpath("(//input[@id='numberBlockTwo'])[1]"));
    public static final Target F3a_SELECTOR_ACCOUNT= Target.the("Selector Account Compensation").located(By.xpath("//select[@id='compensationAccountCodeBlockTwo']"));
    public static final Target F3a_TYPE_ACCOUNT = Target.the("Type Account Compensation").located(By.xpath("(//option[@value='80700000022'][normalize-space()='80700000022 - 2198704001 - BANCOLOMBIA - PANAMA'])[1]"));
    public static final Target F3a_BTN_CALENDAR= Target.the("Btn Calendar").located(By.xpath("(//button[@id='btn_b3_calendar'])[1]"));
    public static final Target F3a_DATA_PICKER= Target.the("Data picker").located(By.xpath("(//div[contains(text(),'19')])[1]"));
    public static final Target F3a_INPUT_NUMBER_MOD= Target.the("NUmber of Form").located(By.xpath("(//input[@id='numberBlockSeven'])[1]"));
    public static final Target F3a_NUMBER_LENDING_INPUT= Target.the("Number Lending").located(By.xpath("(//input[@id='loanNumberBlockThree'])[1]"));
    public static final Target F3a_CREDITOR_NAME_INPUT= Target.the("creditor name").located(By.xpath("(//input[@id='creditorNameBlockThree'])[1]"));
    public static final Target F3a_SELECT_COIN= Target.the("Selector Coin").located(By.xpath("//select[@id='currencyCodeBlockThree']"));
    public static final Target F3a_TYPE_COIN= Target.the(" Type Coin").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[2]/div[2]/div/div[4]/div[1]/select/option[2]"));
    public static final Target F3a_SELECTOR_CODE= Target.the("Selector CODE").located(By.xpath("//select[@id='codeDescReasonBlockFour']"));
    public static final Target F3a_TYPE_CODE= Target.the(" Type Code").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div/div/select/option[10]"));
    public static final Target F3a_SELECTOR_NUMERAL = Target.the("Selector Numeral").located(By.xpath("(//select[@id='numeralBlockFive'])[1]"));
    public static final Target F3a_TYPE_NUMERAL = Target.the("Type Numeral").located(By.xpath("(//option[normalize-space()='1645'])[1]"));
    public static final Target F3a_INPUT_COIN_NEGOTIATION = Target.the("Input Coin Negotiation").located(By.xpath("(//input[@id='currencyValueBlockFive'])[1]"));
    public static final Target F3a_INPUT_COIN_VALOR = Target.the("Input Coin Hiring").located(By.xpath("(//input[@id='USDValueBlockFive'])[1]"));
    public static final Target F3a_BTN_ADDITION = Target.the("Button Addition").located(By.xpath("(//button[normalize-space()='Adicionar'])[1]"));
    public static final Target F3a_NAME_INPUT= Target.the("Name Input").located(By.xpath("(//input[@id='nameBlockSix'])[1]"));
    public static final Target F3a_IDENTITY_INPUT= Target.the("Identity Input").located(By.xpath("(//input[@id='numberIdentificationBlockSix'])[1]"));
    public static final Target F3a_FIRM_INPUT= Target.the("Firm Input").located(By.xpath("//input[@id='firmBlockSix']"));
    public static final Target F3a_ADDRESS= Target.the("Address Input").located(By.xpath("(//input[@id='addressBlockSix'])[1]"));
    public static final Target F3a_TELEPHONE= Target.the("Telephone Input").located(By.xpath("(//input[@id='phoneBlockSix'])[1]"));
    public static final Target F3a_EMAIL= Target.the("Email Input").located(By.xpath("(//input[@id='emailBlockSix'])[1]"));
    public static final Target F3a_SELECTOR_CITY2= Target.the("Selector City2").located(By.xpath("//select[@id='cityCodeBlockSix']"));
    public static final Target F3a_TYPE_CITY2= Target.the("Selector City2").located(By.xpath("//select[@id='cityCodeBlockSix']//option[@value='126'][normalize-space()='BARRANQUILLA']"));
    public static final Target F3a_BTN_SAVE= Target.the("Button Save Form").located(By.xpath("(//button[normalize-space()='Guardar'])[1]"));
    public static final Target F3a_BTN_SAVE_PARTIAL = Target.the("Button Save Form Partial").located(By.xpath("(//button[normalize-space()='Guardar Parcialmente'])[1]"));
    public static final Target F3a_BTN_CANCEL= Target.the("Button Cancel Form").located(By.xpath("(//button[normalize-space()='Cancelar'])[1]"));
}

