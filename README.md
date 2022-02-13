# ApuntesAL
 Apuntes sobre la creación, uso y métodos derivados de un ArrayList. [Programación - FP Superior Desarrollo de Aplicaciones Multiplataforma 1er año]
 

 # Definición, uso y creación de un ArrayList
 
¿Qué es un ArrayList?

Es una lista que utiliza arrays (variables que almacenan datos en su interior).
Su tamaño es modificable, es decir, cambiará o no la longitud de éste al añadir o eliminar elementos.
Por defecto, un ArrayList siempre será de tipo Object. 


¿Para qué se usa un ArrayList? 

Es una manera sencilla y óptima de almacenar datos que posteriormente pueden ser usados a lo largo del código. 


¿Cómo se crea un ArrayList?

La creación de éste es la siguiente:


ArrayList nombre_ArrayList = new ArrayList();


Pero, podemos especificar el tipo de dato que queremos que almacene dentro de él para así evitar errores al futuro. Para ello, introducimos el tipo de variable que queramos dentro de los < >. Por ejemplo:


ArrayList<String> nombre_ListaString = new ArrayList();

 
ArrayList<Integer> nombre_ListaInteger = new ArrayList();

 
ArrayList<Double> nombre_ListaDouble = new ArrayList();
 
# Enunciado ejercicio 'Pizzería'
 
 Crear un programa que permita gestionar los pedidos de una pizzería. Para ello el
programa necesita:

- Crear pizza: la cual debe tener un conjunto de ingredientes (como máximo 10)
un precio (que dependerá del número de ingredientes que tenga), un número
de pedido, un nombre (la persona asociada) y un estado (si está servida o no).
Cada ingrediente estará formado por un nombre y un precio (p.e: cebolla, 0.70)

- Ver estado pizza: el cual mostrará los datos de la pizza con el identificador
introducido siempre y cuando la pizza no haya sido servida aún. (mostrará el
nombre de la persona, el precio de la pizza, el identificador y los ingredientes)

- Servir pizza: el cual modifica el estado de la pizza con el identificador
introducido

- Ver caja: el cual mostrará la caja realizada en el momento de la petición (el
precio de todas las pizzas vendidas)

Para la realización del ejercicio se requiere de las siguientes clases:
- Ingrediente:
 
o Propiedades: nombre (String), precio(double)
 
o Métodos: Constructor/es, Getter / Setter

 
- Pizza:
 
o Propiedades: nombre (String), precio(double), ArrayList<Ingrediente>;,
id (int), estado(boolean)

 
o Métodos: Constructor/es, agregarIngrediente(Ingrediente), verDatos(),
Getter / Setter

 
- Pizzeria:
 
o Propiedades: ArrayList<Pizza>;, caja (double)
 
o Métodos: Constructor/es, agregarPedido(Pizza), verEstadoPedido(int),
servirPedido(int), mostrarPedidosPendientes()

 
- Entrada

 
-Funciones a hacer sin menú:
 
o Crear una pizza margarita con 3 ingredientes (los que quieras)
 
o Crear una pizza cuatro quesos con 6 ingredientes (los que
quieras)
 
o Crear una pizza hawaiana con 4 ingredientes (los que quieras)
 
o Servir la pizza margarita
 
o Ver el estado de la pizza la hawaiana
 
o Ver estado de las pizzas pendientes
 
o Ver caja


# Explicación ejercicio Pizzería:

Antes de comenzar a escribir el código, es recomendable leer un par de veces el enunciado para entender lo que se nos pide hacer y a continuación, realizar un diagrama de flujo para esquematizar la funcionalidad del programa.

1.- Dicho esto, comenzaremos a programar la clase ‘Ingrediente’ porque es la base necesaria para poder realizar las demás clases,

Creamos las propiedades de tipo ‘private’ puesto que solo queremos que las pueda usar la propia clase Ingrediente, siendo inaccesibles para el resto de clases.

```
private String nombre;
private double precio;
```
 
Otorgamos a ‘Ingrediente’ un nombre y un precio.

Proseguiremos, creando constructores que harán que en la clase ‘Entrada’ se puedan formular tantos ingredientes como se desee. 

Por defecto creamos uno vacío y otro en el que se pide un nombre y un precio para poder crear un ingrediente,

```
public Ingrediente(){}
public Ingrediente(String nombre, double precio){
   this.nombre = nombre;
   this.precio = precio;
}
```

Formulamos los setters y los getters para poder modificar o recoger la información sobre las propiedades nombre y precio.
 
```
public String getNombre() {
   return nombre;
}

public double getPrecio() {
   return precio;
}

public void setNombre(String nombre) {
   this.nombre = nombre;
}

public void setPrecio(double precio) {
   this.precio = precio;
}
```

2.- Creamos la clase ‘Pizza’ con sus propiedades nombre, precio, listaIngredientes, id y estado. Es importante NO inicializar el valor del ArrayList en las propiedades, puesto que la longitud de éste se decidirá en la entrada.

