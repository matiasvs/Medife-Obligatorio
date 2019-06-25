Feature: Med 147 - Obligatorios 05 - Validar Funcionamiento de la Pantalla de 
Resultados del Buscador de Entidades Bot�n Seleccionar 1 registro

  Scenario Outline: Comportamiento
    Given Obligatorio E Dado un usuario perfil situado en la pantalla Alta de responsabilidad de pago
    And Obligatorio E Usuario: <maru>
    And Obligatorio E Pass: <p456>    
    And Obligatorio E La pantalla Alta de responsable de pago desplegada
    And Obligatorio E los siguientes datos ingresados:
    And Obligatorio E Tipo de Responsable <tipoResponsable>
    And Obligatorio E Selecciono el boton Busqueda de entidad
    And Obligatorio E Se ingresa un valor de descripcion <descripcion>
    And Obligatorio E Se ingresa un valor de cuit <BusquedaCuit>    
    When Obligatorio E Selecciono el Boton Seleccionar y se selecciona el boton Confirmar entidad
    And Obligatorio E Se selecciona el valor con checkbox
    Then Obligatorio E La aplicacion cierra la ventana Buscador de Entidades y los datos seleccionados se visualizan cargados en la pantalla Alta de Responsable de Pago no permitiendo su edicion
    
	Examples: 
      | tipoResponsable | descripcion                       | BusquedaCuit |
      | Empresa         | 	ASOC. HNAS. DE NTRA. SRA. DEL ROSARIO | 30528996546  |