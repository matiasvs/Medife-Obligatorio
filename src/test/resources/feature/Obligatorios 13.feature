Feature: Med 155 - Obligatorios 13 new - Validar Botón Guardar en el Ingreso Manual de datos según selección tipo de responsable = Externo

  Scenario Outline: Comportamiento
    Given Obligatorio M Dado un usuario conectado
    And Obligatorio M Usuario: <maru>
    And Obligatorio M Pass: <p456>    
    And Obligatorio M La pantalla Alta de responsable de pago desplegada
    And Obligatorio M los siguientes datos selccionados:
    And Obligatorio M Tipo de Responsable <tipoResponsable>
    And Obligatorio M los siguientes datos ingresados
    And Obligatorio M Ingreso de cuit cuil <cuitCuil>    
    When Obligatorio M Cuando Seleccionar el Boton Guardar
    Then Obligatorio M Guarda los datos ingresados e inicia el proceso, habilitando la seccion Datos Fiscales.
    
	Examples: 
      | tipoResponsable | cuitCuil    |
      | Externo         | 20336898243 |