package Start;
import Dominio.*;
import Interfaz.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Empezar {
    public static void main (String[] args){
        SistemaBeta Sistema = new SistemaBeta();
        try {
            ObjectInputStream in = new
            ObjectInputStream(
            Files.newInputStream(Paths.get("Salida.txt")));
            Sistema =(SistemaBeta)in.readObject();
            in.close();
             
        } catch (IOException e) {
            System.out.println("Error de recuperación");
            Sistema=new SistemaBeta();
        } 
       catch(ClassNotFoundException e){
       
             System.out.println("Error de recuperación");
            Sistema=new SistemaBeta();
            System.exit(1);
       }
        Menu ventanamenu = new Menu(Sistema);
        ventanamenu.setVisible(true);
    }
}
