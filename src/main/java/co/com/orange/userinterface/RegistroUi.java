package co.com.orange.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUi extends PageObject {
    public static final Target USER_INPUT = Target.the("Caja de texto para ingresar el username").locatedBy("//input[@name='username']");
    public static final Target PASS_INPUT = Target.the("Caja de texto para ingresar el password").locatedBy("//input[@name='password']");
    public static final Target LOGIN_BUTTON = Target.the("Boton de confirmacion datos para logueo").locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
}
