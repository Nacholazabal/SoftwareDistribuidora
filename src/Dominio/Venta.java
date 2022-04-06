
package Dominio;
import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
public class Venta implements Serializable {
    private Clientes cliente;
    private ArrayList <Productos> pedidos;
    //private int[] cantproducto;
    private int CantTotLitros;
    
    public Venta (Clientes unCliente, ArrayList<Productos> array, int unacant){
        this.cliente = unCliente;
        this.pedidos=array;
        this.CantTotLitros= unacant;
    }
    public ArrayList<Productos> getPedidos() {
    return pedidos;
}

public void setPedidos(ArrayList<Productos> pedid) {
    this.pedidos = pedid;
}
    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes unCliente) {
        this.cliente = unCliente;
    } 

    public int getCantTotLitros() {
        return CantTotLitros;
    }

    public void setCantTotLitros(int unCantTotLitros) {
        this.CantTotLitros = unCantTotLitros;
    }
}
    
