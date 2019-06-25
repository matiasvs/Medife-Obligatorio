Feature: Med 186 - Obligatorios 422 - Seccion Telefono Validar Boton Modificar

  Scenario Outline: Comportamiento
    Given Obligatorio cv Dado un usuario conectado
    And Obligatorio cv completar la pantalla Alta de responsabilidad de pago
    And Obligatorio cv con los campos Tipos de responsabilidad <tipoResponsable>
    And Obligatorio cv buscar entidad
    And Obligatorio cv ingresar Descripcion <descripcion>
    And Obligatorio cv ingresar cuit cuil <cuitCuil>
    And Obligatorio cv seleccionar resultado y confirmar entidad
    And Obligatorio cv completar campo Mail <mail>
    And Obligatorio cv completar campo Fecha de vigecnia <fechaVigencia>
    When Obligatorio cv Seleccionar boton Confimar
    Then Obligatorio cv Validar pantalla Carga de datos fiscales
    And Obligatorio cv Seleccionar boton Nuevo telefo
    And Obligatorio cv completar campos Tipo de telefono <TipoDeTelefono>
    And Obligatorio cv completar campos Prefijo <Prefijo>
    And Obligatorio cv completar campos Numero <Numero>
    And Obiligatorio cv selecciono el boton confirmar popUp de telefono
    And Obligatorio cv seleccionar el nuevo telefono con sus checkbox
    When Obligatorio cv selecciono modificar
    And Obligatorio cv inicio edicion de campos
    And Obligatorio cv nuevo Tipo de telefono <NuevoTipoDeTelefono>
    And Obligatorio cv nuevo Prifijo <NuevoPrefijo>
    And Obligatorio cv nuevo Numero <NuevoNumero>
    And Obligatorio cv nuevo Interno <NuevoInterno>
    And Obligatorio cv nueva Confirmacion
    Then Obligatorio cv La aplicacion habilia el registro seleccionado permitiendo su modificacion

    Examples: 
      | tipoResponsable | cuitCuil    | descripcion           | mail             | fechaVigencia | TipoDeTelefono | Prefijo | Numero   | NuevoTipoDeTelefono | NuevoPrefijo | NuevoNumero | NuevoInterno |
      | Empresa         | 30701299465 | ATENTO ARGENTINA S.A. | catfer@email.com | 07/06/2019    | Particular     |     011 | 42424242 | Laboral             |          015 |    23237878 |           56 |
