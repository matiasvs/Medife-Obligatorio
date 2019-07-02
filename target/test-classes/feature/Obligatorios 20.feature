Feature: Med 162 - Obligatorios 20 - Validar comportamiento pantalla segun valor campo Condici�n de IVA "Monotributo"

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio x Dado un usuario conectado
    And Obligatorio x Usuario: <maru>
    And Obligatorio x Pass: <p456>
    And Obligatorio x La pantalla Alta de responsable de pago desplegada
    And Obligatorio x los siguientes datos ingresados y confirmados:
    And Obligatorio x Tipo de Responsable <tipoResponsable>
    And Obligatorio x PopUp Busqueda de entidades
    And Obligatorio x Ingreso descripcion <descripcion>
    And Obligatorio x Ingreso cuit cuil <cuitCuil>        
    And Obligatorio x Busqueda seleccion y confirmacion de entidad
    And Obligatorio x Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio x Ingreso eMail <mail>
    And Obligatorio x Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio x Seleccion boton confirmar
    Then Obligatorio x validar pantalla de Datos fiscales
    When Obligatorio x Cuando se seleciona el valor <condicionIVA> para el campo Condicion de IVA
    Then Obligatorio x Entonces la aplicacion muestra los siguientes campos editables
    Then Obligatorio x Fecha inicio condicion IVA <fechaCondicionIva>
    Then Obligatorio x Forma de pago <formaPago>
    Then Obligatorio x Adherido factura electronica <facturaElectronica>
    Then Obligatorio x Email <DatosFiscalesMail>

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion           | mail             | fechaVigencia | condicionIVA | fechaCondicionIva | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Empresa         | 20043797183 | CEBALLOS JORGE | catfer@email.com | 07/06/2019    | Monotributo  | 14/06/2019        | check     | dato               | variableFiscales@gmail.com |