El nombre corresponde a la persona a la que se le va a adjuntar el pedido.
El precio es la suma total del precio de todos los ingredientes que son almacenados en el ArrayList listaIngredientes.
La listaIngredientes es el lugar donde se almacenarán todos los ingredientes que creemos en la clase ‘Entrada’ y que, por consiguiente, serán los ingredientes que lleve la pizza.
El id será el número identificador del pedido.
El estado será para ver si el pedido se ha servido o no (FALSE= no servido, TRUE=servido).
 
```
private String nombre;
private double precio;
private ArrayList<Ingrediente> listaIngredientes;
private int id;
private boolean estado;
```
 
Creamos los constructores, uno vacío por defecto, otro en el que sea necesario indicar el nombre de la persona a la que se le va a adjuntar el pedido y otro en el que se requiera el nombre de la persona responsable del pedido y una lista con los ingredientes que llevará la pizza.

```
public Pizza(){}
public Pizza(String nombre){
   this.nombre = nombre;
   listaIngredientes = new ArrayList<>();
}
 
public Pizza(String nombre, ArrayList listaIngredientes){
   this.nombre = nombre;
   this.listaIngredientes = listaIngredientes;
}
```
 
Ahora viene lo complicado y es empezar a formular los métodos, pero tranquil@, voy a explicarlo de manera sencilla y comprensible.

Según el enunciado del ejercicio, hay que crear un método para calcular el precio de la Pizza.

Para ello, debemos recorrer la lista de ingredientes (ArrayList<Ingrediente>() listaIngredientes) con un ‘for each’ y dentro, haremos que al valor del precio (inicializado a nulo en las propiedades del inicio), se le sume el valor de cada ingrediente.

Recuerda que dentro de la listaIngredientes hay datos almacenados de tipo String e int en un array y para recorrerlo es necesario hacerlo con for each. Una vez dentro del ArrayList, el programa irá  recogiendo el precio de cada ingrediente.

```
public void calcularPrecio(){
   for (Ingrediente item : listaIngredientes) {
       precio = precio + item.getPrecio();
   }
 
}
```
 
Proseguimos con el método de verDatos, mediante el cual mostrará por consola las propiedades asociadas a la Pizza.

Comenzamos, llamando al método de calcularPrecio para que realice la suma de los precios de los ingredientes correspondientes.

Añadimos el nombre, el id, el estado de la pizza (servida o no servida), el precio y los ingredientes que la componen.

Para mostrar los ingredientes, recordamos que están dentro de un ArrayList y por eso, es necesario recorrerlo para posteriormente obtener el nombre y el precio de cada uno de ellos.

```
public void verDatos(){
 
   calcularPrecio();
 
   System.out.println("Nombre: "+ nombre);
 
   System.out.println("Id: "+ id);
 
   System.out.println("Estado: "+ estado);
 
   System.out.println("Precio: "+ precio);
 
   for (Ingrediente item : listaIngredientes) {
 
       System.out.println("\t"+ item.getNombre() + " - " + item.getPrecio());
 
   } 
```
 
Formulamos los setters y los getters para poder modificar o recoger la información sobre las propiedades: nombre, id, precio, estado y listaIngredientes.

```
public String getNombre() {
   return nombre;
}

public double getPrecio() {
   return precio;
}

public int getId() {
   return id;
}

public ArrayList<Ingrediente> getListaIngredientes() {
   return listaIngredientes;
}

public boolean isEstado() {
   return estado;
}

public void setNombre(String nombre) {
   this.nombre = nombre;
}

public void setPrecio(double precio) {
   this.precio = precio;
}

public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
   this.listaIngredientes = listaIngredientes;
}

public void setId(int id) {
   this.id = id;
}

public void setEstado(boolean estado) {
   this.estado = estado;
}
```

Con esto, ya habríamos terminado de programar la clase ‘Pizza’, continuamos con la clase Pizzería.

3.-Creamos la clase ‘Pizzeria’ y sus propiedades:

