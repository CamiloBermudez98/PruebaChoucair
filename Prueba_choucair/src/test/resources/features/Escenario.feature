Feature: prueba

Scenario Outline: prueba automatizacion
 Given El usuario ingresa a la pagina 
 When Usuario y contraseña <usuario> <contraseña>
 Then Crea una busines unit
 Then Crea una Reunion <Nombre_reunion>

Examples:
| usuario | contraseña |Nombre_reunion|
| "admin" | "serenity" |"Reunion Quincenal"|