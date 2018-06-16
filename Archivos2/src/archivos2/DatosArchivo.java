/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos2;
import java.io.*;
public class DatosArchivo {
FileWriter archSalida; 
BufferedWriter pw;
public DatosArchivo (String archivo)
{
try
{
archSalida = new FileWriter(archivo, true);
pw = new BufferedWriter(archSalida);
}
catch (Exception e) {
e.printStackTrace(); }
}
void escribeLinea (String linea)
{ try { pw.write(linea); pw.newLine(); }
catch (Exception e) {
e.printStackTrace(); }
}
void cerrarArchivo()
{ try { pw.close(); }
catch (Exception e) {
e.printStackTrace(); }
}
}