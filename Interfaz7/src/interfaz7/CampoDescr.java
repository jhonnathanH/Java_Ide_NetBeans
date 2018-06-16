package interfaz7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CampoDescr extends JTextField {
    
int nroCaracteres;

public CampoDescr()
{
        super(2);
nroCaracteres = 0;
ControlTecla ctrlTecla = new ControlTecla();
this.setToolTipText( "Introduzca una descripción" );
this.addKeyListener(ctrlTecla);
    }
// Clase interna privada para manejar eventos tipo KeyEvent
private class ControlTecla implements KeyListener {      // Inicio ControlTecla
        
public void keyPressed(KeyEvent keyEvent) {
}
public void keyReleased(KeyEvent keyEvent) {
} 
public void keyTyped(KeyEvent keyEvent) {
            char caracter = keyEvent.getKeyChar();
                      
            if ( ( (caracter < 'A') || (caracter > 'Z') ) &&
                    ( (caracter < 'a') || (caracter > 'z') ) 
                    &&((caracter < '0') || (caracter > '9')) && 
                    (caracter > ' ') &&
                   (caracter != KeyEvent.VK_BACK_SPACE) )
            {  //  Verifica el uso de caracteres válidos
                        keyEvent.consume();
            }  // Fin verificación del uso de caracteres válidos
            else
            { 
                if (caracter == KeyEvent.VK_BACK_SPACE)  
                {  //  Verifica si se presionó la tecla de retroceso                 
                    if (nroCaracteres > 0)
                        nroCaracteres -= 1;
                }  //  Fin verificación de uso de la tecla de retroceso
                else
                    nroCaracteres +=1;
           
                if (nroCaracteres > 30)
{  // Valida que la cédula no tenga más de 10 caracteres
                    keyEvent.consume();
                    nroCaracteres -= 1;
                }  // Fin validación de la longitud de la cédula
                    
                     //  Verifica que a partir del 3er caracter solo haya dígitos
                        if ( (nroCaracteres > 0) && 
                             ((caracter < '0') || (caracter > '9')) && 
                                ( (caracter < 'A') || (caracter > 'Z') ) &&
                                ( (caracter < 'a') || (caracter > 'z') ) &&
                                (caracter > ' ') &&
                                (caracter != KeyEvent.VK_BACK_SPACE) )
                        {
                            keyEvent.consume();
                            nroCaracteres -=1;
                        }
                      //  Fin verificación de caracteres a partir del tercero
            } 
        }
              
    } // Fin ControlTecla
}  // Fin de la clase CampoCedula

