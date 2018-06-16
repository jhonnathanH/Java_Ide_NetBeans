package operpolinomios;
public class Lista {
    public Nodo primero;    //  Referencia al primer nodo
        String k="";
    //  Constructor
    public Lista()
{
        primero = null;
    }
//  Inserta un nodo en la lista
public Lista insertarNodoLista(int c, int e)
{
    Nodo nuevo;
    nuevo = new Nodo(c,e);
    if (primero == null)
        primero = nuevo;
    else 
        {        
        Nodo a,n;
        a = n = primero;
        while (n != null)
            {
            a = n;
            n = n.enlace;
            }
            a.enlace = nuevo;
        }
        return this;
    }    
//  Recorre una lista y muestra el contenido de sus elementos en forma recursiva
public String visualizarRecursivo (Nodo n){
    
    if(n!=null){
        System.out.print(n.coeficiente+"x^"+ n.exponente);
        k+=String.valueOf(n.coeficiente+"x^"+ n.exponente);
        if (n.exponente>0 && n.enlace!=null){
            System.out.print("+");
            k+=String.valueOf("+");
        }
        else
        System.out.println("");
        n = n.enlace;
        visualizarRecursivo(n);
        }
        return k;
    }
}