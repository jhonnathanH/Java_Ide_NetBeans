package actualizar_claves_usolistas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LecturaArchivo 
{
    File archLect;
    
    public LecturaArchivo (String archivo)
    {
        archLect = new File(archivo); 
    }
    
    public ListaClaves leeClaves() throws FileNotFoundException 
    {
        ListaClaves l = new ListaClaves();
        Scanner scanner = new Scanner(new FileReader(archLect));
        String clave;
    
        try 
        {   //  Utiliza un objeto scanner para leer una linea completa
            while ( scanner.hasNextLine() )
            {
                clave = scanner.nextLine();
                l.insertarFinalLista(clave);
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally 
        {   //   Instrucciones que se ejecutan después del try o catch
          scanner.close();
          return l;
        }
    }
    
    
    
    
    
}
