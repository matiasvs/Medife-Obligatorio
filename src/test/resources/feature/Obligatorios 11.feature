Feature: Med 153 - Obligatorios 11 - Validar Funcionamiento de la Pantalla de 
Resultados del Buscador de Entidades. Bot�n Seleccionar 1 registro

  Scenario Outline: Comportamiento
    Given Obligatorio K Dado un usuario conectado
    And Obligatorio K Usuario: <maru>
    And Obligatorio K Pass: <p456>    
    And Obligatorio K La pantalla Alta de responsable de pago desplegada
    And Obligatorio K los siguientes datos ingresados:
    And Obligatorio K Tipo de Responsable <tipoResponsable>
    And Obligatorio K Ventana Buscador de Entidades desplegada con el siguiente resultado listado en la grilla, de la busqueda ejecutada
    And Obligatorio K Ingreso de descripcion <descripcion>
    And Obligatorio k Ingreso de cuit cuil <cuitCuil>
    And Obligatorio K ingreso fecha de vigencia <fechaVigencia>    
    When Obligatorio K Cuando Selecciono el Boton Seleccionar
    Then Obligatorio K La aplicacion cierra la ventana Buscador de Entidades y los datos seleccionados se visualizan ingresados en la pantalla Alta de Responsable de Pago no permitiendo su edicion
    
	Examples: 
      | tipoResponsable | descripcion | cuitCuil    | fechaVigencia |
      | Grupo           | RETEGUI  | 20208377923 | 15/06/2019 |
      #Falta validar la descripcion y cuit dentro de datos fiscales