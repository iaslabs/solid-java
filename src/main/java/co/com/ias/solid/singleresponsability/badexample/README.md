# MAL uso de este principio :x:

En este caso vemos un mal uso de este principio agregando dentro de la clase <u>***User***</u> el método <u>*sendEmailNotification*</u> generando los siguientes inconvenientes:

- No hay claridad en la responsabilidad que tiene la clase, pues se encarga de definir el modelo de los usuarios y de enviar notificaciones.
- El método recibe una instancia de User para realizar el envío, lo que ocasiona que tenga como responsabilidad adicional obtener el correo del usuario.
- Piense en el caso en el que deba agregar un nuevo canal de notificaciones, por ejemplo, via SMS.

Considere adicionalmente el caso en el que su aplicativo crezca en dominio y no deba enviar solo notificaciones a usuarios, ahora debe realizar notificaciones a compañias registradas en el aplicativo. Este crecimiento ocasionará los siguientes problemas:

- No es posible reutilizar el método para enviar notificaciones.
- Si modifica el método para que únicamente reciba como parámetros el correo y el mensaje implica modificar todas las partes de la aplicación que ya utilizan este método.
- Buscar alternativas, como una sobrecarga de métodos para no afectar las partes ya existentes de código, podría representar una deuda técnica en herramientas como SonarQube, las cuales verifican la calidad de su código.
