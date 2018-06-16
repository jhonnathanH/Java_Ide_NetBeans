/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CampoEdad extends JTextField {
int nroCaracteres;
public CampoEdad()
{
super();
nroCaracteres = 0;
ControlTecla ctrlTecla = new ControlTecla();
this.setToolTipText( "Introduzca el valor correspondiente a la edad" );
this.addKeyListener(ctrlTecla);
}
public void inicializar()
{
nroCaracteres = 0;
setText(null);
}
// Clase interna privada para manejar eventos tipo KeyEvent
private class ControlTecla implements KeyListener { // Inicio ControlTecla
public void keyPressed(KeyEvent keyEvent) { }
public void keyReleased(KeyEvent keyEvent) { }
public void keyTyped(KeyEvent keyEvent) {
char caracter = keyEvent.getKeyChar();
if ( ( (caracter < '0') || (caracter > '9') ) &&
(caracter != KeyEvent.VK_BACK_SPACE) )
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
if (nroCaracteres > 3)
{ // Valida que la edad no tenga más de 3 caracteres
keyEvent.consume();
nroCaracteres -= 1;
} // Fin validación de la longitud de la cédula
}
}
} // Fin ControlTecla
}