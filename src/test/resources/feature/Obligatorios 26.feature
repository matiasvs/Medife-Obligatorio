Feature: Med 169 - Obligatorios 26 - Fecha inicio Cond.IVA = al dia de la fecha
  
  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio fq Dado un usuario conectado
    And Obligatorio fq Usuario: <maru>
    And Obligatorio fq Pass: <p456>
    And Obligatorio fq La pantalla Alta de responsable de pago desplegada
    And Obligatorio fq los siguientes datos ingresados y confirmados:
    And Obligatorio fq Tipo de Responsable <tipoResponsable>
    And Obligatorio fq PopUp Busqueda de entidades
    And Obligatorio fq Ingreso descripcion <descripcion>
    And Obligatorio fq Ingreso cuit cuil <cuitCuil>
    And Obligatorio fq Busqueda seleccion y confirmacion de entidad
    And Obligatorio fq Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio fq Ingreso eMail <mail>
    And Obligatorio fq Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio fq Seleccion boton confirmar
    Then Obligatorio fq validar pantalla de Datos fiscales
    And Obligatorio fq Ingreso Condicion IVA <condicionIva>
    And Obligatorio fq Ingreso fecha inicio condicion IVA <fechaInicioCondicionIVA>
    When Obligatorio fq Selecciono el boton guardar
    Then Obligatorio fq Entonces la aplicacion guarda los datos ingresados PREGUNTA CIERRA LA VENTANA O PERMANECE
    

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion                 | mail             | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Empresa         | 20103587213 | RENES ALEJANDRO PABLO | catfer@email.com | 07/06/2019    | Exento       | 01/03/2019              | check     | dato               | variableFiscales@gmail.com |
#capas se elecciona con la tecla