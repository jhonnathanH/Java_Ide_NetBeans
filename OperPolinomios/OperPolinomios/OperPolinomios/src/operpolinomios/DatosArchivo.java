package operpolinomios;

import java.io.*;
public class DatosArchivo {
FileWriter archSalida; BufferedWriter pw;
public DatosArchivo (String archivo){
try{
archSalida = new FileWriter(archivo, true);
pw = new BufferedWriter(archSalida);
}
catch (Exception e) {
e.printStackTrace(); }
}
void escribelinea (String linea){ 
    try {pw.write(linea); 
    pw.newLine();}
catch (Exception e) {
e.printStackTrace(); }
}
void cerrarArchivo(){ 
    try { pw.close();} 
catch (Exception e) {e.printStackTrace(); }
}
}