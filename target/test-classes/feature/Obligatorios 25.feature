Feature: Med 168 - Obligatorios 25 - Fecha inicio Cond.IVA < al dia de la fecha

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio fs Dado un usuario conectado
    And Obligatorio fs Usuario: <maru>
    And Obligatorio fs Pass: <p456>
    And Obligatorio fs La pantalla Alta de responsable de pago desplegada
    And Obligatorio fs los siguientes datos ingresados y confirmados:
    And Obligatorio fs Tipo de Responsable <tipoResponsable>
    And Obligatorio fs PopUp Busqueda de entidades    
    And Obligatorio fs Ingreso descripcion <descripcion> 
    And Obligatorio fs Ingreso cuit cuil <cuitCuil>   
    And Obligatorio fs Busqueda seleccion y confirmacion de entidad
    And Obligatorio fs Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio fs Ingreso eMail <mail>
    And Obligatorio fs Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio fs Seleccion boton confirmar
    Then Obligatorio fs validar pantalla de Datos fiscales
    And Obligatorio fs Ingreso Condicion IVA <condicionIva>
    And Obligatorio fs Ingreso fecha inicio condicion IVA <fechaInicioCondicionIVA>
    When Obligatorio fs Selecciono el boton guardar
    Then Obligatorio fs Resultado Esperable Entonces la aplicacion guarda los datos ingresados PREGUNTA CIERRA LA VENTANA O PERMANECE
    

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion                    | mail             | fechaVigencia | condicionIVA | fechaInicioCondicionIVA | formaPago | facturaElectronica | DatosFiscalesMail          |
      | Empresa         | 30504170981 | VESUVIO S.A.C.I.F. E.I | catfer@email.com | 07/06/2019    | Exento       | 01/01/2019              | check     | dato               | variableFiscales@gmail.com |
#capas se elecciona con la tecla