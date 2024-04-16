package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormMovements extends PageObject {
    public static final Target MOVEMENTS_FORM = Target.the("btn Movements form").located(By.xpath("(//a[normalize-space()='Informe de Movimientos'])[1]"));
    public static final Target MF_BTN_NEW_FORM = Target.the("BNT New Form").located(By.xpath("(//button[normalize-space()='Nuevo Formulario'])[1]"));
    public static final Target MF_SELECT_ACCOUNT = Target.the("Select Account").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[3]/div[2]/div/select"));
    public static final Target MF_TYPE_ACCOUNT = Target.the("Type Account").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[3]/div[2]/div/select/option[3]"));
    public static final Target MF_SELECT_MONTH = Target.the("Select Account").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[4]/div[2]/div/select[2]"));
    public static final Target MF_TYPE_MONTH = Target.the("Type Account").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/form/div[4]/div[2]/div/select[2]/option[4]"));
    public static final Target MF_BTN_CONSULT = Target.the("BNT Consult").located(By.xpath("(//button[normalize-space()='Consultar'])[1]"));
    public static final Target MF_CHK1 = Target.the("CHK 1").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/div[2]/table/tr[2]/th/input"));
    public static final Target MF_CHK2 = Target.the("CHK 2").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/div[2]/table/tr[4]/th/input"));
    public static final Target MF_CHK3 = Target.the("CHK 3").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/div[2]/table/tr[5]/th/input"));
    public static final Target MF_CHK4 = Target.the("CHK 4").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/div[2]/table/tr[6]/th/input"));
    public static final Target MF_CHK5 = Target.the("CHK 5").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/div[2]/table/tr[7]/th/input"));
    public static final Target MF_BTN_CONSOLIDATE = Target.the("BNT Consolidate").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-form/div/div[3]/button"));
    public static final Target MF_BTN_SAVE= Target.the("BNT Save").located(By.xpath("(//button[normalize-space()='Guardar'])[1]"));
    public static final Target MF_BTN_CANCEL= Target.the("BNT Cancel").located(By.xpath("(//button[normalize-space()='Cancelar'])[1]"));
    public static final Target MF_BTN_XML= Target.the("BNT XML").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-list/div/div[2]/app-table-information/div[1]/div[2]/table/tbody/tr[1]/td[3]/button/span"));
    public static final Target MF_SELECT_TD = Target.the("Select Account").located(By.xpath("(//select[@id='idTipoIdentificacion'])[1]"));
    public static final Target MF_TYPE_DOC = Target.the("Type Account").located(By.xpath("/html/body/ngb-modal-window/div/div/app-modal-identification-user-xmlf10/div/form/div/table/tbody/tr[1]/td[1]/select/option[2]"));
    public static final Target MF_INPUT_DOC = Target.the("Select Account").located(By.xpath("(//input[@id='identificacion'])[1]"));
    public static final Target MF_BTN_SAVE_2 = Target.the("btn Save 2").located(By.xpath("(//button[normalize-space()='Guardar'])[1]"));
    public static final Target MF_MESSAGE = Target.the("Alerta creado").located(By.xpath("(//article[@id='idAlerta'])[1]"));
}

