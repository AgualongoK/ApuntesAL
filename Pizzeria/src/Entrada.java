import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        //Creamos una pizzería
        Pizzeria pizzaHut = new Pizzeria();

        //Creamos una lista de ingredientes para la pizza margarita
        ArrayList<Ingrediente> listaIngredientesMargarita = new ArrayList<>();

        //Añadimos los ingredientes a la lista
        listaIngredientesMargarita.add(new Ingrediente("Jamón", 1));
        listaIngredientesMargarita.add(new Ingrediente("Queso", 1.20));
        listaIngredientesMargarita.add(new Ingrediente("Champiñón", 2.20));

        //Creamos las pizzas
        Pizza pizzaMargarita1 = new Pizza("Roberto", listaIngredientesMargarita);
        Pizza pizzaMargarita2 = new Pizza("Juan", listaIngredientesMargarita);
        Pizza pizzaMargarita3 = new Pizza("Felipe", listaIngredientesMargarita);
        Pizza pizzaMargarita4 = new Pizza("Ángela", listaIngredientesMargarita);
        Pizza pizzaMargarita5 = new Pizza("Sofía", listaIngredientesMargarita);

        //Añadimos las pizzas a la listaPizzas (pedidos)
        pizzaHut.agregarPedido(pizzaMargarita1);
        pizzaHut.agregarPedido(pizzaMargarita2);
        pizzaHut.agregarPedido(pizzaMargarita3);
        pizzaHut.agregarPedido(pizzaMargarita4);
        pizzaHut.agregarPedido(pizzaMargarita5);

        //Servimos las pizzas con el id 0, 1 y 2
        pizzaHut.servirPizza(0);
        pizzaHut.servirPizza(1);
        pizzaHut.servirPizza(2);
        System.out.println("Se han servido correctamente los pedidos de Roberto, Juan y Felipe");

        //Vemos los pedidos pendientes
        System.out.println("Estos son los pedidos pendientes: ");
        pizzaHut.verPendientes();

        //Salto de línea
        System.out.println("\n");

        //Vemos el contenido de la caja tras realizar estas operaciones
        System.out.println("El valor de la caja es: "+ pizzaHut.getCaja() + " €");
    }
}
