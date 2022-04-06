
package Dominio;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;

public class Venta implements Serializable {
    private Clientes cliente;
    private Productos producto;
    //private int[] cantproducto;
    private int CantLitros;
    
    public Venta (Clientes unCliente, Productos unPrducto, int unacant){
        this.cliente = unCliente;
        this.producto=unPrducto;
        this.CantLitros= unacant;
    }
    public Productos getPedidos() {
    return producto;
}

public void setPedidos(Productos pedid) {
    this.producto = pedid;
}
    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes unCliente) {
        this.cliente = unCliente;
    } 

    public int getCantLitros() {
        return CantLitros;
    }

    public void setCantLitros(int unCantLitros) {
        this.CantLitros = unCantLitros;
    }
    
    @Override
    public String toString() {
        return(this.getPedidos().getNombre()+" - "+this.getCantLitros());
    }
}

