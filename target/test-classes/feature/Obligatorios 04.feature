Feature: Med 146 - Obligatorios 04 - Segun criterio de búsqueda Descripción
  Sin Resultados Validar que el buscador sea especifico de empresas

  Scenario Outline: Comportamiento
    Given Obligatorio D Dado un usuario perfil xx conectado con lo siguientes datos
    And Obligatorio D Usuario: <maru>
    And Obligatorio D Pass: <p456>
    And Obligatorio D selecciono Tipo de responsable <tipoResponsable>
    And Obligatorio D Ventana Buscador de Entidades desplegada:
    And Obligatorio D Ingresar una Descripcion: <descripcion> y un <CuitCuil> correspondiente a un grupo familiar existente
    When Obligatorio D Seleccionar el Boton Buscar
    Then Obligatorio D La Grilla se muestra vacia. No existen datos que coincidan con los criterios de busqueda ingresados.

    Examples: 
      | tipoResponsable | CuitCuil    | descripcion |
      | Empresa         | 27331154178 | CARDOZO |
