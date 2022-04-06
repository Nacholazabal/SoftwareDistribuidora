
package Dominio;
import java.io.Serializable;
import java.io.*;
public class Camiones implements Serializable {
    private String nombre;
    private int cargaL;
    private String matricula;
    private String chofer;
    
    public Camiones (String unNombre,int unaCarga, String unaMatricula, String unChofer){
        this.nombre = unNombre;
        this.cargaL=unaCarga;
        this.matricula=unaMatricula;
        this.chofer=unChofer;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCargaL() {
        return cargaL;
    }

    public void setCargaL(int cargaL) {
        this.cargaL = cargaL;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }
    
    
    @Override
    public String toString() {
        return(this.getNombre());
    }
}
