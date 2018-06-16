package operpolinomios;
import java.io.*;
import java.util.Scanner;
public class LeerArchivo {
    File archLect;
Scanner scanner1;
Scanner scanner2;
public LeerArchivo (String archivo) throws FileNotFoundException 
{
        archLect = new File(archivo); 
if ( !archLect.exists() )
{
            try 
{ 
                archLect.createNewFile();   
            }
catch (Exception e) 
{
e.printStackTrace(); 
           }
     }
        scanner1 = new Scanner(new FileReader(archLect));
    }
public String leeCadaLinea()
{
        try 
{
            //    Utiliza un objeto scanner para leer una linea completa
String linea = scanner1.nextLine();
return linea;
        }
catch (Exception e) 
{
            e.printStackTrace();
return null;
        }
    }    
public void leeLinea(String archLinea, Lista l)
    {
        //  Utiliza un segundo Scanner para analizar el contenido de una linea
//  del archivo    
scanner2 = new Scanner(archLinea);
//  Establece el delimitador de los datos
scanner2.useDelimiter(",");
while ( scanner2.hasNext() )
{
            int coeficiente = scanner2.nextInt();
            int exponente = scanner2.nextInt();
      
            //    Inserta un nodo en la lista
        // Introduzca el código correspondiente
l.insertarNodoLista(coeficiente, exponente);
        }
    }

}
