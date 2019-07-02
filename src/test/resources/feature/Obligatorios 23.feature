Feature: Med 166 - Obligatorios 23 - Datos Fiscales, validaci�n requeridos y Validaciones Pantalla - Bot�n Confirmar para Responsible Inscripto

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio fr Dado un usuario conectado
    And Obligatorio fr Usuario: <maru>
    And Obligatorio fr Pass: <p456>
    And Obligatorio fr La pantalla Alta de responsable de pago desplegada
    And Obligatorio fr los siguientes datos ingresados y confirmados:
    And Obligatorio fr Tipo de Responsable <tipoResponsable>
    And Obligatorio fr PopUp Busqueda de entidades
    And Obligatorio fr Ingreso descripcion <descripcion>
    And Obligatorio fr Ingreso cuit cuil <cuitCuil>        
    And Obligatorio fr Busqueda seleccion y confirmacion de entidad
    And Obligatorio fr Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio fr Ingreso eMail <mail>
    And Obligatorio fr Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio fr Seleccion boton confirmar
    Then Obligatorio fr validar pantalla de Datos fiscales
    When Obligatorio fr Condicion de IVA <condicionIVA>
    Then Obligatorio fr Fecha inicio condicion IVA <fechaInicioCondicionIVA>
    When Obligatorio fr Selecciono el boton confirmar
    Then Obligatorio fr La aplicacion emite un mensaje indicando que:
    Then Obligatorio fr Mensaje Fecha Inicio Cond. De IVA es dato requerido para Condicion IVA Responsable Inscripto.
    And Obligatorio fr Y que los siguientes campos son requeridos
    Then Obligatorio fr Forma de pago <formaPago>
    Then Obligatorio fr Adherido factura electronica <facturaElectronica>
    Then Obligatorio fr Provincia <provincia>
    Then Obligatorio fr Localidad <localidad>
    Then Obligatorio fr codigo postal <cp>
    Then Obligatorio fr calle <calle>
    Then Obligatorio fr Partido <partido>
    Then Obligatorio fr Nro <nro>
    Then Obligatorio fr Tipo telefono <tipoTelefono>
    Then Obligatorio fr Prefijo <prefigo>
    Then Obligatorio fr Numero <numero>
    Then Obligatorio fr no guarda los datos
    

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion          | mail                | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Empresa         | 30500484302 | RADIO CONTINENTAL | catfer_23@email.com | 07/06/2019    | Responsable  | 17/06/2019              | check     | dato               | variableFiscales@gmail.com |
#capas se elecciona con la tecla