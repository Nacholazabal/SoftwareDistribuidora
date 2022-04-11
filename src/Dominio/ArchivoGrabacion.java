package Dominio;

import java.io.FileNotFoundException;
import java.util.Formatter;
public class ArchivoGrabacion {
private Formatter out;
public ArchivoGrabacion(String unNombre) {
try {
out = new Formatter(unNombre);
}
catch (FileNotFoundException e) {
System.out.println("no se puede crear");
System.exit(1);
}
catch (SecurityException e) {
System.out.println("sin permisos");
System.exit(1);
}
}
public void grabarLinea(String linea) {
out.format("%s%n", linea);
}
public void cerrar() {
out.close();
}
}