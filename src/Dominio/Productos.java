package Dominio;

public class Productos {
    private String nombre;
    private int cant;
  //private int stock;
  // private int pedido;
    public Productos (String unNombre ){ //int unacant
        this.nombre = unNombre;
        this.cant=0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    @Override
    public String toString() {
        return(this.getNombre()+"-"+this.getCant());
    }    
}
