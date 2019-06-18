Feature: Med 154 - Obligatorios 12 - Validar comportamiento de la pantalla segun selección tipo de responsable = Externo

  Scenario Outline: Comportamiento
    Given Obligatorio nm Dado un usuario conectado
    And Obligatorio nm Usuario: <maru>
    And Obligatorio nm Pass: <p456>    
    And Obligatorio nm La pantalla Alta de responsable de pago desplegada
    And Obligatorio nm Tipo de Responsable <tipoResponsable>
    And Obligatorio nm Ventana Buscador de Entidades desplegada con el siguiente resultado listado en la grilla, de la busqueda ejecutada
    And Obligatorio nm Ingreso de descripcion <descripcion>
    When Obligatorio nm Selecciono valor Externo para el campo tipo de responsable
    Then Obligatorio nm Entonces La aplicacion habilita los campos para ingresar los datos manualmente
    Then Obligatorio nm Excepto: Fecha de Baja y Estado que no son Editables
    Then Obligatorio nm Inhabilita el Boton Buscador de entidades
    
	Examples: 
      | tipoResponsable | descripcion | cuitCuil    | fechaVigencia |
      | Externo          | GOMEZ | 20318861200 | 15/06/2019 |