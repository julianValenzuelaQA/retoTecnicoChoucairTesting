Feature: Validar creacion de empleado

  Scenario: crear un empleado

    Given el usuario se loguea en orange hrm con usuario "Admin" y contraseña "admin123"
    When el se dirigi ala opcion PIM
    And ingresa en agregar
    And agrega un nuevo usuario con nombre "firstName", "middleName", "lastName", "131417"
    And agrega la informacio adicional username "userName", password "a123456789"
    Then debeira ver el usuario creado con id "131417"