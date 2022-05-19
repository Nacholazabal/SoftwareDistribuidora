package Dominio;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Observable;

public class SistemaBeta extends Observable implements Serializable {
    public ArrayList<Camiones> listaCamiones;
    public ArrayList<Clientes> listaClientes;
    public ArrayList<Productos> listaProductos;
    public ArrayList<Venta> listaVentas;
    public ArrayList<Rutas> listaRutas;
    public SistemaBeta() {
        listaVentas = new ArrayList<Venta>();  
        listaCamiones = new ArrayList<Camiones>();
        listaClientes = new ArrayList<Clientes>();
        listaProductos = new ArrayList<Productos>();
        listaRutas = new ArrayList<Rutas>();
    }
    
    public void agregarVentas(Venta unaVenta) {
        listaVentas.add(unaVenta);
    }
    
    public void agregarCamiones(Camiones unaCamiones) {
        listaCamiones.add(unaCamiones);
    }

    public void agregarClientes(Clientes unClientes) {
        listaClientes.add(unClientes);
    }

    public void agregarProductos(Productos unProductos) {
        listaProductos.add(unProductos);
    }
    
    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }
    
    public ArrayList<Camiones> getListaCamiones() {
        return listaCamiones;
    }

    public void setListaCamiones(ArrayList<Camiones> listaCamiones) {
        this.listaCamiones = listaCamiones;
    }

    public ArrayList<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public ArrayList<Rutas> getListaRutas() {
        return listaRutas;
    }

    public void agregarRutas(Rutas unaRuta) {
        listaRutas.add(unaRuta);
    }
    
     public ArrayList<String> seleccionarCamiones() {
        ArrayList<String> alt = new ArrayList<String>();
        for (int i = 0; i < listaCamiones.size(); i++) {
                alt.add(listaCamiones.get(i).getNombre());
        }
        return (alt);
    }
     
    public void actualizar() {

        this.setChanged();
        this.notifyObservers();
    }
    
    //////////////////////////////////////////////////////////////////////
    
    
    public void eliminarCamion(String unCamion){
        for (int i = 0; i < this.listaCamiones.size(); i++) {
            if (this.listaCamiones.get(i).toString().equals(unCamion)) {
                this.listaCamiones.remove(i);
                return;
            }
        }
    }
    
    public void eliminarCliente(String unCliente){
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (this.listaClientes.get(i).toString().equals(unCliente)) {
                this.listaClientes.remove(i);
                return;
            }
        }
    }
    
    public void eliminarProducto(String unProducto){
        for (int i = 0; i < this.listaProductos.size(); i++) {
            if (this.listaProductos.get(i).toString().equals(unProducto)) {
                this.listaProductos.remove(i);
                return;
            }
        }
    }
    
    public void eliminarPedido(String unPedido){
        for (int i = 0; i < this.listaVentas.size(); i++) {
            if(this.listaVentas.get(i).toString().equals(unPedido)){
                this.listaVentas.remove(i);
                return;
            }
        }
    }
    
    public void eliminarRuta(String unaRuta){
        for (int i = 0; i < this.listaRutas.size(); i++) {
            if(this.listaRutas.get(i).toString().equals(unaRuta)){
                this.listaRutas.remove(i);
                return;
            }
        }
    }
    
    public Clientes devolverCliente(String unCliente){
        for (int i = 0; i < this.getListaClientes().size(); i++) {
            String aux = this.getListaClientes().get(i).toString();
            if(aux.equals(unCliente)){
                return this.getListaClientes().get(i);
            }
        }
        return null;
    }
    
    public Productos devolverProducto(String unProducto){
        for (int i = 0; i < this.getListaProductos().size(); i++) {
            String aux = this.getListaProductos().get(i).toString();
            if(aux.equals(unProducto)){
                return this.getListaProductos().get(i);
            }
        }
        return null;
    }
    
    public boolean validacionyRestaVenta(Productos unProd, int unaCant){
        if(unProd.getCant()>unaCant){
            unProd.setCant(unProd.getCant()-unaCant);
            return true;
        }
        return false;
    }
    
    ///////////////////////////////////////////////////////
    
    public int sumaLitrosCliente(Clientes unCliente){
        int ret = 0;
        for (int i = 0; i < this.listaVentas.size(); i++) {
            if (this.listaVentas.get(i).getCliente().equals(unCliente)) {
                ret+=this.listaVentas.get(i).getCantLitros();
            }
        }
        return ret;
    }
    
    public void guardadCosas() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
            Files.newOutputStream(Paths.get("Salida.txt")));
            out.writeObject(this);
            out.close();
        } catch (IOException e) {
            System.out.println("Error de archivo");
            System.exit(1);
        }
    }
    
    public boolean chequearNumero(String input, int minimo, int maximo) {
        boolean bool = true;
        try {
            if (Integer.parseInt(input) >= minimo && Integer.parseInt(input) <= maximo) {

                bool = true;
            }
        } catch (NumberFormatException e) {

            bool = false;
        }
        return (bool);
    }
    
    public void crearRuta(String unaCalle, double x1, double y1, double x2, double y2){
        Rutas laRuta = new Rutas(unaCalle, x1,y1,x2,y2);
        this.agregarRutas(laRuta);
    }
    
    public Rutas rutaMasCerca(Clientes unCliente){
        double la = Double.parseDouble(unCliente.getLa());
        double lg = Double.parseDouble(unCliente.getLg());
        Rutas ret = this.getListaRutas().get(0);
        double distMenor = Double.MAX_VALUE;
        for (int i = 0; i < this.getListaRutas().size(); i++) {
            double dist = this.getListaRutas().get(i).distanciaPerpendicular(lg, la);
            if(dist<distMenor){
                ret = this.getListaRutas().get(i);
                distMenor = dist;
            }
        }
        return ret;
    }

}




