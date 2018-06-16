/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recursividad_busca_ordena;

/**
 *
 * @author aalmarza
 */
public class Complejidad {

    public static void main(String[] args) {
        // TODO code application logic here
        final int N = 100;
        int pos;
        int v[] = new int[N];
        int clave = aleatorio(100,500);
        generar(v,100,500);
        
        long t1 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            pos = Busqueda.secuencial(v, clave);
        long t2 = System.currentTimeMillis();
        System.out.println("Duracion Busqueda Secuencial:" + (t2 - t1) / 10000.00);
        
        
        Ordenamiento.ordenar(v);
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            pos = Busqueda.binaria(v, clave);
        t2 = System.currentTimeMillis();
        System.out.println("Duracion Busqueda Binaria:" + (t2 - t1) / 10000.00);
        
        
        t1 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            pos = Busqueda.busquedaBinR(v , 0, v.length-1, clave );
        t2 = System.currentTimeMillis();
        System.out.println("Duracion Busqueda BinariaRec:" + (t2 - t1) / 10000.00);
        
    }
    
    public static int aleatorio(int a, int b){
        return (int) (Math.random()*(b-a+1) + a);
    }
    
    public static void generar(int v[], int a, int b){
        for(int i = 0; i < v.length; i++)
            v[i] = aleatorio(a,b);
    }
}
