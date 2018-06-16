/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones;

/**
 *
 * @author jhon
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;
public class Fraccion {
  
    int num; 	// Numerador
    int den; 	// Denominador
           
    void Leer () {
     /*   
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca el numerador de la fracción:");
        num = entrada.nextInt();
        System.out.print("\nIntroduzca el denominador de la fracción:");
        den = entrada.nextInt();
        System.out.println();
        */
       String st1;
       String st2;
       
           st1 = JOptionPane.showInputDialog(
null, "Introduzca numerador", "Fraccion ", 1);
num=Integer.parseInt(st1);
 st2 = JOptionPane.showInputDialog(
null, "Introduzca denominador", "Fraccion ", 1);
den=Integer.parseInt(st2);
          
        
    }
    
    void imprimir (String id) {
        System.out.println("Fracción " + id + " -->  "+ num + "/" + den + "\n");
    }
Fraccion esMayor(Fraccion f) {
        float d1 = (float)this.num/this.den;
        float d2 = (float)f.num/f.den;
        
        if (d1 > d2) return this;
        else return f;       
    }
    
Fraccion mult(Fraccion f) {
        Fraccion result = new Fraccion();
        
        result.num = num * f.num;
        result.den = den * f.den;
        
        return result;
    }
int mcd() 
{
        
        int n1 = Math.abs(num);
        int n2 = Math.abs(den);
        
        int my = Math.max(n1, n2); // Número mayor
        int mn = Math.min(n1, n2); // Número menor
        
        int aux;
        
        do {
            aux = mn;
            mn = my % mn;
            my = aux;                      
        } while (mn != 0);
        
        return my;       
}

      Fraccion simplificar() {
        
         int maxComunDivisor = mcd();
         num /= maxComunDivisor;
         den /= maxComunDivisor;
         
         return this;
    }
      
      Fraccion sumas(Fraccion f){
       
       
        Fraccion fsuma= new Fraccion();
        
        fsuma.num= (this.num*f.den) + (this.den*f.num);
                
        fsuma.den =(this.den*f.den);
        
          return fsuma;
        
        
      }
      
        Fraccion res(Fraccion f){
       
       
        Fraccion fres= new Fraccion();
        
        fres.num= (this.num*f.den) - (this.den*f.num);
                
        fres.den =(this.den*f.den);
        
          return fres;
        
        
      }
      
       Fraccion multi(Fraccion f){
       
       
        Fraccion fmulti= new Fraccion();
        
        fmulti.num= (this.num*f.num);
                
        fmulti.den =(this.den*f.den);
        
          return fmulti;
        
        
      }
       
       Fraccion div(Fraccion f){
       
       
        Fraccion fdiv= new Fraccion();
        
        fdiv.num= (this.num*f.den);
                
        fdiv.den =(this.den*f.num);
        
          return fdiv;
       }
     /*
          void algo(){
        
        Object[] valore = {suma1};
Object seleccion= JOptionPane.showInputDialog(
null,
"Seleccione un dato", 
"Titulo", JOptionPane.INFORMATION_MESSAGE, 
null, 
valore, 
valore[0]);

      }

*/

  }
