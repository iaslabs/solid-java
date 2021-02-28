# Liskov substitution principle – Principio de sustitución de Liskov :thumbsup:

El principio de Liskov nos revela una pauta para detectar problemas en la forma que usamos la
herencia de clases dentro de nuestro aplicativo, el cual indica que todas las clases hijas deben
poderse comportar como la clase padre sin necesidad de conocer la diferencia entre ellas.

Este principio se reduce básicamente en lo siguiente: 

> Si cuando sobreescribimos un método en la clase que hereda necesitamos lanzar una excepción o no realiza nada, entonces probablemente estamos violando el LSP.

Si en nuestro aplicativo encontramos una violación a este principio, es una clara señal de que
se debe plantear una nueva estructura de herencias.

Algunos de los beneficios de cumplir con este principio son:
- Claridad en la estructura de herencia de nuestra aplicación.
- Evita la creación de lógica adicional para controlar las veces que no cumplamos este principio.

## Acerca del ejemplo :bulb:

Para este principio utilizaremos como ejemplo la herencia de clases para tipos de aves, donde podremos observar el
comportamiento cuando aplicamos o no aplicamos el principio correctamente.
