# MAL uso de este principio :x:

En este caso vemos como se viola el principio de Liskov al momento en el que para la clase Dodo se
sobreescribe el método <u>*fly*</u> para arrojar una excepción indicando que no puede volar.
Esta situación nos obliga a agregar nueva lógica en el aplicativo para controlar este tipo de
excepciones y para distinguir entre las clases hijas de <u>***Bird***</u>.

## Considere el siguiente caso
Su dominio de negocio ha crecido y ahora el aplicativo podrá utilizar otras aves, como por ejemplo,
pingüinos y avestruces. La aparición de estas nuevas clases implica que deba ir añadiendo dentro
de estas la lógica necesaria para indicar que no son aves voladoras y todas aquellas clases
o métodos externos que hagan uso de las clases de estas aves deberán hacer control del
error que pueden arrojar. 

Adicionalmente, si en algún momento desea añadir un método para la acción de nadar, deberá modificar
todas las demás aves según sea el caso.
