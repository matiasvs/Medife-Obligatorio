Feature: Med 172 - Obligatorios 29 - Fecha inicio Cond.IVA = al dia de la fecha 2
  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio fp Dado un usuario conectado
    And Obligatorio fp Usuario: <maru>
    And Obligatorio fp Pass: <p456>
    And Obligatorio fp La pantalla Alta de responsable de pago desplegada
    And Obligatorio fp los siguientes datos ingresados y confirmados:
    And Obligatorio fp Tipo de Responsable <tipoResponsable>
    And Obligatorio fp PopUp Busqueda de entidades
    And Obligatorio fp Ingreso descripcion <descripcion>
    And Obligatorio fp Ingreso cuit cuil <cuitCuil>        
    And Obligatorio fp Busqueda seleccion y confirmacion de entidad
    And Obligatorio fp Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio fp Ingreso eMail <mail>
    And Obligatorio fp Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio fp Seleccion boton confirmar
    Then Obligatorio fp validar pantalla de Datos fiscales
    And Obligatorio fp Ingreso Condicion IVA <condicionIva>
    And Obligatorio fp Ingreso fecha inicio condicion IVA <fechaInicioCondicionIVA>
    When Obligatorio fp Selecciono el boton guardar
    Then Obligatorio fp Entonces la aplicacion guarda los datos ingresados PREGUNTA CIERRA LA VENTANA O PERMANECE
    

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion                 | mail             | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Empresa         | 20134973146 | LOREA FRANCISCO ROBERTO | catfer@email.com | 07/06/2019    | Responsable       | 01/03/2019              | check     | dato               | variableFiscales@gmail.com |
#capas se elecciona con la tecla