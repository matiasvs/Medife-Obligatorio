Feature: Med 183 - Obligatorios 40 - Seccion Telefono Validar Boton Confirmar

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio as Dado un usuario conectado
    And Obligatorio as completar la pantalla Alta de responsabilidad de pago
    And Obligatorio as con los campos Tipos de responsabilidad <tipoResponsable> 
    And Obligatorio as buscar entidad
    And Obligatorio as ingresar Descripcion <descripcion>
    And Obligatorio as ingresar cuit cuil <cuitCuil>
    And Obligatorio as seleccionar resultado y confirmar entidad
    And Obligatorio as completar campo Mail <mail> 
    And Obligatorio as completar campo Fecha de vigecnia <fechaVigencia> 
    When Obligatorio as Seleccionar boton Confimar
    Then Obligatorio as Validar pantalla Carga de datos fiscales
    And Obligatorio as Seleccionar boton Nuevo telefo
    And Obligatorio as completar campos Tipo de telefono <TipoDeTelefono> 
    And Obligatorio as completar campos Prefijo <Prefijo> 
    And Obligatorio as completar campos Numero <Numero>
    When Obligatorio as Seleccionar Confirmar
    Then Obligatorio as Validar que se guardo los datos ingresados

    Examples:  
      | tipoResponsable | cuitCuil    | descripcion          | mail             | fechaVigencia | TipoDeTelefono | Prefijo | Numero   |
      | Empresa         | 30652903416 | HDA SOFT S.R.L.   | catfer@email.com | 07/06/2019 | Particular | 011     | 67867878 |