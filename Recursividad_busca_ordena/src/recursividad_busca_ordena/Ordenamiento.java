/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad_busca_ordena;

/**
 *
 * @author aalmarza
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        String v[] = new String[n];
        generar(v);
        System.out.println("\nVector de objetos String\n");
        escribir(v);
        int b = busquedaSec(v, v[3]);
        System.out.println("encontrado en " + b);
        ordenar(v);
        System.out.println("\nVector ordenado\n");
        escribir(v);

    }

    public static void generar(String v[]) {
        int x;
        for (int i = 0; i < v.length; i++) {
            x = (int) (Math.random() * 10) + 1;
            v[i] = new String("A-" + x);
        }
    }

    public static void generar(int v[], int a, int b) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (b - a + 1)) + a;
        }
    }

    public static void escribir(String v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("[" + i + "]= " + v[i]);
        }
    }

    public static void escribir(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("[" + i + "]= " + v[i]);
        }
    }

    public static int busquedaSec(String v[], String valor) {
        int p = -1;
        for (int i = 0; i < v.length && p == -1; i++) {
            if (v[i].equals(valor)) {
                p = i;
            }
        }
        return p;
    }

    public static int indMenor(String v[], int i) {
        String menor = v[i];
        int ind = i;

        for (int j = i + 1; j < v.length; j++) {
            if (v[j].compareTo(menor) < 0) {
                menor = v[j];
                ind = j;
            }
        }
        return ind;
    }

    public static int indMenor(int v[], int i) {
        int menor = v[i];
        int ind = i;
        for (int j = i + 1; j < v.length; j++) {
            if (v[j] < menor) {
                menor = v[j];
                ind = j;
            }
        }
        return ind;
    }

    public static void intercambiar(String x, String y) {
        String aux = x;
        x = y;
        y = aux;
    }

    public static void ordenar(String v[]) {
        int ind;
        for (int i = 0; i < v.length - 1; i++) {
            ind = indMenor(v, i);
            String aux = v[i];
            v[i] = v[ind];
            v[ind] = aux;
        }

    }

    public static void ordenar(int v[]) {
        int ind;
        for (int i = 0; i < v.length - 1; i++) {
            ind = indMenor(v, i);
            int aux = v[i];
            v[i] = v[ind];
            v[ind] = aux;
        }
    }
}

