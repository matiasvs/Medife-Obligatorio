Feature: Med 167 - Obligatorios 24 - Datos Fiscales, validación requeridos y Validaciones Pantalla - Botón Confirmar para Monotributo

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio fw Dado un usuario conectado
    And Obligatorio fw Usuario: <maru>
    And Obligatorio fw Pass: <p456>
    And Obligatorio fw La pantalla Alta de responsable de pago desplegada
    And Obligatorio fw los siguientes datos ingresados y confirmados:
    And Obligatorio fw Tipo de Responsable <tipoResponsable>
    And Obligatorio fw PopUp Busqueda de entidades
    And Obligatorio fw Ingreso cuit cuil <cuitCuil>
    And Obligatorio fw Ingreso descripcion <descripcion>    
    And Obligatorio fw Busqueda seleccion y confirmacion de entidad
    And Obligatorio fw Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio fw Ingreso eMail <mail>
    And Obligatorio fw Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio fw Seleccion boton confirmar
    Then Obligatorio fw validar pantalla de Datos fiscales
    When Obligatorio fw Condicion de IVA <condicionIVA>
    Then Obligatorio fw Fecha inicio condicion IVA <fechaInicioCondicionIVA>
    When Obligatorio fw Selecciono el boton confirmar
    Then Obligatorio fw La aplicacion emite un mensaje indicando que:
    And Obligatorio fw Y que los siguientes campos son requeridos
    Then Obligatorio fw Forma de pago <formaPago>
    Then Obligatorio fw Adherido factura electronica <facturaElectronica>
    Then Obligatorio fw Provincia <provincia>
    Then Obligatorio fw Localidad <localidad>
    Then Obligatorio fw codigo postal <cp>
    Then Obligatorio fw calle <calle>
    Then Obligatorio fw Partido <partido>
    Then Obligatorio fw Nro <nro>
    Then Obligatorio fw Tipo telefono <tipoTelefono>
    Then Obligatorio fw Prefijo <prefigo>
    Then Obligatorio fw Numero <numero>
    Then Obligatorio fw no guarda los datos
    

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion                 | mail             | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Grupo           | 30552982815 | MOSAICOS ROSSI HNOS. S.R.L. | catfer@email.com | 07/06/2019    | Monotributo  | 17/06/2019              | check     | dato               | variableFiscales@gmail.com |
#capas se elecciona con la tecla