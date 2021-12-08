package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Login implements Task {
    public static Performable onthePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("Laura Daniela").into(ChoucairLoginPage.INPUT_NAME),
                Enter.theValue("Paz Silva").into(ChoucairLoginPage.INPUT_LASTNAME),
                Enter.theValue("ldpaz61@misena.edu.co").into(ChoucairLoginPage.INPUT_MAIL),
                SelectFromOptions.byVisibleText("September").from(ChoucairLoginPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("11").from(ChoucairLoginPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("2001").from(ChoucairLoginPage.SELECT_YEAR),
                Click.on(ChoucairLoginPage.ENTER_BUTTON));
        try{
            Thread.sleep(6000);
        }
        catch(InterruptedException ie){
        }
        actor.attemptsTo(Click.on(ChoucairLoginPage.ENTER_BUTTON2),
                Click.on(ChoucairLoginPage.CLICK_MOBILE));
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }
        actor.attemptsTo(Hit.the(Keys.ENTER).into(ChoucairLoginPage.INPUT_MOBILE),
                Click.on(ChoucairLoginPage.ENTER_BUTTON3),
                Enter.theValue("D@niela12345*").into(ChoucairLoginPage.INPUT_PASSWORD),
                Enter.theValue("D@niela12345*").into(ChoucairLoginPage.INPUT_CONFIRMPASSWORD),
                Click.on(ChoucairLoginPage.CLICK_CHECK),
                Click.on(ChoucairLoginPage.CLICK_CHECK2),
                Click.on(ChoucairLoginPage.ENTER_BUTTON4)
        );
    }
}
