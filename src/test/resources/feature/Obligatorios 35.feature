Feature: Med 178 - Obligatorios 35 - servicio de validación de BIN Inhabilitado

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio ry Dado un usuario conectado
    And Obligatorio ry Usuario: <maru>
    And Obligatorio ry Pass: <p456>
    And Obligatorio ry Dentro de La pantalla Alta de responsable de pago desplegada
    And Obligatorio ry los siguientes datos ingresados y confirmados:
    And Obligatorio ry Tipo de Responsable <tipoResponsable>
    And Obligatorio ry PopUp Busqueda de entidades
    And Obligatorio ry Ingreso descripcion <descripcion>
    And Obligatorio ry Ingreso cuit cuil <cuitCuil>
    And Obligatorio ry Busqueda seleccion y confirmacion de entidad
    And Obligatorio ry Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio ry Ingreso eMail <mail>
    And Obligatorio ry Ingreso fecha de vigencia <fechaVigencia>
    When Obligatorio ry Cuando seleccion boton confirmar
    Then Obligatorio ry validar ingreso a Datos fiscales
    And Obligatorio ry Y los siguientes datos ingresados
    And Obligatorio ry Forma de pago habilitada <formaDePago>
    And Obligatorio ry Numero de tarjeta <numeroTarjeta>
    And Obligatorio ry Fecha de vencimiento <fechaVencimiento>
    And Obligatorio ry Tipo de tarjeta <tipoTarjeta>        
    And Obligatorio ry Descripcion de Tarjeta <descripcionTarjeta>
    When Obligatorio ry Seleccion boton guardar
    Then Obligatorio ry Entonces El servicio de validacion de BIN NO completa los datos de tipo y descripcion de tarjeta porque no se encuentra habilitado. 
    #Y QUE PASA… SE PUEDE SEGUIR SIN ESOS DATOS??
    Examples:  
      | tipoResponsable | cuitCuil    | descripcion           | mail             | fechaVigencia | formaDePago | numeroTarjeta | fechaVencimiento | tipoTarjeta | descripcionTarjeta          |
      | Empresa         | 30692272591 | NORAUTO ARGENTINA S.A | catfer@email.com | 09/06/2019    | Debito      | 252352355532  | 102020           | deb         | Dato descripcion de tarjeta |
      
      
      
      
      
      
      
      
      