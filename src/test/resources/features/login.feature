@Regression
Feature: Dbank
  Yo como usuario, quiero ingresar a la plataforma Dbankdemo para administrar cuentas demo

  @Scenario1
  Scenario Outline: Ingreso usuario
    Given Quiero ejecutar transacciones en la plataforma
    When Utilizo mis datos de acceso <email> <pass>
    Then Accedo a mi cuenta

    Examples:
      | email                | pass      |
      | juancam841@gmail.com | Clave1234 |
  #Crear escenario no feliz donde el SS ya esté registrado
  #Crear escenario no feliz donde no se cumpla con la estructura del Business Need:
  #Crear escenario no feliz donde no se cumpla con la estructura de la contraseña
  #Crear escenario no feliz donde falte algun campo por diligenciar