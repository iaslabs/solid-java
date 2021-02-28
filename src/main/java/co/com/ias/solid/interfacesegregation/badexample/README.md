# MAL uso de este principio :x:

En esta forma de implementación de interfaces podemos ver como para el caso de un usuario
anónimo se deben realizar las excepciones para indicar que el usuario no puede efectuar
dicha operación. Teniendo una interfaz global para todas las operaciones de usuario
está generando que todas las clases que la usen dependan de métodos que no deben implementar.

## Considere el siguiente caso

Debe incluir dos nueva operaciones: una para crear un recurso y otra para obtener la factura
de dicho recurs.Además, un nuevo tipo de usuario llamado **Auditor**, quién podrá
listar los recursos tanto públicos como privados y ver su correspondiente factura, pero no
podrá crear ni eliminar recursos.

Teniendo en cuenta como está construida la aplicación actualmente, agregar dos nuevas
operaciones en la interfaz de *UserOperations* implica modificar todas las clases
de los demás usuarios y controlar los casos en los cuales dicho usuario no pueda
ejecutar la tarea.