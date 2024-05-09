package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormImportPage extends PageObject {

    public static final Target IMPORTS_FORM = Target.the("Imports of Goods Form").located(By.xpath("//a[contains(text(),'Importaciones de Bienes')]"));
    public static final Target F1_SELECTOR_INFO_TYPE = Target.the("sLECTOR WITH INFO TYPE").located(By.id("b1_operationType"));
    public static final Target F1_INFO_TYPE = Target.the("sLECTOR WITH INFO TYPE").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div/div/div[2]/select/option[2]"));
    public static final Target F1_INFO_TYPE_2 = Target.the("sLECTOR WITH INFO TYPE").located(By.xpath("    /html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div/div/div[2]/select/option[3]"));
    public static final Target F1_INFO_TYPE_3 = Target.the("sLECTOR WITH INFO TYPE").located(By.xpath("    /html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[1]/div[2]/div/div/div/div[2]/select/option[5]"));
    public static final Target F1_BTN_CALENDAR= Target.the("Btn Calendar").located(By.xpath("(//button[@id='Btn_b3_calendar'])[1]"));
    public static final Target F1_DATA_PICKER= Target.the("Data picker").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[1]/div[2]/div/div/div[2]/div/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[4]/div"));
    public static final Target F1_INPUT_NUMBER_MOD= Target.the("Data picker").located(By.xpath("  (//input[@id='b3_number'])[1]"));
    public static final Target F1_SELECTOR_CON_NUMBER = Target.the("Selector code and number").located(By.xpath("//select[@id='b2_codeAndNumber']"));
    public static final Target F1_CON_NUMBER = Target.the("Selector code and number").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[2]/div/div[4]/select/option[4]"));
    public static final Target F1_SELECTOR_CODE_COIN = Target.the("Selector code coin").located(By.xpath("(//select[@id='b5_turningCurrencyCode'])[1]"));
    public static final Target F1_CODE_COIN = Target.the("Selector code coin").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div[1]/div/div/div[1]/select/option[2]"));
    public static final Target F1_SELECTOR_NUMERAL= Target.the("Selector numeral").located(By.xpath("(//select[@id='b5_numeral'])[1]"));
    public static final Target F1_NUMERAL1= Target.the("Selector numeral").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div[1]/div/div/div[3]/select/option[2]"));
    public static final Target F1_INPUT_CURRENCY_AMOUNT= Target.the("Input currency amount").located(By.xpath("(//input[@id='b5_turningCurrencyAmount'])[1]"));
    public static final Target F1_SELECTOR_CODE_COIN_2= Target.the("Selector code coin 2").located(By.xpath("(//select[@id='b5_turningCurrencyCode2'])[1]"));
    public static final Target F1_CODE_COIN_2= Target.the("Selector code coin 2").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div[2]/div/div/div[1]/select/option[2]"));
    public static final Target F1_SELECTOR_NUMERAL_2= Target.the("Selector numeral 2").located(By.xpath("(//select[@id='b5_numeral2'])[1]"));
    public static final Target F1_NUMERAL_2= Target.the("Selector numeral 2").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/ngb-accordion/div[3]/div[2]/div/div[2]/div/div/div[3]/select/option[3]"));
    public static final Target F1_INPUT_CURRENCY_AMOUNT_2= Target.the("Input currency amount 2").located(By.xpath("(//input[@id='b5_turningCurrencyAmount2'])[1]"));
    public static final Target F1_INPUT_AMOUNT_2= Target.the("Input  amount 2").located(By.xpath("(//input[@id='b5_usdAmount2'])[1]"));
    public static final Target F1_TEXT_AREA= Target.the("Text Area").located(By.xpath("(//textarea[@id='b6_observation'])[1]"));
    public static final Target F1_IMPORTATION_NUMBER= Target.the("Input importation number").located(By.xpath("(//input[@id='b7_number'])[1]"));
    public static final Target F1_IMPORTATION_VALUE= Target.the("Input importation value").located(By.xpath("(//input[@id='b7_usdValue'])[1]"));
    public static final Target F1_BTN_ADDITION = Target.the("Button addition").located(By.xpath("(//button[normalize-space()='Adicionar'])[1]"));
    public static final Target F1_LABEL_IMPORT_FILE = Target.the("Label import file").located(By.xpath("(//label[normalize-space()='Importar Archivo'])[1]"));
    public static final Target F1_RADIO_BTN_COMPLETE = Target.the("Radio button complete").located(By.xpath("(//input[@id='b7_radioButton2'])[1]"));
    public static final Target F1_RADIO_BTN_INCOMPLETE = Target.the("Radio button incomplete").located(By.xpath("(//input[@id='b7_radioButton2'])[1]"));
    public static final Target F1_BTN_DELETE = Target.the("Button delete").located(By.xpath("(//button[normalize-space()='Eliminar Seleccionados'])[1]"));
    public static final Target F1_BTN_SAVE = Target.the("Button save").located(By.xpath("(//button[normalize-space()='Guardar'])[1]"));
    public static final Target F1_BTN_SAVE_PARTIAL = Target.the("Button save partial").located(By.xpath("(//button[normalize-space()='Guardar Parcialmente'])[1]"));
    public static final Target F1_BTN_CANCEL = Target.the("Button cancel").located(By.xpath("(//button[normalize-space()='Cancelar'])[1]"));



}


