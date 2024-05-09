package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormInternationalInvestments extends PageObject {


    public static final Target INTERNATIONAL_INVESTMENTS_FORM = Target.the("btn Exports form").located(By.xpath("(//a[normalize-space()='Inversiones Internacionales'])[1]"));
    public static final Target F4_BTN_NEW_FORM = Target.the("BNT New Form").located(By.xpath("(//button[normalize-space()='Nuevo Formulario'])[1]"));
    public static final Target F4_SELECTOR_TYPE= Target.the("Selector code and number").located(By.xpath("(//select[@id='numberBlockOne'])[1]"));
    public static final Target F4_TYPE = Target.the("Type code and number").located(By.xpath("//option[normalize-space()='1. INICIAL']"));
    public static final Target F4_TYPE_2 = Target.the("Type code and number").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div[1]/div[2]/select/option[5]"));
    public static final Target F4_TYPE_3 = Target.the("Type code and number").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div[1]/div[2]/select/option[3]"));
    public static final Target F4_SELECTOR_OPERATION = Target.the("Selector operation").located(By.xpath("(//select[@id='operationBlockOne'])[1]"));
    public static final Target F4_OPERATION = Target.the("Type of operation").located(By.xpath("//option[normalize-space()='I. Ingreso de Divisas']"));
    public static final Target F4_SELECTOR_CITY = Target.the("Selector City").located(By.xpath("(//select[@id='cityBlocktwo'])[1]"));
    public static final Target F4_TYPE_CITY= Target.the("Type of City").located(By.xpath("//option[normalize-space()='BUENOS AIRES']"));
    public static final Target F4_SELECTOR_ACCOUNT= Target.the("Selector Account Compensation").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[4]/div/div[5]/select"));
    public static final Target F4_TYPE_ACCOUNT = Target.the("Type Account Compensation").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[4]/div/div[5]/select/option[4]"));
    public static final Target F4_BTN_CALENDAR= Target.the("Btn Calendar").located(By.xpath("(//button[@id='btn_b3_calendar'])[1]"));
    public static final Target F4_DATA_PICKER= Target.the("Selector Account Compensation").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[1]/div[2]/div/div/div[2]/div/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[4]/div"));
    public static final Target F4_INPUT_NUMBER_MOD= Target.the("NUmber of Form").located(By.xpath("(//input[@id='numberBlockthree'])[1]"));
    public static final Target F4_RADIO_BTN_1= Target.the("Radio bnt 1").located(By.xpath("(//input[@id='radioButtonBlockFour1'])[1]"));
    public static final Target F4_RADIO_BTN_2= Target.the("Radio bnt 2").located(By.xpath("//div[normalize-space()='CSRE - Capital asignado sucursal régimen especial.']//input[@name='radioButtonBlockFour']"));
    public static final Target F4_RADIO_BTN_3= Target.the("Radio bnt 3").located(By.xpath("//div[normalize-space()='CSRG - Capital asignado sucursal régimen general.']//input[@name='radioButtonBlockFour']"));
    public static final Target F4_RADIO_BTN_4= Target.the("Radio bnt 4").located(By.xpath("(//input[@name='radioButtonBlockFour'])[4]"));
    public static final Target F4_RADIO_BTN_5= Target.the("Radio btn 5").located(By.xpath("(//input[@name='radioButtonBlockFour'])[5]"));
    public static final Target F4_RADIO_BTN_6= Target.the("Radio btn 6").located(By.xpath("(//input[@name='radioButtonBlockFour'])[6]"));
    public static final Target F4_RADIO_BTN_7= Target.the("Radio btn 7").located(By.xpath("(//input[@name='radioButtonBlockFour'])[7]"));
    public static final Target F4_RADIO_BTN_8= Target.the("Radio btn 8").located(By.xpath("(//input[@name='radioButtonBlockFour'])[8]"));
    public static final Target F4_RADIO_BTN_9= Target.the("Radio btn 9").located(By.xpath("(//input[@name='radioButtonBlockFour'])[9]"));
    public static final Target F4_RADIO_BTN_10= Target.the("Radio btn 10").located(By.xpath("(//input[@name='radioButtonBlockFour'])[10]"));
    public static final Target F4_RADIO_BTN_11= Target.the("Radio btn 11").located(By.xpath("(//input[@name='radioButtonBlockFour'])[11]"));
    public static final Target F4_RADIO_BTN_12= Target.the("Radio btn 12").located(By.xpath("(//input[@name='radioButtonBlockFour'])[12]"));
    public static final Target F4_RADIO_BTN_15= Target.the("Radio btn 15").located(By.xpath("(//input[@name='radioButtonBlockFour'])[13]"));
    public static final Target F4_RADIO_BTN_16= Target.the("Radio btn 16").located(By.xpath("(//input[@name='radioButtonBlockFour'])[14]"));
    public static final Target F4_RADIO_BTN_51= Target.the("Radio btn 51").located(By.xpath("(//input[@name='radioButtonBlockFour'])[15]"));
    public static final Target F4_RADIO_BTN_52= Target.the("Radio btn 52").located(By.xpath("(//input[@name='radioButtonBlockFour'])[16]"));
    public static final Target F4_SELECT_COUNTRY_2= Target.the(" selector city 2").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div[2]/div[1]/select"));
    public static final Target F4_TYPE_COUNTRY2= Target.the(" Type country 2").located(By.xpath("(//option[@value='10'][normalize-space()='AR - ARGENTINA'])[1]"));
    public static final Target F4_SELECT_CITY_2= Target.the(" selector city 2").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div[2]/div[2]/select"));
    public static final Target F4_TYPE_CITY2= Target.the(" Type city 2").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div[2]/div[2]/select/option[30]"));
    public static final Target F4_INPUT_PHONE= Target.the("Input Phone").located(By.xpath("(//input[@id='phoneBlockFive'])[1]"));
    public static final Target F4_SELECT_CIUU= Target.the(" selector ciuu 2").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div[2]/div[4]/select"));
    public static final Target F4_TYPE_CIUU= Target.the(" Type ciuu 2").located(By.xpath("(//option[@value='3'][normalize-space()='0113'])[1]"));
    public static final Target F4_SELECT_TYPE_DOC= Target.the("Selector Document").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[4]/div[2]/div/div[1]/div[1]/select"));
    public static final Target F4_TYPE_DOC= Target.the(" Type Doc").located(By.xpath("(//option[@value='1'][normalize-space()='CC'])[1]"));
    public static final Target F4_INPUT_DOC= Target.the("Input number doc").located(By.xpath("(//input[@id='identificationNumberBlockSix'])[1]"));
    public static final Target F4_INPUT_NAME= Target.the("Input Name").located(By.xpath("(//input[@id='NameBlockSix'])[1]"));
    public static final Target F4_SELECT_COUNTRY= Target.the("Select Country").located(By.xpath("(//select[@id='countryCodeBlockSix'])[1]"));
    public static final Target F4_COUNTRY = Target.the("Type Country").located(By.xpath("(//option[@value='30'][normalize-space()='BR - BRASIL'])[2]"));
    public static final Target F4_SELECT_NUMERAL = Target.the("Selector Numeral").located(By.xpath("(//select[@id='numeralBlockSeven'])[1]"));
    public static final Target F4_TYPE_NUMERAL = Target.the("Type Numeral").located(By.xpath("(//option[normalize-space()='4035'])[1]"));
    public static final Target F4_SELECT_COIN = Target.the("Selector Coin").located(By.xpath("//select[@id='currencyBlockSeven']"));
    public static final Target F4_TYPE_COIN = Target.the("Type Coin ").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[5]/div[2]/div/div[1]/div[2]/select/option[2]"));
    public static final Target F4_INPUT_VALUE_COIN = Target.the("Input Value Coin").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[5]/div[2]/div/div[1]/div[3]/input"));
    public static final Target F4_INPUT_VALUE_USD = Target.the("Input Value USD").located(By.xpath("//input[@id='usdValueBlockSeven']"));
    public static final Target F4_INPUT_CHANGE = Target.the("Input Change").located(By.xpath("(//input[@id='pesosChangeTypeBlockSeven'])[1]"));
    public static final Target F4_INPUT_ACTIONS = Target.the("Input Actions").located(By.xpath("(//input[@id='actionsOrFeesBlockSeven'])[1]"));
    public static final Target F4_INPUT_PARTICIPANTS = Target.the("Input Participants").located(By.xpath("(//input[@id='actionsOrFeesBlockSeven'])[1]"));
    public static final Target F4_BTN_SAVE= Target.the("Button Save Form").located(By.id("btnGuardar"));
    public static final Target F4_BTN_SAVE_PARTIAL = Target.the("Button Save Form Partial").located(By.xpath("(//button[normalize-space()='Guardar Parcialmente'])[1]"));
    public static final Target F4_BTN_CANCEL= Target.the("Button Cancel Form").located(By.xpath("(//button[normalize-space()='Cancelar'])[1]"));
}


