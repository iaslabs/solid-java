# Open/Closed principle - Principio de abierto/cerrado

Este principio se refiere a que nuestro dominio de la aplicación debe estar abierto a la extensión, es decir, a la
posibilidad de abarcar nuevos casos de uso, pero a su vez debe estar cerrado a modificaciones del core de la lógica de
la aplicación.

Algunos de los beneficios de aplicar este principio son:
- Facilidad para incluir nuevos actores dentro de la aplicación.
- Evita las modificaciones del código previamente construido.
- Deja las puertas abiertas a un crecimiento orgánico de la aplicación.  

## Acerca del ejemplo :bulb:

Para este principio utilizaremos como ejemplo el cálculo de la suma de áreas de polígonos. Con este ejemplo podrá
observar como no implementar este principio implica grandes modificaciones y/o crecimiento en la lógica ante el
crecimiento del dominio de la aplicación, en este caso con la aparición de un nuevo tipo de polígono.