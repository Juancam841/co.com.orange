@Pim @Regression
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

  @adicionarempleado
  Scenario Outline: Adicionar Empleados
    Given Quiero ejecutar transacciones en la plataforma
    And Utilizo mis datos de acceso <user> <pass>
    When Creo un empleado <first> <last> <id>
    Then Se muestra el empleado

    Examples:
      | user  | pass     | id   | first | last  |
      | Admin | admin123 | 1888 | Juan  | Gomez |