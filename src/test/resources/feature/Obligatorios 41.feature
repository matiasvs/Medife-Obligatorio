Feature: Med 185 - Obligatorios 41 - Seccion Telefono Validar Comportamiento de pantalla
 
  Scenario Outline: Comportamiento
    Given Obligatorio bs Dado un usuario conectado
    And Obligatorio bs completar la pantalla Alta de responsabilidad de pago
    And Obligatorio bs con los campos Tipos de responsabilidad <tipoResponsable> 
    And Obligatorio bs buscar entidad
    And Obligatorio bs ingresar Descripcion <descripcion>
    And Obligatorio bs ingresar cuit cuil <cuitCuil>
    And Obligatorio bs seleccionar resultado y confirmar entidad
    And Obligatorio bs completar campo Mail <mail> 
    And Obligatorio bs completar campo Fecha de vigecnia <fechaVigencia> 
    When Obligatorio bs Seleccionar boton Confimar
    Then Obligatorio bs Validar pantalla Carga de datos fiscales
    And Obligatorio bs Seleccionar boton Nuevo telefo
    When Obligatorio bs selcciono el valor Laboral en el campo Tipo de Telefono <TipoDeTelefono> 
    Then Obligatorio bs Validar que la aplicacion despliega el campo Interno

    Examples:  
      | tipoResponsable | cuitCuil    | descripcion          | mail             | fechaVigencia | TipoDeTelefono |
      | Empresa         | 30597228984 | D ARC LIBERTADOR S.A.   | catfer@email.com | 07/06/2019 | Laboral |