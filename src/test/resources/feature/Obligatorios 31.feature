Feature: Med 174 - Obligatorios 31 - Datos Fiscales, validación requeridos y Validaciones Pantalla - Botón Confirmar para Consumidor Final

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio dv Dado un usuario conectado
    And Obligatorio dv Usuario: <maru>
    And Obligatorio dv Pass: <p456>
    And Obligatorio dv La pantalla Alta de responsable de pago desplegada
    And Obligatorio dv los siguientes datos ingresados
    And Obligatorio dv Tipo de Responsable <tipoResponsable>
    And Obligatorio dv PopUp Busqueda de entidades
    And Obligatorio dv Ingreso descripcion <descripcion>
    And Obligatorio dv Ingreso cuit cuil <cuitCuil>
    And Obligatorio dv Busqueda seleccion y confirmacion de entidad
    And Obligatorio dv Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio dv Ingreso eMail <mail>
    And Obligatorio dv Ingreso fecha de vigencia <fechaVigencia>
    When Obligatorio dv Cuando seleccion boton confirmar
    Then Obligatorio dv validar ingreso a Datos fiscales
    When Obligatorio dv Cuando se seleciona el valor <condicionIVA> para el campo Condicion de IVA
    And Obligatorio dv Fecha inicio condicion IVA <fechaInicioCondicionIva>
    When Obligatorio dv selecciono el boton confirmar
    Then Obligatorio dv Resultado esperado la aplicacion emite un mensaje indicando que:
    Then Obligatorio dv Los siguientes campos son requeridos
    Then Obligatorio dv Forma de pago, Adherido factura electronica, Provincia, Localidad, CP, Calle, Partido, NroTipo Telefono, Prefijo, Numero    
    Then Obligatorio dv No guarda los datos

    Examples:  
      | tipoResponsable | cuitCuil    | descripcion        | mail               | fechaVigencia | condicionIVA  | fechaInicioCondicionIva |
      | Grupo           | 20274128470 | MONTIVERO            | catfer@email.com   | 07/06/2019    | Consumidor    | 18/06/2019              |