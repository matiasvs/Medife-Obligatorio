Feature: Med 175 - Obligatorios 32 - Carga datos fiscales - Validaciones para Condición IVA Consumidor final

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio za Dado un usuario conectado
    And Obligatorio za Usuario: <maru>
    And Obligatorio za Pass: <p456>
    And Obligatorio za Dentro de La pantalla Alta de responsable de pago desplegada
    And Obligatorio za los siguientes datos ingresados y confirmados:
    And Obligatorio za Tipo de Responsable <tipoResponsable>
    And Obligatorio za PopUp Busqueda de entidades
    And Obligatorio za Ingreso descripcion <descripcion>
    And Obligatorio za Ingreso cuit cuil <cuitCuil>
    And Obligatorio za Busqueda seleccion y confirmacion de entidad
    And Obligatorio za Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio za Ingreso eMail <mail>
    And Obligatorio za Ingreso fecha de vigencia <fechaVigencia>
    When Obligatorio za Cuando seleccion boton confirmar
    Then Obligatorio za validar ingreso a Datos fiscales
    And Obligatorio za Y los siguientes datos ingresados
    And Obligatorio za Condicion IVA: <condicionIVA>
    And Obligatorio za Fecha inicio condicion IVA <fechaInicioCondicionIva>
    When Obligatorio za Selecciono el boton Guardar
    Then Obligatorio za Entonces en la aplicacion emite un mensaje: Para Responsible de pago tipo Empresa, no es valido condicion de IVA Consumidor Final.
    And Obligatorio za No guarda los datos

    Examples:  
      | tipoResponsable | cuitCuil    | descripcion        | mail               | fechaVigencia | condicionIVA  | fechaInicioCondicionIva |
      | Empresa         | 30683797150 | GAYNOR CONTROLS S.R.L.            | catfer@email.com   | 08/06/2019    | Consumidor    | 19/06/2019              |