Feature: Med 165 - Obligatorios 22 - Datos Fiscales, validaci�n requeridos y Validaciones para Condici�n IVA Exento - Fecha inicio Cond.IVA Bot�n Confirmar

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio vb Dado un usuario conectado
    And Obligatorio vb Usuario: <maru>
    And Obligatorio vb Pass: <p456>
    And Obligatorio vb La pantalla Alta de responsable de pago desplegada
    And Obligatorio vb los siguientes datos ingresados y confirmados:
    And Obligatorio vb Tipo de Responsable <tipoResponsable>
    And Obligatorio vb PopUp Busqueda de entidades
    And Obligatorio vb Ingreso descripcion <descripcion>
    And Obligatorio vb Ingreso cuit cuil <cuitCuil>        
    And Obligatorio vb Busqueda seleccion y confirmacion de entidad
    And Obligatorio vb Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio vb Ingreso eMail <mail>
    And Obligatorio vb Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio vb Seleccion boton confirmar
    Then Obligatorio vb validar pantalla de Datos fiscales
    When Obligatorio vb Condicion de IVA <condicionIVA>
    Then Obligatorio vb Fecha inicio condicion IVA <fechaInicioCondicionIVA>
    When Obligatorio vb Selecciono el boton confirmar
    Then Obligatorio vb La apliacion emite un mensaje indicando que Fecha Inicio Cond. De IVA es dato requerido para Condicion IVA Exento. y que los siguientes campos son requeridos, 
    Then Obligatorio vb Forma de pago <formaPago>
    Then Obligatorio vb Adherido factura electronica <facturaElectronica>
    Then Obligatorio vb Provincia <provincia>
    Then Obligatorio vb Localidad <localidad>
    Then Obligatorio vb codigo postal <cp>
    Then Obligatorio vb calle <calle>
    Then Obligatorio vb Partido <partido>
    Then Obligatorio vb Nro <nro>
    Then Obligatorio vb Tipo telefono <tipoTelefono>
    Then Obligatorio vb Prefijo <prefigo>
    Then Obligatorio vb Numero <numero>
    Then Obligatorio vb no guarda los datos

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion                 | mail             | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Grupo           | 20245404701 | VILLALBA | catfer@email.com | 07/06/2019    | Exento       | 18/06/2019              | check     | dato               | variableFiscales@gmail.com |
#capas se elecciona con la tecla



