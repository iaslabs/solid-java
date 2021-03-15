# BUEN uso de este principio :heavy_check_mark:

Para solucionar los inconvenientes generados por no usar este principio, se realizaron los siguientes cambios:

- Se creó una interfaz, la cuál dictará el lineamiento de que todos los polígonos deben implementar un método para
calcular el área.
- En cada uno de los diferentes tipos de polígonos se introdujo la lógica para retornar el área correspondiente.
- En el servicio de cálculos se modificó la lógica para que únicamente invoque dicho método y realice su respectivo
cálculo.
  
Con estas modificaciones la aparición de nuevos tipos de polígonos o incluso de nuevos cálculos se puede llevar a
cabo fácilmente, extendiendo el dominio de la aplicación sin modificar la lógica del core.