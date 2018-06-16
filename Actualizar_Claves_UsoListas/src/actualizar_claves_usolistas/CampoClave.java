/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actualizar_claves_usolistas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CampoClave extends JTextField {
int nroCaracteres;

public CampoClave() { 
    super(2); nroCaracteres = 0; 
ControlTecla ctrlTecla = new ControlTecla();
this.setToolTipText( "Introduzca una clave" ); 
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
( (caracter < 'A') || (caracter > 'Z') ) &&
( (caracter < 'a') || (caracter > 'z') ) 
)
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
{ // Valida que la cédula no tenga más de 10 caracteres
keyEvent.consume();
nroCaracteres -= 1;
} // Fin validación de la longitud de la cédula

if ( (nroCaracteres > 0) &&
((caracter < '0') || (caracter > '9')) &&
(caracter != KeyEvent.VK_BACK_SPACE) &&
( (caracter < 'A') || (caracter > 'Z') ) &&
( (caracter < 'a') || (caracter > 'z') ) )
{
keyEvent.consume();
nroCaracteres -=1;
}
} 
// Fin verificación de caracteres a partir del tercero
}

}

} // Fin ControlTecla
 
// Fin de la clase CampoCedula