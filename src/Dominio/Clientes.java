
package Dominio;
import java.io.Serializable;
import java.io.*;

public class Clientes implements Serializable {
    private String nombre;
    private String lg;
    private String la;
    
    public Clientes (String unNombre, String unaLg,String unaLa){
        this.nombre = unNombre;
        this.lg= unaLg;
        this.la= unaLa;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }
    
    public String getLa() {
        return la;
    }

    public void setLa(String la) {
        this.la = la;
    }
    
    @Override
    public String toString() {
        return(this.getNombre());
    }
}
