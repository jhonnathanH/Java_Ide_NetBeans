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
public class introNumeroReal extends JTextField {
int nroCaracteres;

public introNumeroReal () { 
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
(caracter != '+') &&
(caracter != '.') )
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
if (nroCaracteres > 16)
{ // Valida que la cédula no tenga más de 16 caracteres
keyEvent.consume();
nroCaracteres -= 1;
} // Fin validación de la longitud 
if (nroCaracteres == 1)
{ // Determina si el primer caracter es + o -
if ((caracter != '+') && (caracter != '-') &&
(caracter != KeyEvent.VK_BACK_SPACE))
{
keyEvent.consume();
nroCaracteres -=1;
}
} // Fin evaluación del primer caracter
else
if ( (nroCaracteres > 1) && (nroCaracteres < 10) &&
        (caracter != '.')&&
       ((caracter < '0') || (caracter > '9')) &&
    
       (caracter != KeyEvent.VK_BACK_SPACE) )
{ // 
keyEvent.consume();
nroCaracteres -=1;

   //   De
   if ((caracter != '.') &&(caracter != KeyEvent.VK_BACK_SPACE))
      {
        keyEvent.consume();
 nroCaracteres =10;
        }
           //   Fin evaluación del primer caracter
   
/*
int n;


if ((caracter != '.') 
   && (caracter != KeyEvent.VK_BACK_SPACE) )
    {  // Verifica que el segundo caracter sea un guión
        keyEvent.consume();
        nroCaracteres -=1;
n=nroCaracteres;
   
   if ( (nroCaracteres > n ) && (nroCaracteres < n+5)&&
           ((caracter < '0') || (caracter > '9')) && 
              (caracter != KeyEvent.VK_BACK_SPACE) )
             {
                
               keyEvent.consume();
               nroCaracteres -=1;
                        }
     }
   */  
}

else 
    
   

      
 if (nroCaracteres == 10) 
 {  //   Determina si el caracter es .
   if ((caracter != '.') &&(caracter != KeyEvent.VK_BACK_SPACE))
      {
        keyEvent.consume();
        nroCaracteres -=1;
        }
         }  //   Fin evaluación del primer caracter
        if ( (nroCaracteres > 10) && (nroCaracteres < 17)&&
           ((caracter < '0') || (caracter > '9')) && 
              (caracter != KeyEvent.VK_BACK_SPACE) )
             {
               keyEvent.consume();
               nroCaracteres -=1;
                        }
        
// Fin verificación d
}

}

} // Fin ControlTecla
} 
// Fin de la clase CampoCedula