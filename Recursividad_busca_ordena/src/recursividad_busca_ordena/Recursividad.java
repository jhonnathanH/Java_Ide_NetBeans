/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad_busca_ordena;

/**
 *
 * @author aalmarza
 */
public class Recursividad {

    /** calcula factorial usando recursividad directa*/
    public static double fact(int n) {
        double f;
        if (n == 0) {
            f = 1;
        } else {
            f = (n * fact(n - 1));
        }
        return f;
    }

    /** calcula fibonacci usando recursividad directa */
    static double fibo(int n) {
        double f;
        if ((n == 1) || (n == 2)) {
            f = 1;
        } else {
            f = fibo(n - 2) + fibo(n - 1);
        }
        return f;

    }

    /**Determina si un numero es par o impar usando recursividad indirecta */
    static boolean par(int n) {
        if (n == 0) {
            return true;
        } else {
            return impar(n - 1);
        }
    }

    static boolean impar(int n) {
        if (n == 0) {
            return false;	// no es par

        } else {
            return par(n - 1);
        }
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

    /* Ordenamiento por el metodo de quickSort
     * Complejidad O(n*log2n) 
     */
    static void quickSort(long v[], int primero, int ultimo) {

        int i, j, central;
        long pivote;
        central = (primero + ultimo) / 2;
        pivote = v[central];
        i = primero;
        j = ultimo;
        do {
            while (v[i] < pivote) {
                i++;
            }
            while (v[j] > pivote) {
                j--;
            }
            if (i <= j) {
                long temp;
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;   // intercambia v[i] con v[j]
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j) {
            quickSort(v, primero, j);
        }
        if (ultimo > i) {
            quickSort(v, i, ultimo);
        }
    }

    /* Probando y visualizando el funcionamiento de  métodos recursivos
     */
    public static void main(String args[]) {
        System.out.println("Factorial");
        for (int i = 0; i < 5; i++) {
            System.out.println("factorial (" + i + ") : " + fact(i));
        }

        System.out.println("\nºnFibonacci");
        for (int i = 1; i < 5; i++) {
            System.out.println("fibonacci (" + i + ") : " + fibo(i));
        }

        System.out.println("\n\nPar-Impar");
        String c;
        for (int i = 0; i < 5; i++) {
            if (par(i)) {
                c = new String("Par");
            } else {
                c = new String("Impar");
            }
            System.out.println(i + " : " + c);
        }

        System.out.println("\n\nBusqueda binaria");

        int v[] = new int[10];
        for (int i = 0; i < 10; i++) {
            v[i] = i; // Crea un arreglo ordenado de menor a mayor

        }
        int clave;
        for (int i = 0; i < 5; i++) {
            clave = (int) (Math.random() * 15);          // genera una clave a buscar en v

            System.out.println(clave + " posicion: " + busquedaBinR(v, 0, 9, clave));
        }

        System.out.println("\n\nOrdenamiento por quickSort");
        int n = 10;
        long x[] = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = (int) (Math.random() * 30); //Arreglo generado aleatoriamente

        }
        System.out.println(" Antes de ordenar \n");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + "\t");
        }
        quickSort(x, 0, n - 1);

        System.out.println("\n\nDespues de ordenar \n");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println("");

    }
}
