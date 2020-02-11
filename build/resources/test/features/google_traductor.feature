#language:es
@Tag0
Característica: Traductor de Google
  como usuario quiero ingresar al traductor de Google
  a traducir palabras entre diferentes lenguajes.

  @Tag1
  Escenario: Traducir de Inglés a Español
    Dado que brandon quiere usar el Traductor de Google
    Cuando el traduce la palabra table de Ingles a Español
    Entonces el deberia ver la palabra mesa en la pantalla

  @Tag2
  Escenario: Traducir de un idioma a otro
    Dado que Juana quiere usar el Traductor de Google
    Cuando el traduce una palabra de un idioma a otro
      | origen  | destino | entrada |
      | inglés  | español | table   |

    Entonces el verifica que la palabra traducida del idioma origen a idioma destino
      | salida |
      | mesa   |
