Feature: Med 173 - Obligatorios 30 - Fecha inicio Cond.IVA > al dia de la fecha 2
  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio fm Dado un usuario conectado
    And Obligatorio fm Usuario: <maru>
    And Obligatorio fm Pass: <p456>
    And Obligatorio fm La pantalla Alta de responsable de pago desplegada
    And Obligatorio fm los siguientes datos ingresados y confirmados:
    And Obligatorio fm Tipo de Responsable <tipoResponsable>
    And Obligatorio fm PopUp Busqueda de entidades
    And Obligatorio fm Ingreso cuit cuil <cuitCuil>
    And Obligatorio fm Ingreso descripcion <descripcion>    
    And Obligatorio fm Busqueda seleccion y confirmacion de entidad
    And Obligatorio fm Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio fm Ingreso eMail <mail>
    And Obligatorio fm Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio fm Seleccion boton confirmar
    Then Obligatorio fm validar pantalla de Datos fiscales
    And Obligatorio fm Ingreso Condicion IVA <condicionIva>
    And Obligatorio fm Ingreso fecha inicio condicion IVA <fechaInicioCondicionIVA>
    When Obligatorio fm Selecciono el boton guardar
    Then Obligatorio fm Entonces La aplicacion emite un mensaje: Fecha Inicio Cond. De IVA debe ser menor o igual a la fecha del dia.
    And Obligatorio fm Y no guarda los datos
    

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion                 | mail             | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Grupo           | 30552982815 | MOSAICOS ROSSI HNOS. S.R.L. | catfer@email.com | 07/06/2019    | Inscripto    | 01/01/2020              | check     | dato               | variableFiscales@gmail.com |
#capas se elecciona con la tecla