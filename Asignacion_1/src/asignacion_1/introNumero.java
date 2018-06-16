/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * @autores   jesus martinez       CI. 18868737
 *            jhonnathan henriquez CI. 20308369
*/

public class introNumero extends JTextField {
int nroCaracteres;

public introNumero() { 
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
(caracter != '+') )
{ // Verifica el uso de caracteres válidos
keyEvent.consume();

} // Fin verificación del uso de caracteres válidos
else
{
if (caracter == KeyEvent.VK_BACK_SPACE)
{ // Verifica si se presionó la tecla de retroceso
if (nroCaracteres > 0)
nroCaracteres -= 1;
} // Fin verificación de uso de la tecla de retroceso.
else
nroCaracteres +=1;
if (nroCaracteres > 7)
{ // Valida que la cédula no tenga más de 7 caracteres
keyEvent.consume();
nroCaracteres -= 1;
} // Fin validación de la longitud del numero
if (nroCaracteres == 1)
{ // Determina si el primer caracter es + ó -
if ((caracter != '+') && (caracter != '-') && 
(caracter != KeyEvent.VK_BACK_SPACE))
{

keyEvent.consume();
nroCaracteres -=1;


}

} // Fin evaluación del primer caracter
else
if ( (nroCaracteres == 1) && (caracter < '0') || (caracter > '9')
&& (caracter != KeyEvent.VK_BACK_SPACE) )
{ // Ve
keyEvent.consume();
nroCaracteres -=1;
}
else
{ // Verifica que a partir de 2 solo haya dígitos
if ( (nroCaracteres > 1) &&
((caracter < '0') || (caracter > '9')) &&
(caracter != KeyEvent.VK_BACK_SPACE) )
{
keyEvent.consume();
nroCaracteres -=1;
}
} 
// Fin verificación 
}

}

} // Fin ControlTecla
} 
// Fin de la clase introNumero