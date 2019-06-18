Feature: Med 149 - Obligatorios 07 - Validar comportamiento de la pantalla segun 
seleccion tipo de responsable = Grupo Familiar

  Scenario Outline: Comportamiento
    Given Obligatorio G Dado un usuario conectado
    And Obligatorio G Usuario: <maru>
    And Obligatorio G Pass: <p456>    
    And Obligatorio G La pantalla Alta de responsable de pago desplegada
    And Obligatorio G los siguientes datos ingresados:
    And Obligatorio G Tipo de Responsable <tipoResponsable>
    Then Obligatorio G Se habilita el boton del Buscador, que permitira la seleccion de entidades
    
	Examples: 
      | tipoResponsable |
      | Grup            |