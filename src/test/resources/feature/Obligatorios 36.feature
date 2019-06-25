Feature: Med 179 - Obligatorios 36 - Carga datos fiscales - Validaciones sección Forma de Pago Débito en Cuenta Validación Interbanking = ok

  #Se ingreso la prueba con los 2 botones
  Scenario Outline: Comportamiento
    Given Obligatorio jl Dado un usuario conectado
    And Obligatorio jl Usuario: <maru>
    And Obligatorio jl Pass: <p456>
    And Obligatorio jl Dentro de La pantalla Alta de responsable de pago desplegada
    And Obligatorio jl los siguientes datos ingresados y confirmados:
    And Obligatorio jl Tipo de Responsable <tipoResponsable>
    And Obligatorio jl PopUp Busqueda de entidades
    And Obligatorio jl Ingreso descripcion <descripcion>
    And Obligatorio jl Ingreso cuit cuil <cuitCuil>
    And Obligatorio jl Busqueda seleccion y confirmacion de entidad
    And Obligatorio jl Ingreso campos necesarios mail y fecha de vigencia para que se pueda ejecutar datos fiscales
    And Obligatorio jl Ingreso eMail <mail>
    And Obligatorio jl Ingreso fecha de vigencia <fechaVigencia>
    When Obligatorio jl Cuando seleccion boton confirmar
    Then Obligatorio jl validar ingreso a Datos fiscales
    And Obligatorio jl Y los siguientes datos ingresados
    And Obligatorio jl Forma de pago habilitada <formaDePago>
    And Obligatorio jl CBU numero3465025 corresponde al cuit 8EOREWT <cbu>
    And Obligatorio jl Alias <alias>
    When Obligatorio jl Seleccion boton guardar
    Then Obligatorio jl se activa el servicio de Interbanking
    Then Obligatorio jl validadando CBU u validacion de cuit cbu. (El CBU debe coincidir con el CUIT del responsable de pago.) 
    And Obligatorio jl guarda los datos ingresados
    
    Examples:  
      | tipoResponsable | cuitCuil    | descripcion           | mail             | fechaVigencia | formaDePago | cbu     | alias       |
      | Empresa         | 30692272591 | NORAUTO ARGENTINA S.A | catfer@email.com | 09/06/2019    | Debito      | 3465025 | OIUREWYTUIO |
  
      
      
      
      
      
      