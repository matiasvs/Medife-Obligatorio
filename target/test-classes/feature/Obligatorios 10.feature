Feature: Med 152 - Obligatorios 10 - Segun criterio de búsqueda Descripción 
Sin Resultados Validar que el buscador sea especifico de Asociados Grupo Familiar

  Scenario Outline: Comportamiento
    Given Obligatorio J Dado un usuario perfil situado en la pantalla Alta de responsabilidad de pago
    And Obligatorio J Ventana Buscador de Entidades desplegada:
    And Obligatorio J Ingresar el valor de descripcion correspondiente a una empresa existente <descripcion>
    When Obligatorio J Seleccionar el Boton Buscar
    Then Obligatorio J La Grilla se muestra vacia. No existen datos que coincidan con los criterios de busqueda ingresados.
    
	Examples: 
      | tipoResponsable | descripcion                              |
      | Grupo         | TIERRA COOP DE TRAB. VIV. Y CONS. LTDA. |     