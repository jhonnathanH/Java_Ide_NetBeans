/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recursividad_busca_ordena;

/**
 *
 * @author vmarch
 */
public class Busqueda {

    /**
     * Busqueda secuencial
     */
    public static int secuencial( int v[], int valor){
        int p = -1;
        for (int i = 0; i < v.length && p == -1; i++) {
            if (v[i] == valor)
                p = i;
            
        }
        return p;
    }
    
    /**
     * Busqueda binaria iterativa
     */
    public static int binaria( int v[], int valor){
        int inf = 0;
        int sup = v.length - 1;
        int centro = (inf + sup) / 2;
        while (inf <= sup && v[centro] != valor){
            if (v[centro]< valor)
                inf = centro + 1;
            else
                sup = centro - 1;
            centro = (inf + sup) / 2 ;
        }
        return (v[centro] == valor) ? centro : -1;
    }
    
    /* Busqueda binaria recursiva
     * Complejidad O(log2n)
     */
    static int busquedaBinR(int v[], int inferior, int superior, int clave) {
        int central;
        if (inferior > superior) {
            return -1;
        } else {
            central = (inferior + superior) / 2;
            if (v[central] == clave) {
                return central;
            } else if (clave < v[central]) {
                return busquedaBinR(v, inferior, central - 1, clave);
            } else {
                return busquedaBinR(v, central + 1, superior, clave);
            }
        }
    }
    
}
