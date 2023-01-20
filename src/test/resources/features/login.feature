@Regression
Feature: Orange
  Yo como usuario, quiero ingresar a la plataforma Orange para administrar

  @Scenario1
  Scenario Outline: Ingreso usuario
    Given Quiero ejecutar transacciones en la plataforma
    When Utilizo mis datos de acceso <user> <pass>
    Then Accedo a mi cuenta <id> <id1>

    Examples:
      | user  | pass     | id   | id1      |
      | Admin | admin123 | Paul | Collings |
  #Crear escenario no feliz donde el SS ya esté registrado
  #Crear escenario no feliz donde no se cumpla con la estructura del Business Need:
  #Crear escenario no feliz donde no se cumpla con la estructura de la contraseña
  #Crear escenario no feliz donde falte algun campo por diligenciar