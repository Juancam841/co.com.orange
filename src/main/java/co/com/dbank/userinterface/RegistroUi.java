package co.com.dbank.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUi extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("Link de acceso al registro").locatedBy("//*[contains(text(),'Sign Up Here')]");
    public static final Target FIRTS_INPUT = Target.the("Caja de texto para ingresar el nombre").locatedBy("//input[@id='firstName']");
    public static final Target LAST_INPUT = Target.the("Caja de texto para ingresar el apeelido").locatedBy("//input[@id='lastName']");
    public static final Target DOB_INPUT = Target.the("Caja de texto para ingresar la fecha de nacimiento").locatedBy("//input[@id='dob']");
    public static final Target SS_INPUT = Target.the("Caja de texto para ingresar numero de seguridad social").locatedBy("//input[@id='ssn']");
    public static final Target EMAIL_INPUT = Target.the("Caja de texto para ingresar el email").locatedBy("//input[@id='emailAddress']");
    public static final Target PASS_INPUT = Target.the("Caja de texto para ingresar password").locatedBy("//input[@id='password']");
    public static final Target CONFIRMPASS_INPUT = Target.the("Caja de texto para ingresar la confirmarcion password").locatedBy("//input[@id='confirmPassword']");
    public static final Target TITLE_SELECT = Target.the("Seleccion del genero").locatedBy("//select[@id='title']");
    public static final Target GENDERM_CHECK = Target.the("Check seleccion masculino").locatedBy("//input[@value='M']");
    public static final Target GENDERF_CHECK = Target.the("Check genero femenino").locatedBy("//input[@value='F']");
    public static final Target NEXT_BUTTON = Target.the("Boton para confirmar registro").locatedBy("//button[contains(text(),'Next')]");
    public static final Target RESPONSE_H1 = Target.the("Texto que indica que pasa de pagina de registro").locatedBy("//h1[contains(text(),'400')]");
    public static final Target USER_INPUT = Target.the("Caja de texto para ingresar usuario").locatedBy("//input[@id='username']");
    public static final Target PASSLOGIN_INPUT = Target.the("Caja de texto para ingresar el password").locatedBy("//input[@id='password']");
    public static final Target SUBMIT_BUTTON = Target.the("Boton para confirmar datos de acceso").locatedBy("//button[@id='submit']");
}
