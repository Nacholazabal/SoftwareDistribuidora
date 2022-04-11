package Dominio;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
public class ArchivoLectura {
    
    private String linea;
    private Scanner in;
    
    public ArchivoLectura(String nomArchivo){
    
        try{
        
           in=  new Scanner(Paths.get(nomArchivo)); 
        }
        catch(IOException e){
        
            System.out.println("Error");
            System.exit(1);
        }
    }    
    public boolean hayMasLineas(){
    
        boolean hay=false;
        linea=null;
        if(in.hasNext()){
        
            linea=in.nextLine();
            hay=true;
        }
        return(hay);
    }
    public String line(){
    
        return(linea);
    }
    public void cerrar() {
    in.close();
    }

}
