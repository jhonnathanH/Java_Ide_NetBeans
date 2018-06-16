package actualizar_claves_usolistas;

import java.io.FileNotFoundException;
import javax.swing.JFrame;
public class Actualizar_Claves_UsoListas {

    public static void main(String[] args) throws FileNotFoundException 
    {
            ListaClaves listaActual = new ListaClaves();
            LecturaArchivo parser = new LecturaArchivo("U:\\Claves.txt");
        
            
            //  Carga las claves utilizadas por un usuario en una lista
            listaActual = parser.leeClaves();
             Ventana a = new Ventana(listaActual); a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //  Imprime la lista en la cónsola
            listaActual.imprimeLista(listaActual.primero);
            
            //  Utilizar una clase Ventana para solicitar una nueva clave, la cual
            //  solo puede tener letras (mayúsculas o minúsculas) y números.
            //  Una clave para ser válida debe tener, al menos 6 caracteres y
            //  máximo 12 caracteres. Desarrolle una clase CampoClave para asegurar
            //  que el campo de entrada cumple con los requisitos planteados.
            //  Las claves no pueden repetirse.
    }
}
