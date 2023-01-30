package co.com.orange.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PimUI extends PageObject {
    public static final Target PIM_BUTTON = Target.the("Boton de Seccion PIM").
            locatedBy("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
    public static final Target EMPLOYEE_BUTTON = Target.the("Boton seccion employee list").
            locatedBy("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
    public static final Target EMPLOYEEID_TXT = Target.the("Campo de texto para consultar empleado por id").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input");
    public static final Target SEARCH_BUTTON = Target.the("Boton para ejecitar la busqueda").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
    public static final Target ID_TXT = Target.the("Campo de texto sonde se encuentra el id del empleado buscado").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div");
    public static final Target FIRST_TXT = Target.the("Caja de texto para ingresar el nombre").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input");
    public static final Target LAST_TXT = Target.the("Caja de texto para ingresar el apellido").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input");
    public static final Target IDCREAR_TXT = Target.the("Caja de texto para ingresar el id del empleado").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");
    public static final Target SAVE_BUTTON = Target.the("Boton para enviar formulario de empleado creado").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
    public static final Target ADDEMPLOYEE_BUTTON = Target.the("Boton de acceso a AddEmployee").
            locatedBy("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a");
    public static final Target NAME_TXT = Target.the("Texto del nombre del empleado creado").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6");
    public static final Target DELETE_BUTTON = Target.the("Boton para ejecutar el delete").
            locatedBy("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]");
    public static final  Target CONFIRMDELETE_BUTTON = Target.the("Boton de confirmacion eliminacion").
            locatedBy("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]");
}
