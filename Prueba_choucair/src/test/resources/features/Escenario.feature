Feature: prueba

Scenario Outline: prueba automatizacion
 Given El usuario ingresa a la pagina 
 When Usuario y contraseņa <usuario> <contraseņa>
 Then Crea una busines unit
 Then Crea una Reunion <Nombre_reunion>

Examples:
| usuario | contraseņa |Nombre_reunion|
| "admin" | "serenity" |"Reunion Quincenal"|