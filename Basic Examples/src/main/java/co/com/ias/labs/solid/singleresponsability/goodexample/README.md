# BUEN uso de este principio :heavy_check_mark:

En este caso se incluyó una nueva clase llamada <u>**NotificationService**</u> cuya responsabilidad será realizar las notificaciones de la aplicación. Además, se modificaron los parámetros de entrada del método, del tal forma que sea más genérico y permita su reuso.

Al hacer uso de este principio obtenemos los siguientes beneficios:

- Mayor claridad frente a las tareas que se ejecutan en cada parte de la aplicación.
- Facilidad de reuso frente a un crecimiento del dominio de la aplicación.
- Ante la aparición de nuevos canales de notificación, agregar un nuevo método tiene sentido dentro de la clase <u>**NotificationService**</u>
