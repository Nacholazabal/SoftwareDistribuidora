
package Dominio;
import java.io.Serializable;
import java.io.*;

public class Rutas implements Serializable {
    private String calle;
    private double independiente;
    private double pendiente;
    private double [] dominio;
    
    public Rutas (String unaCalle, double xi, double yi, double xf, double yf){
        this.calle = unaCalle;
        double div = (yf-yi)/(xf-xi);
        double m = Math.atan(div);
        this.pendiente = m;
        this.independiente = (yi - m*xi);
        double [] dom = {xi,yi,xf,yf};
        this.dominio = dom;
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
        if (Math.abs(this.dominio[0]-this.dominio[2]) > Math.abs(this.dominio[1]-this.dominio[3])) {  // /xi-xf/ > /yi-yf/ es horizontal
            if(this.dominio[0] > this.dominio[2]){                           //xi>xf
                if ( x0 > this.dominio[0] || x0 < this.dominio[2]) {         //si x0>xi o x0<xf se fue del dominio
                    return Double.MAX_VALUE - 0.1;                           // retorno una distancia muy grande, asi no la tiene en cuenta
                }
            }
            else{
                if ( x0 < this.dominio[0] || x0 > this.dominio[2]) {        // (xf>xi) => si x0>xf o x0<xi se fue del dominio
                    return Double.MAX_VALUE - 0.1;
                }
            }
        }
        else{                                                               // es una calle vertical
            if(this.dominio[1] > this.dominio[3]){                           //yi>yf
                if ( y0 > this.dominio[1] || y0 < this.dominio[3]) {         //si y0>yi o y0<yf se fue del dominio
                    return Double.MAX_VALUE - 0.1;                           // retorno una distancia muy grande, asi no la tiene en cuenta
                }
            }
            else{
                if ( y0 < this.dominio[1] || y0 > this.dominio[3]) {        
                    return Double.MAX_VALUE - 0.1;
                }
            }
        }
        double alfa = 1/this.pendiente;
        double beta = y0-alfa*x0;
        double x = (beta-this.independiente)/(this.pendiente-alfa);
        double y = alfa*x+beta;
        double ret = Math.sqrt(Math.pow((x0-x),2)+Math.pow((y0-y),2));
        return ret;
    }
    
     @Override
    public String toString() {
        return(this.getCalle()+" /indep/ "+this.getIndependiente()+" /pend/ "+this.getPendiente());
    }  
    
}
