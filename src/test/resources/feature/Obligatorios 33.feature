Feature: Med 176 - Obligatorios 33a - Carga datos fiscales - Validaciones para Condición IVA Monotributista

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio dr Dado un usuario conectado
    And Obligatorio dr Usuario: <maru>
    And Obligatorio dr Pass: <p456>
    And Obligatorio dr Dentro de La pantalla Alta de responsable de pago desplegada
    And Obligatorio dr los siguientes datos ingresados y confirmados:
    And Obligatorio dr Tipo de Responsable <tipoResponsable>
    And Obligatorio dr PopUp Busqueda de entidades
    And Obligatorio dr Ingreso descripcion <descripcion>
    And Obligatorio dr Ingreso cuit cuil <cuitCuil>
    And Obligatorio dr Busqueda seleccion y confirmacion de entidad
    And Obligatorio dr Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio dr Ingreso eMail <mail>
    And Obligatorio dr Ingreso fecha de vigencia <fechaVigencia>
    When Obligatorio dr Cuando seleccion boton confirmar
    Then Obligatorio dr validar ingreso a Datos fiscales
    And Obligatorio dr Y los siguientes datos ingresados
    And Obligatorio dr Campo Condicion IVA <condicionIVA>
    And Obligatorio dr Campo Fecha inicio condidicon IVA <fechaInicioCondicionIva>
    When Obligatorio dr Selecciono boton Guardar
    Then Obligatorio dr la aplicación guarda los datos ingresados CIERRA LA VENTANA O PERMANECE - pregunta
    

    Examples:  
      | tipoResponsable | cuitCuil    | descripcion                 | mail               | fechaVigencia | condicionIVA  | fechaInicioCondicionIva |
      | Empresa         | 30501036672 | LA PAPELERA DEL PLATA S.A. | catfer@email.com   | 09/06/2019    | Monotributo   | 21/06/2019              |