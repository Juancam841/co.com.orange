package co.com.orange.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Dashboard2UI extends PageObject {
    public static final Target EMPLOYID_TEXTB_2 = Target.the("Caja de texto del id del empleado").
            locatedBy("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6");
}