Un contador(que hará que el id de cada pedido sea auto-incrementable(se modifica en el método agregarPedido que veremos a continuación).
Una listaPizzas que almacenará los pedidos (pedidos compuestos por Pizzas).
Una caja que almacenará el dinero de las pizzas servidas.

Proseguimos con el constructor vacío, ya que no queremos que nos pasen ningún parámetro si no, solo crear una Pizzería que contenga una listaPizzas (lista que almacenará los pedidos).

```
public Pizzeria(){
   listaPizzas = new ArrayList<>();
}
```
 
Ahora sí, vamos con los métodos que simulan el funcionamiento de un negocio real.

Primero: el método agregarPedido necesita que se le pase una variable de tipo Pizza(clase Pizza). Dentro del método reemplazamos el id con el setter para cambiarlo a contador. Este contador se incrementará a medida que se vayan añadiendo pizzas (pedido 0, pedido 1, pedido 2, etc…). Por último, solo nos queda añadir la pizza a la listaPizzas.

```
public void agregarPedido(Pizza pizza){
   pizza.setId(contador);
   this.listaPizzas.add(pizza);
   contador++;
}
```
 
Ahora, en el método servirPizza, necesitamos pasar por parámetros el id (id de la Pizza) que queramos servir. Recorreremos la lista de todas las pizzas (listaPizzas) y dentro, definiremos la condición de que si los id coinciden (el deseado y el asociado a una pizza), el estado de la pizza pasará a ser true (pizza servida). 
Calcularemos el precio total de la pizza y añadiremos el nuevo precio a la caja (se ha servido la pizza, el cliente ha pagado y guardamos el dinero en la caja).

```
public void servirPizza(int id){
   for (Pizza pizza : listaPizzas) {
       if(pizza.getId() == id){
           pizza.setEstado(true);
           pizza.calcularPrecio();
           caja += pizza.getPrecio();
       }
   }
}
```
 
Como en todo negocio, también es importante saber cuántos pedidos están pendientes y por eso, desarrollamos el método verPendientes.
Comenzamos recorriendo la listaPizzas y dentro, verificamos el estado de cada una de ellas. Esto lo establecemos en la condición del ‘if’: “si el estado de la pizza no es true” entonces, mostrar los datos del pedido.

```
public void verPendientes(){
   for (Pizza pizza: listaPizzas) {
       if(!pizza.isEstado()){
           pizza.verDatos();
           //Salto de línea
           System.out.println("\n");
       }
   }
}
``` 

Por último, establecemos los getters y los setters de la clase pizzería

``` 
public void setListaPizzas(ArrayList<Pizza> listaPizzas) {
   this.listaPizzas = listaPizzas;
}

public void setCaja(double caja) {
   this.caja = caja;
}

public ArrayList<Pizza> getListaPizzas() {
   return listaPizzas;
}

public double getCaja() {
   return caja;
}
```
 
4.-Ahora solo nos queda, simular un negocio de pizzas.

Comenzamos creando el establecimiento, en este caso, PizzaHut.

``` 
Pizzeria pizzaHut = new Pizzeria();
```

Proseguimos con crear la lista de  ingredientes que nuestro negocio ofrece: 

```
ArrayList<Ingrediente> listaIngredientesMargarita = new ArrayList<>();
```
 
Ahora que tenemos una lista, añadimos el nombre y el precio de cada ingrediente que deseemos de la siguiente manera:

``` 
listaIngredientesMargarita.add(new Ingrediente("Jamón", 1));
listaIngredientesMargarita.add(new Ingrediente("Queso", 1.20));
listaIngredientesMargarita.add(new Ingrediente("Champiñón", 2.20));
```
 
Ahora que ya tenemos unos ingredientes, podemos hacer pizzas y que los clientes hagan sus pedidos.  En este caso, tendremos 5 clientes: Roberto, Juan, Felipe, Ángela y Sofía.

``` 
Pizza pizzaMargarita1 = new Pizza("Roberto", listaIngredientesMargarita);
Pizza pizzaMargarita2 = new Pizza("Juan", listaIngredientesMargarita);
Pizza pizzaMargarita3 = new Pizza("Felipe", listaIngredientesMargarita);
Pizza pizzaMargarita4 = new Pizza("Ángela", listaIngredientesMargarita);
Pizza pizzaMargarita5 = new Pizza("Sofía", listaIngredientesMargarita);
```
 
Cuando cada cliente ha dado su nombre y los ingredientes que desee que lleve la pizza, agregamos el pedido a listaPizzas:

```
pizzaHut.agregarPedido(pizzaMargarita1);
pizzaHut.agregarPedido(pizzaMargarita2);
pizzaHut.agregarPedido(pizzaMargarita3);
pizzaHut.agregarPedido(pizzaMargarita4);
pizzaHut.agregarPedido(pizzaMargarita5);
```
 
En este caso, vamos a servir las pizzas de Roberto, Juan y Felipe (id0, id1 e id2):

``` 
pizzaHut.servirPizza(0);
pizzaHut.servirPizza(1);
pizzaHut.servirPizza(2);
System.out.println("Se han servido correctamente los pedidos de Roberto, Juan y Felipe");
```
 
Al principio, hemos visto que teníamos 5 clientes. Ya hemos servido 3 por lo que nos quedarían 2 pedidos pendientes (los de Ángela y Sofía). Esto lo sabemos gracias a la lógica humana, pero el programa también puede hacerlo y además, nos mostrará toda la información de los pedidos pendientes (nombre, id, precio, estado y lista con los ingredientes que lleva la pizza).

``` 
System.out.println("Estos son los pedidos pendientes: ");
pizzaHut.verPendientes();
```
 
Supongamos que ya ha terminado la jornada laboral y solo hemos podido servir  3 pedidos. Tendremos que hacer el recuento de la caja y por ello haremos lo siguiente:

``` 
System.out.println("El valor de la caja es: "+ pizzaHut.getCaja() + " €");
```
 
Con esto finaliza el ejercicio que simula el funcionamiento de una Pizzería.

Ahora faltaría hacerlo con un menú interactivo, pero eso ya es otro rollo…
