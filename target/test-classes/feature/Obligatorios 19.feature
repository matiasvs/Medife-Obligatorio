Feature: Med 161 - Obligatorios 19 - Validar comportamiento pantalla segun valor campo Condición de IVA Responsable Inscripto

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio T Dado un usuario conectado
    And Obligatorio T Usuario: <maru>
    And Obligatorio T Pass: <p456>
    And Obligatorio T La pantalla Alta de responsable de pago desplegada
    And Obligatorio T los siguientes datos ingresados y confirmados:
    And Obligatorio T Tipo de Responsable <tipoResponsable>
    And Obligatorio T PopUp Busqueda de entidades
    And Obligatorio T Ingreso descripcion <descripcion>
    And Obligatorio T Ingreso cuit cuil <cuitCuil>
    And Obligatorio T Busqueda seleccion y confirmacion de entidad
    And Obligatorio T Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio T Ingreso eMail <mail>
    And Obligatorio T Ingreso fecha de vigencia <fechaVigencia>
    And Obligatorio T Seleccion boton confirmar
    Then Obligatorio T validar ingreso a Datos fiscales
    When Obligatorio T Cuando se seleciona el valor <condicionIVA1> para el campo Condicion de IVA
    Then Obligatorio T Entonces la aplicacion muestra los siguientes campos editables
    Then Obligatorio T Fecha inicio condicion IVA <condicionIva>
    Then Obligatorio T Nro. IIBB <nroIIBB>
    Then Obligatorio T Condicion IIBB <CondicionIIBB>
    Then Obligatorio T Forma de pago <formaPago>
    Then Obligatorio T Adherido factura electronica <facturaElectronica>
    Then Obligatorio T Email <DatosFiscalesMail>

    Examples:  
      | tipoResponsable | cuitCuil    | descripcion                   | mail             | fechaVigencia | condicionIVA1 | condicionIva | nroIIBB       | CondicionIIBB | formaPago | DatosFiscalesMail  |
      | Empresa         | 30558573232 | 	EMBAJADA BRITANICA    | catfer@email.com | 07/06/2019    | Responsable   | 12/06/2019   | 2235654654456 | Exento        | Pago Presencial     | correo@mail.com.ar |
