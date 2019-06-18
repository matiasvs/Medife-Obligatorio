Feature: Med 150 - Obligatorios 08 - Validar Botón Buscador de Entidades
  Asociados segun selección tipo de responsable = Grupo Familiar

  Scenario Outline: Comportamiento
    Given Obligatorio H Dado un usuario conectado
    And Obligatorio H Usuario: <maru>
    And Obligatorio H Pass: <p456>
    And Obligatorio H La pantalla Alta de responsable de pago desplegada
    And Obligatorio H los siguientes datos ingresados:
    And Obligatorio H Tipo de Responsable <tipoResponsable>
    When Obligatorio H Selecciono el Boton Buscador de Entidades
    Then Obligatorio H La aplicacion despliega la ventana Buscador de Entidades. Mostrando los siguientes campos:
    Then Obligatorio H Solo lectura Tipo de Entidad Grupo Familiar habilitados para el ingreso de datos: descripcion cuit cuil

    Examples: 
      | tipoResponsable |
      | Grup            |
