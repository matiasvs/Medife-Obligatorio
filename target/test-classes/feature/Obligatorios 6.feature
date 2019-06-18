Feature: Med 148 - Obligatorios 066 - N registros

  Scenario Outline: Comportamiento
    Given Obligatorio F Ventana Buscador de Entidades desplegada con el siguiente resultado de la busqueda ejecuta listado en la grilla
    And Obligatorio F Seleccionar tipo de responsable <tipoResponsable>
    And Obligatorio F ingreso descripcion <descripcion>
    And Obligatorio F ingreso cuit cuil <cuitCuil>
    When Obligatorio F el cursor marca el ultimo registro y Selecciona el Boton Seleccionar
    Then Obligatorio F La aplicacion cierra la ventana Buscador de Entidades y los datos del registro seleccionado se visualizan  ingresados en la pantalla Alta de Responsable de Pago no permitiendo su edicion
    
	Examples: 
      | tipoResponsable | descripcion  | cuitCuil |
      | Empresa         |              |          |
      
      #crear funciona para tomar el valor de la descripcion en el popUp de busque da entidad y luego compararlo en alta de responsabilidad de pago