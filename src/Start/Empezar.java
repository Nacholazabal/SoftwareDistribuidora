package Start;
import Dominio.*;
import Interfaz.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Empezar {
    public static void main (String[] args){
        SistemaBeta Sistema = new SistemaBeta();
        Menu ventanamenu = new Menu(Sistema);
        ventanamenu.setVisible(true);
    }
}
