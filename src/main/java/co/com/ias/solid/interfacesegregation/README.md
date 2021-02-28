# Interface segregation principle – Principio de segregación de interfaces :thumbsup:

El principio de segregación de interfaces dice que ninguna clase que implemente una interfaz
debería estar obligada a depender de métodos que no utiliza. Tambien se puede definir
como la priorización de la creación de multiples interfaces específicas, en lugar de
una única interfaz de uso general.

Algunos de los beneficios de cumplir con este principio son:
- Facilita mantener una arquitectura desacoplada.
- Las refactorizaciones y modificaciones son más simples de realizar.
- A partir de este principio surge el concepto de [role interface](https://martinfowler.com/bliki/RoleInterface.html).

## Acerca del ejemplo :bulb:

Para este principio utilizaremos como ejemplo diferentes roles de usuario y las operaciones
que pueden ser ejecutadas según el mismo, comportamiento muy común dentro de las plataformas con
interfaz de administrador.