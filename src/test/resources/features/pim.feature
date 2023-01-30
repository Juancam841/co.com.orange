@Pim
Feature: PIM

  @listar
  Scenario Outline: Listar Empleados
    Given Quiero ejecutar transacciones en la plataforma
    And Utilizo mis datos de acceso <user> <pass>
    When Consulto parametros <employee>
    Then Se muestran los resultados <employee>

    Examples:
      | user  | pass     | employee |
      | Admin | admin123 | 0038     |

  @adicionarempleado @Regression @adicionelinaprueba
  Scenario Outline: Adicionar Empleados
    Given Quiero ejecutar transacciones en la plataforma
    And Utilizo mis datos de acceso <user> <pass>
    When Creo un empleado <first> <last> <id>
    Then Se muestra el empleado <first> <last>

    Examples:
      | user  | pass     | id   | first | last  |
      | Admin | admin123 | 1888 | Juan  | Gomez |

  @eliminarempleado @Regression @adicionelinaprueba
  Scenario Outline: Eliminar Empleados
    Given Quiero ejecutar transacciones en la plataforma
    And Utilizo mis datos de acceso <user> <pass>
    When Elimino un empleado <id>
    Then Se muestra el mensaje

    Examples:
      | user  | pass     | id   |
      | Admin | admin123 | 1888 |