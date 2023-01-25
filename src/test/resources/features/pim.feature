@PIM
Feature: PIM

  @listar
  Scenario Outline: Listar Empleados
    Given Quiero ejecutar transacciones en la plataforma
    And Utilizo mis datos de acceso <user> <pass>
    When Consulto parametros <employee>
    Then Se muestran los resultados

    Examples:
      | user  | pass     | employee |
      | Admin | admin123 | 0038     |