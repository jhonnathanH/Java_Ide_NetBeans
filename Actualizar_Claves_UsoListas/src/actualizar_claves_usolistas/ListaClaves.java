package actualizar_claves_usolistas;

public class ListaClaves 
{
    Nodo primero;
    
    public ListaClaves()
    {
        primero = null;
    }
    
    //  Inserta un nodo al final de la lista
    public ListaClaves insertarFinalLista(String dato)
    {
        Nodo nuevo;
        nuevo = new Nodo(dato);
        
        if (primero == null)
        {
            primero = nuevo;
        }
        else
        {
            Nodo n = primero;
            while ( n.enlace != null )
            {
                n = n.enlace;
            }
            n.enlace = nuevo;
        }
       
        return this;
    }
    
    public void imprimeLista(Nodo p)
    {
        if ( p != null )
        {
           System.out.println(p.clave);
           imprimeLista(p.enlace);
        }
    }
    
    public boolean buscar(String s)
    { 
        
        boolean a;
        a=false;
        Nodo n;
        n = new Nodo(s);
            while ( n.enlace != null )
            {
                if(s == n.clave)
                a=true;
                else
                    a=false;
            }
    return a;
    
        
    }
    
}
