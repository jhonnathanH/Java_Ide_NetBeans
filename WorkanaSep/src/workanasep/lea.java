/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workanasep;

import java.io.FileNotFoundException;
import java.io.*;

/**
 *
 * @author Jhonnnathan
 */
public class lea {
    
 

    public lea(variables contadoress) throws FileNotFoundException, IOException {
        
        String archivo="..\\WorkanaSep\\src\\workanasep\\acumula.txt";
        FileReader fr = new FileReader(archivo);
BufferedReader bf = new BufferedReader(fr);
        String sCadena;
while ((sCadena = bf.readLine())!=null) {
   
 
         String[] valor;
         valor = sCadena.split(",");
         int c1,c2,c3,c4;
         c1= Integer.parseInt(valor[0]);
         c2= Integer.parseInt(valor[1]);
         c3= Integer.parseInt(valor[2]);
         c4= Integer.parseInt(valor[3]);
          
            
      contadoress.setCont1(c1);
      contadoress.setCont2(c2);
      contadoress.setCont3(c3);
      contadoress.setCont4(c4);
         
System.out.println( c1 + " algo");
}
    }

    lea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
       
 
        
        
    
            

