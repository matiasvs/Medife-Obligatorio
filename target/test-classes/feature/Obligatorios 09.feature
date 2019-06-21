Feature: Med 151 - Obligatorios 098 - Validar Buscador de Entidades Asociados segun criterio de búsqueda Descripción Con Resultado

  Scenario Outline: Comportamiento
    Given Obligatorio I ado un usuario conectado
    And Obligatorio I Usuario: <maru>
    And Obligatorio I Pass: <p456>    
    And Obligatorio I La pantalla Alta de responsable de pago desplegada
    And Obligatorio I los siguientes datos ingresados:
    And Obligatorio I Tipo de Responsable <tipoResponsable> 
    And Obligatorio I Ventana de entidades desplegada
    And Obligatorio I Ingreso de descripcion <descripcion> 
    And Obligatorio I Ingreso de cuit cuil <cuitCuil>
    When Obligatorio I Seleccionar el Boton Buscar
    Then Obligatorio I La pantalla lista los datos que coinciden con la informacion ingresada. Dispuestos de la siguiente manera: Descripcion - Cuit - Cuil
    
	Examples: 
      | tipoResponsable | descripcion    | cuitCuil    |
      | Grupo           | ALACID | 20291531777 |
      #verificar la validacion para el posicionamiento de los campos de la grilla