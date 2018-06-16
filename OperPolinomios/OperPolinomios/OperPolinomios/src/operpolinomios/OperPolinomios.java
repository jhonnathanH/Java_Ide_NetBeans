/**
 *
 *Frank Fung CI:20082306
 * 
 * Nota: Profesora Mayela, lo unico que no pude lograr en el proyecto,fue que 
 * cuando ejecuto la operacion del segundo polinomio, ella no me da el valor esperado
 * pero en el primero si
 */
package operpolinomios;
import java.io.*;
public class OperPolinomios {

public static void main(String[] args) throws FileNotFoundException {
    // Coloque el nombre de su archivo y la correspondiente ubicación
    LeerArchivo parser = new LeerArchivo("C:\\Users\\Jhonnnathan\\Desktop\\app\\DatosPolinomios.txt");
    //    Lee el número de operaciones a realizar
    String nroOperStr = parser.leeCadaLinea();
    //   Convierte el string que contiene el número de operaciones a un número entero
    int nroOperaciones = Integer.parseInt(nroOperStr);
    System.out.println("Número de Operaciones a realizar: " + nroOperaciones);
    for (int i= 1; i <= nroOperaciones; i++)
       {Lista P1 = new Lista();
        Lista P2 = new Lista();
        Lista Resultado=new Lista();
        DatosArchivo archNombre=new DatosArchivo("C:\\Users\\Jhonnnathan\\Desktop\\app\\pruebaArchivo2.txt");
        //   Lee el primer polinomio
        String polinomio1 = parser.leeCadaLinea();
        //   Lee el segundo polinomio coloque el código correspondiente
        String polinomio2 = parser.leeCadaLinea();           
        //   Lee el tipo de operación a realizar
        String tipoOperStr = parser.leeCadaLinea();
        //   Convierte el string que contiene el tipo de operación a un número entero.
        //   El tipo de operación es 1 (Suma), 2 (Resta) y 3 (Multiplicación).
        int tipoOper = Integer.parseInt(tipoOperStr);
        //   Lectura de la línea que contiene el primer polinomio
        parser.leeLinea(polinomio1, P1);         
        //   Lectura de la línea que contiene el segundo polinomio
        parser.leeLinea(polinomio2, P2);     
        // Listar ambos polinomios
        System.out.println("\nElementos del polinomio");
        archNombre.escribelinea(P1.visualizarRecursivo(P1.primero));
        archNombre.escribelinea(P2.visualizarRecursivo(P2.primero));
        //  Efectuar la operación indicada colocando el resultado en una lista simple enlazada
        
        if(tipoOper==1){
                while(P1.primero!=null && P2.primero!=null){
            if (P1.primero.exponente==P2.primero.exponente){
                Resultado.insertarNodoLista(P1.primero.coeficiente+P2.primero.coeficiente,P1.primero.exponente);
                P1.primero=P1.primero.enlace;
                P2.primero=P2.primero.enlace;
                }
            else if (P1.primero.exponente<P2.primero.exponente  || P1.primero!=null){
                Resultado.insertarNodoLista(P2.primero.coeficiente,P2.primero.exponente);
                P2.primero=P2.primero.enlace;
                }
            else{
                Resultado.insertarNodoLista(P1.primero.coeficiente,P1.primero.exponente);
                P1.primero=P1.primero.enlace;
                }
            }
        }
        else if(tipoOper==2){
                while(P1.primero!=null&& P2.primero!=null){
            if (P1.primero.exponente==P2.primero.exponente){
                Resultado.insertarNodoLista(P1.primero.coeficiente-P2.primero.coeficiente,P1.primero.exponente);
                P1.primero=P1.primero.enlace;
                P2.primero=P2.primero.enlace;
                }
            else if (P1.primero.exponente<P2.primero.exponente  || P1.primero!=null){
                Resultado.insertarNodoLista(P2.primero.coeficiente,P2.primero.exponente);
                P2.primero=P2.primero.enlace;
                }
            else{
                Resultado.insertarNodoLista(P1.primero.coeficiente,P1.primero.exponente);
                P1.primero=P1.primero.enlace;
                }               
            }
        }
        else{
                while(P1.primero!=null&& P2.primero!=null){
            if (P1.primero.exponente==P2.primero.exponente){
                Resultado.insertarNodoLista(P1.primero.coeficiente*P2.primero.coeficiente,P1.primero.exponente);
                P1.primero=P1.primero.enlace;
                P2.primero=P2.primero.enlace;
                }
            else if (P1.primero.exponente<P2.primero.exponente  || P1.primero!=null){
                Resultado.insertarNodoLista(P2.primero.coeficiente,P2.primero.exponente);
                P2.primero=P2.primero.enlace;
                }
            else{
                Resultado.insertarNodoLista(P1.primero.coeficiente,P1.primero.exponente);
                P1.primero=P1.primero.enlace;
                }
            }           
        }
        archNombre.escribelinea(Resultado.visualizarRecursivo(Resultado.primero));      
        archNombre.cerrarArchivo();
       }
    }
}
