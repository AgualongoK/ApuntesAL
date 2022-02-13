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

