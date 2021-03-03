# Dependency inversion principle - Principio de inversión de dependencias :thumbsup:

El principio de inversión de dependencias nos dice que entre los módulos de la aplicación, especialmente
entre los módulos de bajo y alto nivel. La forma en la que se plantea este principio garantiza que entre
los diferentes módulos de la aplicación no importe la forma, lógica o framework que se esté haciendo la
implementación real de dicho módulo, pues la forma de establecer comunicación entre ellos será mediante
abstracciones.

Algunos de los beneficios de aplicar correctamente este principio son:

- Reduce el acoplamiento entre módulos.
- Utilizando clases abstractas e interfaces proporcionamos estabilidad al programa frente a un posterior cambio.
- Las modificaciones realizadas en alguno de los módulos no afecta a los otros módulos dependientes.

## Acerca del ejemplo :bulb:

Para este principio utilizaremos como ejemplo la conexión y operación de guardado de logs en base de datos, una
situación común en los servicios backend. 