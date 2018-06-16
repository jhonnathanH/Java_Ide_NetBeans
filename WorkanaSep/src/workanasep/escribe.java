/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workanasep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jhonnnathan
 */
public class escribe {
    
       
    public escribe(variables d) throws IOException{
        String sFichero = "..\\WorkanaSep\\src\\workanasep\\acumula.txt";
File fichero = new File(sFichero);
 
if (fichero.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero))) {
                bw.write(d.getCont1()+ "," + d.getCont2()+ "," + d.getCont3()+ "," +d.getCont4());
                bw.close();
            }
}
        
}
}

