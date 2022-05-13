
package Dominio;
import java.io.Serializable;
import java.io.*;

public class Rutas implements Serializable {
    private String calle;
    private double independiente;
    private double pendiente;
    
    
    public Rutas (String unaCalle, double xi, double yi, double xf, double yf){
        this.calle = unaCalle;
        double div = (yf-yi)/(xf-xi);
        double m = Math.atan(div);
        this.pendiente = m;
        this.independiente = (yi - m*xi);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public double getIndependiente() {
        return independiente;
    }

    public void setIndependiente(double independiente) {
        this.independiente = independiente;
    }

    public double getPendiente() {
        return pendiente;
    }

    public void setPendiente(double pendiente) {
        this.pendiente = pendiente;
    }
    
    public double distanciaPerpendicular(double x0,double y0){
        double alfa = 1/this.pendiente;
        double beta = y0-alfa*x0;
        double x = (beta-this.independiente)/(this.pendiente-alfa);
        double y = alfa*x+beta;
        double ret = Math.sqrt(Math.pow((x0-x),2)+Math.pow((y0-y),2));
        return ret;
    }
    
}
