import java.util.ArrayList;

public class Pizza {

    //Creamos las propiedades
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> listaIngredientes;
    private int id;
    private boolean estado;

    //Creamos los constructores
    public Pizza(){}

    public Pizza(String nombre){
        this.nombre = nombre;
        listaIngredientes = new ArrayList<>();
    }

    public Pizza(String nombre, ArrayList listaIngredientes){
        this.nombre = nombre;
        this.listaIngredientes = listaIngredientes;
    }

    public void calcularPrecio(){
        for (Ingrediente item : listaIngredientes) {
            precio = precio + item.getPrecio();
        }
    }

    public void verDatos(){
        calcularPrecio();
        System.out.println("Nombre: "+ nombre);
        System.out.println("Id: "+ id);
        System.out.println("Estado: "+ estado);
        System.out.println("Precio: "+ precio);
        for (Ingrediente item : listaIngredientes) {
            System.out.println("\t"+ item.getNombre() + " - " + item.getPrecio());
        }
    }

    //Creamos los Getters

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

    //Creamos los Setters


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
}
