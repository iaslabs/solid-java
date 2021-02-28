# BUEN uso de este principio :heavy_check_mark:

Para cumplir con el principio se construyeron 3 interfaces para agrupar los diferentes
tipos de tareas, de esta forma puede construir clases que implementen las mismas de forma
más específica y sin depender de métodos que no deberían implementar. Con esta estructura
agregar nueva tareas o nuevos tipos de usuarios se convierte en una tarea más simple. Por ejemplo,
si quisiera darle al administrador las capacidades del auditor, solo tendría que
agregar la implementación en la declaración de la clase y sobreescribir el método según
la necesidad.