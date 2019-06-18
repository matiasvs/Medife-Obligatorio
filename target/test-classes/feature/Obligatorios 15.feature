Feature: Med 157 - Obligatorios 15 - Validar CUIT/CUIL Ingreso Manual Datos Invalidos

  Scenario Outline: Comportamiento
    Given Obligatorio p Dado un usuario conectado
    And Obligatorio p Usuario: <maru>
    And Obligatorio p Pass: <p456>    
    And Obligatorio p La pantalla Alta de responsable de pago desplegada
    And Obligatorio p los siguientes datos seleccionados:
    And Obligatorio p Tipo de Responsable <tipoResponsable>
    And Obligatorio p y los siguientes datos ingresados cuit cuil <cuitCuil>    
    When Obligatorio p Cuando Seleccionar el Boton Guardar
    Then Obligatorio p La aplicacion emite un mensaje: Formato CUIT/CUIL invalido. Y no guarda los datos
    
	Examples: 
      | tipoResponsable | descipcion                              | cuitCuil     |
      | Externo         | TIERRA COOP DE TRAB. VIV. Y CONS. LTDA. | 20/3368982+3 |
      #No muestra el mensaje esperado