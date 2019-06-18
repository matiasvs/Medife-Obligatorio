Feature: Med 158 - Obligatorios 166 - A Validar CUIT/CUIL Ingreso Manual Datos existentes
  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio R Dado un usuario conectado
    And Obligatorio R Usuario: <maru>
    And Obligatorio R Pass: <p456>    
    And Obligatorio R La pantalla Alta de responsable de pago desplegada
    And Obligatorio R los siguientes datos seleccionados:
    And Obligatorio R Tipo de Responsable <tipoResponsable>
    And Obligatorio R y los siguientes datos ingresados cuit cuil <cuitCuil>    
    When Obligatorio R Cuando se Selecciona el Boton Guardar o Confirmar
    Then Obligatorio R La aplicacion emite un mensaje: CUIT - CUIL invalido. Ya existe un asociado activo que posee el cuit - cuil Y no guarda los datos
    
	Examples: 
      | tipoResponsable | cuitCuil     |
      | Externo         | 20/336898243 |