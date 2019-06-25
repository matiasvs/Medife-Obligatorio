Feature: Med 180 - Obligatorios 37 - Validación Interbanking = validacion de cuit y cbu (invalido)

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio eee Dado un usuario conectado
    And Obligatorio eee Usuario: <maru>
    And Obligatorio eee Pass: <p456>
    And Obligatorio eee Dentro de La pantalla Alta de responsable de pago desplegada
    And Obligatorio eee los siguientes datos ingresados y confirmados:
    And Obligatorio eee Tipo de Responsable <tipoResponsable>
    And Obligatorio eee PopUp Busqueda de entidades
    And Obligatorio eee Ingreso descripcion <descripcion>
    And Obligatorio eee Ingreso cuit cuil <cuitCuil>
    And Obligatorio eee Busqueda seleccion y confirmacion de entidad
    And Obligatorio eee Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio eee Ingreso eMail <mail>
    And Obligatorio eee Ingreso fecha de vigencia <fechaVigencia>
    When Obligatorio eee Cuando seleccion boton confirmar
    Then Obligatorio eee validar ingreso a Datos fiscales
    And Obligatorio eee Y los siguientes datos ingresados
    And Obligatorio eee Forma de pago habilitada <formaDePago>
    And Obligatorio eee CBU numero3465025 corresponde al cuit 8EOREWT <cbu>
    And Obligatorio eee Alias <alias>
    When Obligatorio eee Seleccion boton guardar
    Then Obligatorio eee se activa el servicio de Interbanking
    Then Obligatorio eee validadando CBU u validacion de cuit cbu El CBU debe coincidir con el CUIT del responsable de pago 
    And Obligatorio eee guarda los datos ingresados
    
    Examples:  
      | tipoResponsable | cuitCuil    | descripcion           | mail             | fechaVigencia | formaDePago      | cbu    | alias       |
      | Empresa         | 30692272591 | NORAUTO ARGENTINA S.A | catfer@email.com | 09/06/2019    | Debito en cuenta | 346    | OIUREWYTUIO |

      
      
      
      
      
      