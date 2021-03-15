# MAL uso de este principio :x:

En este ejemplo de mala implementación se puede observar como una clase de alto nivel, la clase <u>***LogsService***</u>,
depende de una clase de bajo nivel, <u>***Database***</u>, para almacenar logs en una base de datos. De esta manera
estamos generando acoplamiento entre los módulos de la aplicación.

## Considere el siguiente caso

La especificación para guardar logs ha cambiado y ahora debe almacenarlos en una base de datos no relacional, por
la forma en la que está construida su aplicación modificar este comportamiento implica modificar todos aquellos
módulos que hagan uso de la base de datos a raíz del acoplamiento generado.