import java.util.ArrayList;

public class Explicacion {

    public static void main(String[] args) {

        //Creamos un ArrayList de tipo String

        ArrayList<String> listaPalabras = new ArrayList();

        /*Antes de empezar con los métodos, es recomendable verificar que se ha importado
        las funciones del ArrayList. Deberemos ver en el principio de la clase la frase:
         "import java.util.ArrayList;" (línea 1) */

        //MÉTODOS:

        //Añadir un elemento a la lista

        listaPalabras.add("Alemania");
        listaPalabras.add("Bolivia");
        listaPalabras.add("Croacia");
        listaPalabras.add("Dinamarca");

        // Ver longitud de la lista:
        // Comando:  listaPalabras.size()

        System.out.println("La longitud actual del ArrayList es: "+listaPalabras.size());

        //Salto de línea
        System.out.println("\n");

        //Obtener un dato almacenado en la posición que indiquemos:
        // Comando: listaPalabras.get(0)

        System.out.println("El elemento en la posición 0 es: "+ listaPalabras.get(0));

        //Salto de línea
        System.out.println("\n");

        /* Mostrar datos por consola
           Para poder hacer esto, hay que recorrer el ArrayList. Necesitaremos hacerlo con un 'for each' o con un 'for'.
         */

        //Mostrar datos con un 'for':
        /*Es la manera más compleja de recorrerlo. Los pasos a seguir son:
        1.-Indicar en la formulación del for el tamaño del ArrayList: listaPalabras.size()
        2.-Introducir dentro del 'System.out.println', el comando para obtener un elemento del ArrayList: listaPalabras.get()
        3.-Introducir dentro del 'get' la 'i' del 'for', para que lo recorra de manera progresiva
           (es decir: elemento1, elemento2, elemento3, etc...): listaPalabras.get(i)
         */
        for (int i = 0; i < listaPalabras.size(); i++) {
            System.out.println(listaPalabras.get(i));
        }

        //Salto de línea
        System.out.println("\n");

        // Mostrar datos con un 'for each':
        /* Es recomendable usar esta manera de recorrer un ArrayList, puesto que la formulación es mucho
           más sencilla. Los pasos a seguir son:
           1.-Indicar el nombre de la lista a recorrer: for(x x: listaPalabras)
           2.-Teniendo en cuenta el tipo de variable que queremos mostrar por pantalla, lo indicamos también en el for each,
              teniendo la siguiente estructura:  for(String x : listaPalabras)
           3.-Ponemos un nombre cualquiera al 'for each':  for(String item: listaPalabras)
           4.-El nombre que acabamos de poner (en este caso: item), será lo que meteremos en el 'System.out.println'
         */
        for (String item: listaPalabras) {
            System.out.println(item);
        }

        //Salto de línea
        System.out.println("\n");

        //Eliminar un elemento:
        /*Indicamos dentro del 'remove' la posición que ocupa el elemento que queramos borrar
          Comando: listaPalabras.remove(0)
         */
        listaPalabras.remove(0);

        /*Hemos eliminado el elemento que ocupaba la posición '0' (Alemania).
          Para verificarlo, imprimimos de nuevo el ArrayList:
         */
        System.out.println("Contenido de la lista tras borrar el elemento en la posición 0: ");
        for (String item: listaPalabras) {
            System.out.println(item);
        }

        //Salto de línea
        System.out.println("\n");

        //Comprobar si la lista contiene un elemento:
        /*Para hacer esto, introducimos el elemento que queramos verificar que está dentro
          del ArrayList.
          El resultado de esta consulta será de tipo booleano.
          TRUE = la lista SÍ contiene el elemento.
          FALSE = la lista NO contiene el elemento.

          Comando: listaPalabras.contains(" ")
         */

        System.out.println("¿La lista contiene el elemento Dinamarca? : "+ listaPalabras.contains("Dinamarca"));
        System.out.println("¿La lista contiene el elemento Alemania? : "+listaPalabras.contains("Alemania"));

        //Vaciar la lista:
        // Para ello solo tendremos que escribir el siguiente comando:
        listaPalabras.clear();

        //Los siguientes métodos no los solemos usar en clase pero los indicaré a continuación

        /*Añadir un elemento 'n' en una posición 'a'
          Comando: listaPalabras.add(n,a)

          Clonar la lista:
          Comando: listaPalabras.clone()

          Encontrar la posición de la primera aparición del elemento 'n' en la lista:
          (El resultado es el número de la posición pero si no existe el elemento, muestra por consola el valor -1):
          Comando: listaPalabras.indexOf(n)

          Encontrar la posición de la última aparición del elemento 'n' en la lista:
          (El resultado es el número de la posición pero si no existe el elemento, muestra por consola el valor -1):
          Comando: listaPalabras.lastIndexOf(n)

          Modificar el valor almacenado en la lista en la posición 'a' por el valor 'n':
          Comando: listaPalabras.set(a, n)
          */

        //Ahora veremos la utilidad en un programa del ArrayList, para ello ve al ejercicio 'Pizzería' que encontrarás en este repositorio
    }
}
