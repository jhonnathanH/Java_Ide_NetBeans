/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1parcial;
import java.util.Scanner;


/**
 *
 * @author jhonnathan.henriquez
 */
public class Polinomio
{
Monomio[] p,ps; // Variables de instancia
int nro;
public Polinomio( int n ) // Constructor
{
nro = n;
p = new Monomio[nro];

}
void lecturaPolinomio( int n ) // Método para la lectura de un polinomio
{
int coef, expo;

        
Scanner entradaPol = new Scanner(System.in);
System.out.println();
for ( int k = 0; k < n ; k++)
{
System.out.println("Término Nro. " + (k+1) + "\n");
System.out.print("Introduzca el coeficiente:");
coef = entradaPol.nextInt();
System.out.print("Introduzca el exponente:");
expo = entradaPol.nextInt();
System.out.println();
p[k] = new Monomio(expo,coef);
}

System.out.println();

}



       
       
       
        
        
      
//  Método para sumar dos polinomios
    Polinomio suma( Polinomio op )
{
        this.ordenarDesc();
        op.ordenarDesc();
        
Polinomio s = new Polinomio(op.nro + nro);
//  Inicialización del arreglo que contendrá la suma de polinomios
for ( int t = 0; t < s.nro; t++)
{
            s.p[t] = new Monomio(0,0);
        }
//  Recorrido de los polinomios ordenados para generar el polinomio suma
int i = 0, j = 0, k = 0;
               
        while ( i < op.nro && j < nro )
{
            if ( op.p[i].exponente > p[j].exponente )
{
                s.p[k] = op.p[i];
i++;
            }
            else if ( op.p[i].exponente < p[j].exponente )
            {
                s.p[k] = p[j];
j++;
            }
else
{           
                s.p[k].exponente = op.p[i].exponente;
s.p[k].coeficiente = op.p[i].coeficiente + p[j].coeficiente;
i++;
j++;
            }
k++;
        }
//  Recorrido de los términos faltantes en el polinomio op
while ( i < op.nro )
{
            s.p[k] = op.p[i];
i++;
k++;
        
 }
//  Recorrido de los términos faltantes en el polinomio this
while ( j < nro )
{
            s.p[k] = p[j];
j++;
            k++;
        }
s.nro = k;
//  Eliminación de términos con coeficiente igual a cero
  for(int r=0;r<s.nro +1;r++){
     s.eliminacionTerminosCero(); 
  }

        
return s;
    }   //  Fin del método suma
    
    //  Método para restar dos polinomios
    Polinomio resta( Polinomio op )
{
        this.ordenarDesc();
        op.ordenarDesc();
        
Polinomio s = new Polinomio(op.nro + nro);
//  Inicialización del arreglo que contendrá la resta de polinomios
for ( int t = 0; t < s.nro; t++)
{
            s.p[t] = new Monomio(0,0);
        }
//  Recorrido de los polinomios ordenados para generar el polinomio resta
int i = 0, j = 0, k = 0;
               
        while ( i < op.nro && j < nro )
{
            if ( op.p[i].exponente > p[j].exponente )
{
                s.p[k] = op.p[i];
i++;
            }
            else if ( op.p[i].exponente < p[j].exponente )
            {
             s.p[k].coeficiente = -p[j].coeficiente;
            s.p[k].exponente= p[j].exponente;
j++;
            }
else
{           
                s.p[k].exponente = op.p[i].exponente;
s.p[k].coeficiente = (op.p[i].coeficiente)-(p[j].coeficiente);
i++;
j++;
            }
k++;
        }
//  Recorrido de los términos faltantes en el polinomio op
while ( i < op.nro )
{
            s.p[k] = op.p[i];
           
i++;
k++;
        
 }
//  Recorrido de los términos faltantes en el polinomio this
while ( j < nro )
{
           
         s.p[k].coeficiente = -p[j].coeficiente;
            s.p[k].exponente= p[j].exponente;
          
j++;
            k++;
        }
s.nro = k;
//  Eliminación de términos con coeficiente igual a cero
  for(int r=0;r<s.nro +1;r++){
     s.eliminacionTerminosCero(); 
  }

        
return s;
    }   //  Fin del método resta

void imprimir (String id, int n ) {
     System.out.print(  "Polinomio  "+ id +" ");
  for ( int k = 0; k < n ; k++)  {
 System.out.print( " +("+p[k].coeficiente +")x^"+p[k].exponente + " " );
    }
System.out.println("");
}

    Polinomio ordenarDesc() {
        int max, var;
       
        for ( int k=0; k < this.nro ; k++){
             max=this.p[k].exponente;
        for ( int h=1+k; h < this.nro ; h++){
         
            if(this.p[h].exponente>max){
                 max=p[h].exponente; 
                 var=p[h].coeficiente;
                p[h].exponente=p[k].exponente;
                p[h].coeficiente=p[k].coeficiente;
                
                p[k].exponente=max;
                p[k].coeficiente=var;
    }
     
}
        
        }
return this ;
}
    Polinomio ordenarAsc() {
        int min, var;
       
        for ( int k=0; k < this.nro ; k++){
             min=this.p[k].exponente;
        for ( int h=1+k; h < this.nro ; h++){
         
            if(this.p[h].exponente<min){
                 min=p[h].exponente; 
                 var=p[h].coeficiente;
                p[h].exponente=p[k].exponente;
                p[h].coeficiente=p[k].coeficiente;
                
                p[k].exponente=min;
                p[k].coeficiente=var;
    }
     
}
        
        }
return this ;
}
Polinomio eliminacionTerminosCero(){
    int a,b,c;
    b=0;
 a=this.nro;
    for ( int k=0; k < a ; k++){
        
         if(p[k].coeficiente==0){
             b++;
              for ( int h=k; h < a-1 ; h++){
             p[h].coeficiente=p[h+1].coeficiente;
             p[h].exponente=p[h+1].exponente;
        
             
                      }
              p[a-b]=null;
           
          //5   
              
    a=this.nro-1;
    this.nro=this.nro-b;
    return this ;
}
         
        
         
          
        
         
             
    
    }
    
 return this ; 
 }




Polinomio mult(Polinomio op)
{
    Polinomio s = new Polinomio(op.nro*this.nro);
    int k = 0;
    int n;
    
  
    for (int z=0;z<(op.nro*this.nro); z++){
        s.p[z] = new Monomio(0,0); 
    }
         
    
    
    for(int h=0 ; h<this.nro; h++)
    {
        for (int j=0 ; j<op.nro ; j++)
        {
            s.p[k].exponente = this.p[h].exponente + op.p[j].exponente;
            s.p[k].coeficiente = this.p[h].coeficiente*op.p[j].coeficiente;
            k++;
        }
    }    
  for(int r=0;r<s.nro +1;r++){
     s.eliminacionTerminosCero(); 
  }
    return s;
}
}

  