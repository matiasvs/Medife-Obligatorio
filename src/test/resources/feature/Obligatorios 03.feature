Feature: Med 129 - Obligatorios 03 - Validar Buscador de Entidades segun criterio
  de busqueda Con Resultado y validacion que unicamente visualice Empresas

  Scenario Outline: Comportamiento
    Given Obligatorio C La pantalla Altas de responsibles de pago desplegada
    And Obligatorio C Los siguientes datos ingresados
    And Obligatorio C Tipo de Responsable <tipoResponsable>
    And Obligatorio C Ventana Buscador de Entidades desplegada:
    And Obligatorio C El campo Descripcion con un valor correspondiente a una Empresa <descipcion>
    When Obligatorio C Seleccionar el Boton Buscar
    Then Obligatorio C La pantalla lista los datos que coinciden con Descripcion - Cuit-Cuil

    Examples: 
      | tipoResponsable | descipcion         | cuit        |
      | Empresa         | HDA SOFT S.R.L. | 30652903416 |
      #falta validar grilla tomar el valor con los xpath y tr