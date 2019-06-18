Feature: Med 156 - Obligatorios 14 - Validar datos requeridos. Ingreso Manual de datos segun seleccion tipo de responsable = Externo

  Scenario Outline: Comportamiento
    Given Obligatorio N Dado un usuario conectado
    And Obligatorio N Usuario: <maru>
    And Obligatorio N Pass: <p456>    
    And Obligatorio N La pantalla Alta de responsable de pago desplegada
    And Obligatorio N los siguientes datos selccionados:
    And Obligatorio N Tipo de Responsable <tipoResponsable>
    And Obligatorio N y los siguientes datos ingresados
    And Obligatorio N Ingreso de razon social <razonSocial>    
    When Obligatorio N Cuando Seleccionar el Boton Guardar
    Then Obligatorio N Entonces La aplicacion emite un mensaje: El campo CUIT/CUIL es requerdido. Y no guarda los datos
    
	Examples: 
      | tipoResponsable | razonSocial    |
      | Externo         | Samsung S.A.   |
      #re open