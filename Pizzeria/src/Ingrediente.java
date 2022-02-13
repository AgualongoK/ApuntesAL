public class Ingrediente {

    // Creamos las propiedades
    private String nombre;
    private double precio;

    //Creamos los constructores
    public Ingrediente(){}

    public Ingrediente(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Creamos los Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //Creamos los Setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
