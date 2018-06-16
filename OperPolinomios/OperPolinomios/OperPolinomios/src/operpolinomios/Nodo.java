package operpolinomios;

public class Nodo {
    //  Un objeto nodo contiene el valor de un coeficiente y el del exponente
//  de un término
int coeficiente, exponente;
Nodo enlace;
//  Constructor
public Nodo (int  c, int  e)
        {
            coeficiente = c;
            exponente = e;
            enlace = null; 
        }
}
