package co.com.choucair.certification.proyectobase.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;




@DefaultUrl("https://apolo-osp-qa-ui.todo-1.com/BC_SVE_User/Login")
    public class QaPage extends PageObject {

    public static final Target SVE_TITTLE = Target.the("title of SVE webpage").located(By.id("TitleText"));
    public static final Target USER_SVE = Target.the("USER").located(By.xpath("(//input[@id='InputUserName'])[1]"));
    public static final Target PASSWORD_SVE = Target.the("PASSWORD").located(By.xpath("(//input[@id='InputUserPassword'])[1]"));
    public static final Target BTN_CONTINUE_SVE = Target.the("Accept Button Tester").located(By.xpath("(//div[@id='BtnLogin'])[1]"));
    public static final Target BTN_COMERCE = Target.the(" Button Commerce").located(By.xpath("(//span[normalize-space()='Comercio internacional'])[1]"));
    public static final Target BTN_MENU_HDC = Target.the(" Button app").located(By.xpath("/html/body/div/div/div/div[1]/div[1]/aside/div/div/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/span"));
    public static final Target BTN_PDC = Target.the(" Button process declarations of change").located(By.xpath("/html/body/app-sub-root/app-root/div/app-horizontal-menu/div/nav/div/ul/li[2]/a"));
    }


