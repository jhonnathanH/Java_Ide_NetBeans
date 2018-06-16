/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos1;
import java.io.*;
import java.util.Scanner;
public class Lectura {
 
   public void cargarArchivo() {
       abrir();
   }
 
  private void abrir() {
  //ruta del archivo en el pc
  String file = new String("C:\\Users\\Jhonnnathan\\AppData\\Roaming\\Microsoft\\Plantillas\\Títulodelartículo.docx"); 
  String file2 = new String("C:\\Users\\Jhonnnathan\\AppData\\Roaming\\Microsoft\\Plantillas\\Títulodelartículo2.docx");
  String file3 = new String("C:\\Users\\Jhonnnathan\\AppData\\Roaming\\Microsoft\\Plantillas\\Títulodelartículo3.docx");
  String file4 = new String("C:\\Users\\Jhonnnathan\\AppData\\Roaming\\Microsoft\\Plantillas\\Títulodelartículo4.docx");

 try{ 
   //definiendo la ruta en la propiedad file
   Runtime.getRuntime().exec("cmd /c start "+file+file2+file3+file4);
     
   }catch(IOException e){
      e.printStackTrace();
   } 
  }
}