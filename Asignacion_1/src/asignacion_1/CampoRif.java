/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion_1;

/**
 *
 * @autores   jesus martinez       CI. 18868737
 *            jhonnathan henriquez CI. 20308369
 */
    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CampoRif extends JTextField {
int nroCaracteres;

public CampoRif() { 
    super(2); nroCaracteres = 0; 
ControlTecla ctrlTecla = new ControlTecla();
this.setToolTipText( "Introduzca un número de cédula" ); 
this.addKeyListener(ctrlTecla); 
}
// Clase interna privada para manejar eventos 
//tipo KeyEvent 
private class ControlTecla implements KeyListener { // Inicio ControlTecla
public void keyPressed(KeyEvent keyEvent) {
}
public void keyReleased(KeyEvent keyEvent) {
}
public void keyTyped(KeyEvent keyEvent) {
char caracter = keyEvent.getKeyChar();
if ( ( (caracter < '0') || (caracter > '9') ) &&
(caracter != KeyEvent.VK_BACK_SPACE) &&
(caracter != '-') &&
(caracter != 'V') &&
(caracter != 'g') &&
(caracter != 'G') &&
(caracter != 'j') &&
(caracter != 'J') &&
(caracter != 'v') &&
(caracter != 'E') &&
(caracter != 'e') )
{ // Verifica el uso de caracteres válidos
keyEvent.consume();
} // Fin verificación del uso de caracteres válidos
else
{
if (caracter == KeyEvent.VK_BACK_SPACE)
{ // Verifica si se presionó la tecla de retroceso
if (nroCaracteres > 0)
nroCaracteres -= 1;
} // Fin verificación de uso de la tecla de retroceso
else
nroCaracteres +=1;
if (nroCaracteres > 12)
{ // Valida que la cédula no tenga más de 12 caracteres
keyEvent.consume();
nroCaracteres -= 1;
} // Fin validación de la longitud del RIF
if (nroCaracteres == 1)
{ // Determina si el primer caracter es V ó E o G o J
if ((caracter != 'V') && (caracter != 'v') &&
(caracter != 'E')  && (caracter != 'e') && 
(caracter != 'G')  && (caracter != 'g') && 
(caracter != 'J') && (caracter != 'j') &&
(caracter != KeyEvent.VK_BACK_SPACE))
{
                      keyEvent.consume();
nroCaracteres -=1;
                    }
                }  //   Fin evaluación del primer caracter
      else
           if ( (nroCaracteres == 2) && (caracter != '-') 
            && (caracter != KeyEvent.VK_BACK_SPACE) )
            {  // Verifica que el segundo caracter sea un guión
            keyEvent.consume();
             nroCaracteres -=1;
             }
             else
{   //  Verifica que a partir del 3er caracter hasta el 10 solo haya dígitos
      if ( (nroCaracteres > 2) && (nroCaracteres < 11) &&
       ((caracter < '0') || (caracter > '9')) &&
       (caracter != KeyEvent.VK_BACK_SPACE) )
        {
          keyEvent.consume();
           nroCaracteres -=1;
           }
           else
            if ( (nroCaracteres == 11) && (caracter != '-') 
              && (caracter != KeyEvent.VK_BACK_SPACE) )
            {  // Verifica que el decimo caracter caracter sea un guión
             keyEvent.consume();
             nroCaracteres -=1;
             }
             else
               if ( (nroCaracteres == 12)&&
                ((caracter < '0') || (caracter > '9')) &&
                (caracter != KeyEvent.VK_BACK_SPACE)  )
              {// Verifica que el ultimo caracter caracter sea un numero
               keyEvent.consume();
               nroCaracteres -=1;
               }
            
        }   //  Fin verificación de caracteres a partir del tercero
        } 
        }
              
    } // Fin ControlTecla
}  // Fin de la clase CampoRiF