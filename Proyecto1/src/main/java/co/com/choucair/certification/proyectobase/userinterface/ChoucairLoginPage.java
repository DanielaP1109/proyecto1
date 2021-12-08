package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[@class='container center-text']//a[@class='ng-binding btn btn-unauth margin-bottom-100']"));
    public static final Target INPUT_NAME = Target.the("where do we write the name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the lastname")
            .located(By.id("lastName"));
    public static final Target INPUT_MAIL = Target.the("where do we write the mail")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("select the birth month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("select the birth day")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("select the birth year")
            .located(By.id("birthYear"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm info")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target ENTER_BUTTON2 = Target.the("button to confirm location")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target CLICK_MOBILE = Target.the("Click in mobile")
            .located(By.xpath("//div[@placeholder='Select Brand']//i[@class='caret pull-right']"));
    public static final Target INPUT_MOBILE = Target.the("select the mobile")
            .located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target ENTER_BUTTON3 = Target.the("button to confirm devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.name("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("where do we write the confirmpassword")
            .located(By.name("confirmPassword"));
    public static final Target CLICK_CHECK = Target.the("button to confirm info")
            .located(By.name("termOfUse"));
    public static final Target CLICK_CHECK2 = Target.the("button to confirm info")
            .located(By.name("privacySetting"));
    public static final Target ENTER_BUTTON4 = Target.the("button to confirm info")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}