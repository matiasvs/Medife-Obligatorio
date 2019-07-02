Feature: Med 163 - Obligatorios 21 - Validar comportamiento pantalla segun valor campo Condicion de IVA "Consumidor final"

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio fg Dado un usuario conectado
    And Obligatorio fg Usuario: <maru>
    And Obligatorio fg Pass: <p456>
    And Obligatorio fg La pantalla Alta de responsable de pago desplegada
    And Obligatorio fg los siguientes datos ingresados y confirmados:
    And Obligatorio fg Tipo de Responsable <tipoResponsable>
    And Obligatorio fg PopUp Busqueda de entidades
    And Obligatorio fg Ingreso descripcion <descripcion> 
    And Obligatorio fg Ingreso cuit cuil <cuitCuil>       
    And Obligatorio fg Busqueda seleccion y confirmacion de entidad
    And Obligatorio fg Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio fg Ingreso eMail <mail>
    And Obligatorio fg Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio fg Seleccion boton confirmar
    Then Obligatorio fg validar pantalla de Datos fiscales
    When Obligatorio fg Cuando seleciona el valor para el campo Condicion de IVA <condicionIVA>
    Then Obligatorio fg La aplicacion muestra los siguientes campos editables
    Then Obligatorio fg Fecha inicio condicion IVA <fechaInicioCondicionIVA>
    Then Obligatorio fg Forma de pago <formaPago>
    Then Obligatorio fg Adherido factura electronica <facturaElectronica>
    Then Obligatorio fg Email <DatosFiscalesMail>

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion                 | mail             | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Grupo           | 20361435142 | 	FRIDLENDER | catfer@email.com | 07/06/2019    | Consumidor   | 14/06/2019              | check     | dato               | variableFiscales@gmail.com |
