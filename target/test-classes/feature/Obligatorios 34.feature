Feature: Med 177 - Obligatorios 34as - servicio de validación de BIN habilitado

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio dl Dado un usuario conectado
    And Obligatorio dl Usuario: <maru>
    And Obligatorio dl Pass: <p456>
    And Obligatorio dl Dentro de La pantalla Alta de responsable de pago desplegada
    And Obligatorio dl los siguientes datos ingresados y confirmados:
    And Obligatorio dl Tipo de Responsable <tipoResponsable>
    And Obligatorio dl PopUp Busqueda de entidades
    And Obligatorio dl Ingreso descripcion <descripcion>
    And Obligatorio dl Ingreso cuit cuil <cuitCuil>
    And Obligatorio dl Busqueda seleccion y confirmacion de entidad
    And Obligatorio dl Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio dl Ingreso eMail <mail>
    And Obligatorio dl Ingreso fecha de vigencia <fechaVigencia>
    When Obligatorio dl Cuando seleccion boton confirmar
    Then Obligatorio dl validar ingreso a Datos fiscales
    And Obligatorio dl Y los siguientes datos ingresados
    And Obligatorio dl Forma de pago habilitada <formaDePago>
    And Obligatorio dl Tipo de tarjeta <tipoTarjeta>
    And Obligatorio dl Numero de tarjeta <numeroTarjeta>
    And Obligatorio dl Fecha de vencimiento <fechaVencimiento>
    And Obligatorio dl Descripcion de Tarjeta <descripcionTarjeta>
    When Obligatorio dl Seleccion boton guardar
    Then Obligatorio dl El servicio de validacion de BIN completa los datos de tipo y descripcion de tarjeta en caso de estar habilitado.    
    
    Examples:  
      | tipoResponsable | cuitCuil    | descripcion                | mail               | fechaVigencia | formaDePago       | tipoTarjeta | numeroTarjeta | descripcionTarjeta          |
      | Empresa         | 30501036672 | LA PAPELERA DEL PLATA S.A. | catfer@email.com   | 09/06/2019    | Debito automatico | tarjeta     | 123456321654  | Dato descripcion de tarjeta |
      
      
      