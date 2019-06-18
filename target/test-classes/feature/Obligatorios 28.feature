Feature: Med 171 - Obligatorios 28 - Fecha inicio Cond.IVA < al dia de la fecha 2
  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio ft Dado un usuario conectado
    And Obligatorio ft Usuario: <maru>
    And Obligatorio ft Pass: <p456>
    And Obligatorio ft La pantalla Alta de responsable de pago desplegada
    And Obligatorio ft los siguientes datos ingresados y confirmados:
    And Obligatorio ft Tipo de Responsable <tipoResponsable>
    And Obligatorio ft PopUp Busqueda de entidades
    And Obligatorio ft Ingreso cuit cuil <cuitCuil>
    And Obligatorio ft Ingreso descripcion <descripcion>    
    And Obligatorio ft Busqueda seleccion y confirmacion de entidad
    And Obligatorio ft Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio ft Ingreso eMail <mail>
    And Obligatorio ft Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio ft Seleccion boton confirmar
    Then Obligatorio ft validar pantalla de Datos fiscales
    And Obligatorio ft Ingreso Condicion IVA <condicionIva>
    And Obligatorio ft Ingreso fecha inicio condicion IVA <fechaInicioCondicionIVA>
    When Obligatorio ft Selecciono el boton guardar
    Then Obligatorio ft Entonces la aplicación guarda los datos ingresados PREGUNTA CIERRA LA VENTANA O PERMANECE
    

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion                 | mail             | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Grupo           | 30552982815 | MOSAICOS ROSSI HNOS. S.R.L. | catfer@email.com | 07/06/2019    | Responsable       | 01/01/2019              | check     | dato               | variableFiscales@gmail.com |
#capas se elecciona con la tecla