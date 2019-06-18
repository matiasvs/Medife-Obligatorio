Feature: Med 170 - Obligatorios 27 - Fecha inicio Cond.IVA > al dia de la fecha
  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio fz Dado un usuario conectado
    And Obligatorio fz Usuario: <maru>
    And Obligatorio fz Pass: <p456>
    And Obligatorio fz La pantalla Alta de responsable de pago desplegada
    And Obligatorio fz los siguientes datos ingresados y confirmados:
    And Obligatorio fz Tipo de Responsable <tipoResponsable>
    And Obligatorio fz PopUp Busqueda de entidades
    And Obligatorio fz Ingreso cuit cuil <cuitCuil>
    And Obligatorio fz Ingreso descripcion <descripcion>    
    And Obligatorio fz Busqueda seleccion y confirmacion de entidad
    And Obligatorio fz Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio fz Ingreso eMail <mail>
    And Obligatorio fz Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio fz Seleccion boton confirmar
    Then Obligatorio fz validar pantalla de Datos fiscales
    And Obligatorio fz Ingreso Condicion IVA <condicionIva>
    And Obligatorio fz Ingreso fecha inicio condicion IVA <fechaInicioCondicionIVA>
    When Obligatorio fz Selecciono el boton guardar
    Then Obligatorio fz Entonces La aplicacion emite un mensaje: Fecha Inicio Cond. De IVA debe ser menor o igual a la fecha del dia
    And Obligatorio fz Y no guarda los datos
    

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion                 | mail             | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Grupo           | 30552982815 | MOSAICOS ROSSI HNOS. S.R.L. | catfer@email.com | 07/06/2019    | Exento       | 01/01/2020              | check     | dato               | variableFiscales@gmail.com |
#capas se elecciona con la tecla