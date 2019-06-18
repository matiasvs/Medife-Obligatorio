Feature: Med 127 - Obligatorios 02 - Validar comportamiento de la pantalla segun seleccion tipo de responsable = Empresa

  Scenario Outline: Comportamiento
    And Obligatorio B La pantalla Alta de responsible de pago desplegadas
    And Obligatorio B Desplegado el combo Tipo de responsable
    When Obligatorio B selecciona el campo Tipo de Responsable <tipoResponsable>
    Then Obligatorio B Entonces se habilita el boton del Buscador que permitira la seleccion de entidades
    
	Examples: 
      | tipoResponsable |
      | Empresa         |