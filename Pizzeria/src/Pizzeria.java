import java.util.ArrayList;

public class Pizzeria {

    //Creamos las propiedades
    private int contador=0;
    private ArrayList<Pizza> listaPizzas;
    private double caja;

    public Pizzeria(){
        listaPizzas = new ArrayList<>();
    }

    //Creamos los métodos

    public void agregarPedido(Pizza pizza){
        pizza.setId(contador);
        this.listaPizzas.add(pizza);
        contador++;
    }

    public void servirPizza(int id){
        for (Pizza pizza : listaPizzas) {
            if(pizza.getId() == id){
                pizza.setEstado(true);
                pizza.calcularPrecio();
                caja += pizza.getPrecio();
            }
        }
    }

    public void verPendientes(){
        for (Pizza pizza: listaPizzas) {
            if(!pizza.isEstado()){
                pizza.verDatos();
                //Salto de línea
                System.out.println("\n");
            }
        }
    }

    //Creamos los getters y setters


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
}
