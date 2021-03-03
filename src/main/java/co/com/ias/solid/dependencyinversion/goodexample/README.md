# BUEN uso de este principio :heavy_check_mark:

Para poder cumplir con el principio, se creó una interfaz que servirá como intermediaria entre los módulos de
la aplicación. De esta forma, no se genera acoplamiento entre módulos y una mayor flexibilidad, lo que a largo
plazo es un beneficio muy importante para las tareas de mantenimiento y escalabilidad de funcionalidades.

Adicionalmente, puede observar como se puede fácilmente modificar una implementación como cambiar de una base
de datos relacional a no relacional gracias a que el servicio no se interesa en la forma de implementación.