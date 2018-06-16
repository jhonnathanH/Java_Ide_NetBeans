/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1parcial;
import java.util.Scanner;
/**
 *
 * @author jhonnathan henriquez
 * Ci 20308369
 * seccion de las 10.30am
 * computacion avanzada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int VALOR, ord,n1,n2,m;
       
       //  grado de los polinomio se piden al usuario
        Scanner entradaPol = new Scanner(System.in);
     System.out.print("grado del polinomio 1: ");
     n1 = entradaPol.nextInt();
      System.out.print("grado del polinomio 2: ");
     n2 = entradaPol.nextInt();
     
     
     
        Polinomio f1 = new Polinomio (n1);
        Polinomio f2 = new Polinomio (n2);
   
    // dimensiones de los polinomio debes ser enteros
    f1.lecturaPolinomio (f1.nro); // Lectura de los 2 polinomios
    f2.lecturaPolinomio (f2.nro);
    
     f1.imprimir("p1 ",f1.nro);
     f2.imprimir("p2 ",f2.nro);
   // ciclo donde el usurario elije operacion y fomra de verlo
     do{
         
    
     System.out.print("OPERACION A REALIZAR 0:SUMA 1: RESTA 2:MULTIPLICACION  ");
     VALOR = entradaPol.nextInt();
      System.out.print("vista Descendente:0 vista Ascendente:1  ");
      ord= entradaPol.nextInt();
      System.out.println("\n");
      
      // se mostrara la suma
      if(VALOR==0){
            Polinomio fs = new Polinomio (f1.nro+f2.nro);
       fs=f1.suma(f2);
       if(ord==0){
          fs= fs.ordenarDesc();
          fs.imprimir(" suma de (p1 + p2)= ",fs.nro); 
       }
       if(ord==1){
          fs= fs.ordenarAsc();
          fs.imprimir("suma de (p1 + p2)=",fs.nro); 
       }
       
      }
     // se mostrara la resta
         if(VALOR==1){
            Polinomio fr = new Polinomio (f1.nro+f2.nro);
       fr=f2.resta(f1);
   
       if(ord==0){
          fr= fr.ordenarDesc();
          fr.imprimir("resta de (p1 - p2)=",fr.nro); 
       }
       if(ord==1){
          fr= fr.ordenarAsc();
          fr.imprimir("resta de (p1 - p2)= ",fr.nro); 
       }
       
      }
     
     
     // se mostrara la multiplicion.
if(VALOR==2){
            Polinomio fm = new Polinomio (f1.nro*f2.nro);
       fm=f1.mult(f2);
       if(ord==0){
          fm= fm.ordenarDesc();
          fm.imprimir(" suma de p1 + p2",fm.nro); 
       }
       if(ord==1){
          fm= fm.ordenarAsc();
          fm.imprimir(" suma de p1 + p2",fm.nro); 
       }
       
      }
System.out.print("desea hacer otra operacion con p1 y p2 "+ "\n");
System.out.print("0: para SI   1: para NO  "); 
      m= entradaPol.nextInt();
     
    }while(m== 0);
         
         
    }
}
