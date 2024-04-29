package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class XmlFm {
    public static final Target MOVEMENTS_FORM = Target.the("btn Movements form").located(By.xpath("(//a[normalize-space()='Informe de Movimientos'])[1]"));
    public static final Target BTN_XML= Target.the("BNT XML").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-list/div/div[2]/app-table-information/div[1]/div[2]/table/tbody/tr[1]/td[3]/button/span"));
    public static final Target SELECT_TD = Target.the("Select Account").located(By.xpath("(//select[@id='idTipoIdentificacion'])[1]"));
    public static final Target TYPE_DOC = Target.the("Type Account").located(By.xpath("/html/body/ngb-modal-window/div/div/app-modal-identification-user-xmlf10/div/form/div/table/tbody/tr[1]/td[1]/select/option[2]"));
    public static final Target INPUT_DOC = Target.the("Select Account").located(By.xpath("(//input[@id='identificacion'])[1]"));
    public static final Target BTN_ACCEPT = Target.the("btn Save 2").located(By.xpath("(//button[normalize-space()='Guardar'])[1]"));
    public static final Target BTN_PDF= Target.the("BNT PFD").located(By.xpath("/html/body/app-sub-root/app-root/div/div/div[2]/app-container/main/div/app-list/div/div[2]/app-table-information/div[1]/div[2]/table/tbody/tr[1]/td[2]/button"));

}
