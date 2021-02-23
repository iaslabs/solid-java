# MAL uso de este principio :x:

En este caso vemos un mal uso de este principio ejecutando diferente lógica según el tipo de polígono que recibió el
método <u>*calculateSumArea*</u>. Si bien podría considerar realizar cambios en el método para no repetir las
validaciones de tipo de polígono, por ejemplo, recibiendo un array de objetos y realizar un ciclo sobre dicho array,
uno de los problemas más grandes realmente radica en la validación que debe realizar sobre el tipo de polígono.
Esta lógica puede llegar a ser confusa y, además, no es escalable a medida que la aplicación permita otros tipos de
polígonos.

## Considere el siguiente caso
El proyecto ha generado una nueva ruta de crecimiento de la aplicación, donde ahora permitirá el uso de 2 nuevos tipos
de polígonos. 

Este crecimiento en el dominio implicaría:
- Crecimiento en la lógica en el servicio de cálculos.
- Incrementa la complejidad en la lectura del código.