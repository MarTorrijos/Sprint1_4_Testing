
## Descripción

Ejercicios pensados para practicar el uso de testing con JUnit y AssertJ.

### Tecnologias usadas

- Java 23

- IntelliJ


***

## Nivel 1

<br>

EJERCICIO 1:

Crea una clase Java que gestione una colección de libros en una biblioteca. La clase debe permitir agregar libros, recuperar la lista de libros, obtener un libro específico por su posición, agregar un libro en una posición específica y eliminar un libro por título.

Implementa las siguientes funcionalidades:

- La clase debe permitir agregar libros a la colección
- Se debe poder recuperar la lista completa de libros
- Se debe poder obtener el título de un libro dado una posición
- Se debe poder agregar un libro en una posición específica
- Se debe poder eliminar un libro por título

Verifica su correcto funcionamiento con JUnit:

- Verificar que la lista de libros no es nula después de crear un nuevo objeto
- Confirmar que la lista tiene una tamaño esperado después de insertar varios libros
- Asegurar que la lista contiene un libro específico en su posición correcta
- Verificar que no hay títulos de libros duplicados en la lista
- Comprobar que se puede recuperar el título de un libro dado una posición específica
- Asegurar que agregar un libro modifica correctamente la lista
- Confirmar que eliminar un libro disminuye el tamaño de la lista
- Verificar que la lista permanece ordenada alfabéticamente después de agregar o eliminar un libro


<br>

EJERCICIO 2:

Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir el número como parámetro
Crea una clase jUnit que verifique su correcto funcionamiento, parametrizándola para que el test reciba un espectro de datos amplio y válido si el cálculo es correcto para 10 números de DNI predefinidos

<br>

EJERCICIO 3:

Crea una clase con un método que lance una ArrayIndexOutOfBoundsException
Verifica su correcto funcionamiento con un test jUnit

<br>

***


## Nivel 2

Crea las clases Java y/o pruebas que las verifiquen para demostrar lo siguiente:

<br>

EJERCICIO 1: 

Una aserción que demuestre que el valor de dos objetos enteros es igual, y otra que indique que no lo es

<br>

EJERCICIO 2: 

Una aserción que demuestre que la referencia a un objeto es la misma que otra, y otra que indique que es diferente

<br>

EJERCICIO 3:

Una aserción que indique que dos arreglos de enteros son idénticos.

<br>

EJERCICIO 4:

Crea un ArrayList que contenga diversos tipos de objetos (créalos también). Escribe una aserción para verificar el orden de los objetos en el ArrayList según han sido insertados.

Ahora verifica que la lista anterior contiene los objetos en cualquier orden. Verifica que, en la lista anterior, uno de los objetos se ha añadido solo una vez. Deja uno de los elementos sin añadir y verifica que la lista no contiene este último.

<br>

EJERCICIO 5:

Crea un map y verifica que contiene una de las claves que le añades.

<br>

EJERCICIO 6:

Provoca una ArrayIndexOutOfBoundsException en una clase cualquiera. Crea una aserción que valide que la excepción es lanzada cuando corresponde.

<br>

EJERCICIO 7:

Crea un objeto Optional vacío. Escribe la aserción correcta para verificar que efectivamente está vacío.

<br>


***


## Cómo ejecutarlo
Clona el repositorio o descarga el archivo zip, luego ábrelo en tu entorno de desarrollo integrado (IDE) preferido.
