Feature: prueba

Scenario Outline: prueba automatizacion
 Given El usuario ingresa a la pagina 
 When Usuario y contrase�a <usuario> <contrase�a>
 Then Crea una busines unit
 Then Crea una Reunion <Nombre_reunion>

Examples:
| usuario | contrase�a |Nombre_reunion|
| "admin" | "serenity" |"Reunion Quincenal"|