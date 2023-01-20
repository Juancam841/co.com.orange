package co.com.orange.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DashboardUi extends PageObject {
    public static final Target MYIFO_BUTTON = Target.the("Boton de acceso a MyInfo").locatedBy("//a[@href='/web/index.php/pim/viewMyDetails']");
    public static final Target EMPLOYID_TEXTBOX = Target.the("Caja de texto del id del empleado").locatedBy("div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container div.orangehrm-edit-employee div.orangehrm-edit-employee-content div.orangehrm-horizontal-padding.orangehrm-vertical-padding form.oxd-form div.oxd-form-row:nth-child(3) div.oxd-grid-3.orangehrm-full-width-grid:nth-child(1) div.oxd-grid-item.oxd-grid-item--gutters:nth-child(1) div.oxd-input-group.oxd-input-field-bottom-space > div:nth-child(2)");

}
