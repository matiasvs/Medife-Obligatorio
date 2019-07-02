Feature: Med 160 - Obligatorios 18 - Validar Datos Requeridos
  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio S Dado un usuario conectado
    And Obligatorio S Usuario: <maru>
    And Obligatorio S Pass: <p456>    
    And Obligatorio S La pantalla Alta de responsable de pago desplegada
    And Obligatorio S los siguientes datos seleccionados:
    And Obligatorio S Tipo de Responsable <tipoResponsable>
    And Obligatorio S y los siguientes datos ingresados
    And Obligatorio S Ingreso Razon social - Apellido nombre <razonSocial>
    And Obligatorio S Ingreso Email <email>
    When Obligatorio S Cuando Seleccionar el Boton Confirmar
    Then Obligatorio S Entonces la aplicacion emite un mensaje indicando que el Cuit es requerido. Y no guarda los datos y no habilita la seccion Daatos Fiscales
    
	Examples: 
      | tipoResponsable | razonSocial        | email            |
      | Externo         | Catalina Fernandez | catfer18@email.com |
      #reacer la validacion