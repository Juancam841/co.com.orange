@Regression
Feature: Dbank
  Yo como usuario, quiero tener acceso a la plataforma Dbankdemo para administrar cuentas demo

  @Scenario1
  Scenario Outline: Registro de nuevo cliente
    Given Quiero ejecutar transacciones en la plataforma
    When Me registro con todos los datos
      | title | first_name | last_name | gender | date_birth | social      | email                | pass      |
      | Mr.   | Juan       | Villa     | M      | 18/02/1983 | 907-00-3456 | juancam@gmail.com | Clave1234 |
    Then La cuenta se crea con sus credenciales <resp>

    Examples:
    | resp |
    | 400  |
  #Crear escenario no feliz donde el SS ya esté registrado
  #Crear escenario no feliz donde no se cumpla con la estructura del Business Need:
  #Crear escenario no feliz donde no se cumpla con la estructura de la contraseña
  #Crear escenario no feliz donde falte algun campo por diligenciar