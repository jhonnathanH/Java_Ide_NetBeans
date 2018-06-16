/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones;

/**
 *
 * @author jhon
 */


        
public class Fracciones {
public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion ();
        Fraccion f2 = new Fraccion ();
    
    f1.Leer (); // Lectura fracción 1
    f1.imprimir ("1");
            
 
    f2.Leer(); // Lectura fraccion 2
    f2.imprimir ("2");
    
    Fraccion fMayor= new Fraccion ();
    fMayor = f1.esMayor(f2); // Determina la fracción mayor
    fMayor.imprimir("Mayor");
        

    
    f1 = f1.simplificar (); // Simplifica la fracción 1
    f2 = f2.simplificar ();
    
    Fraccion ft= new Fraccion ();
    ft=f1.sumas(f2);
    ft.imprimir("suma de las 2 fracciones");
    
    Fraccion ft0= new Fraccion ();
    ft0=f1.res(f2);
    ft0.imprimir("resta de las 2 fracciones");
    
 
    Fraccion ft1= new Fraccion ();
    ft1=f1.multi(f2);
    ft1.imprimir("Multiplicacion de las 2 fracciones");
    
      Fraccion ft12= new Fraccion ();
    ft12=f1.div(f2);
    ft12.imprimir("division de f1/f2 ");
    
    
       
    f1.imprimir("1 simplificada");
    f2.imprimir("2 simplificada");
    
    
   
    }
}




