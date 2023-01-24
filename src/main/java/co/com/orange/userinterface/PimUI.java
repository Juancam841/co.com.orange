package co.com.orange.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PimUI extends PageObject {
    public static final Target PIM_BUTTON = Target.the("Boton de Seccion PIM").
            locatedBy("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
    public static final Target EMPLOYEEID_TXT = Target.the("Campo de texto para consultar empleado por id").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input");
}
