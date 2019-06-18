Feature: Med 159 - Obligatorios 17 - Validar Botón Confirmar. Y pantalla datos fiscales
  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio L Dado un usuario conectado
    And Obligatorio L Usuario: <maru>
    And Obligatorio L Pass: <p456>    
    And Obligatorio L La pantalla Alta de responsable de pago desplegada
    And Obligatorio L los siguientes datos seleccionados:
    And Obligatorio L Tipo de Responsable <tipoResponsable>
    And Obligatorio L Ingreso Razon social - Apellido nombre <razonSocial>
    And Obligatorio L Ingreso Email <email>
    And Obligatorio L y los siguientes datos ingresados cuit cuil <cuitCuil> 
    And Obligatorio L Ingreso fecha de vigencia <fechaVigencia>
    When Obligatorio L Cuando Seleccionar el Boton Confirmar
    Then Obligatorio L la aplicacion Guarda los datos ingresados y continua en la siguiente tarea: habilita la seccion Datos Fiscales mostrando los siguientes campos precargados y editables
    Then Obligatorio L Validar valor condicion IVA <excento>
    Then Obligatorio L Validar valor Fecha inicio condicion IVA <fechaInicioCondicionIVA>
    Then Obligatorio L Validar valor Condicion IIBB <condicionIIBB>
    Then Obligatorio L Validar valor Nro. IIBB <nroIIBB>    
    Then Obligatorio L Validar valor Forma de pago <formaDePago>
    Then Obligatorio L Validar valor Adherido factura electronica <adheridoFacturaElectronica>
    Then Obligatorio L Validar valor DFmail <DFmail>
    
	Examples: 
      | tipoResponsable | razonSocial        | email            | cuitCuil    | fechaVigencia |
      | Externo         | Catalina Fernandez | catfer@email.com | 20336898243 | 06/06/2019    |