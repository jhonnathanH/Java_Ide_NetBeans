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
public class Direccion extends JTextField {
int nroCaracteres;

public Direccion() { 
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
(caracter != ' ') &&
(caracter != '#') &&
(caracter != '|') &&
( (caracter < 'A') || (caracter > 'Z') ) &&
( (caracter < 'a') || (caracter > 'z') ) 
&&((caracter < '0') || (caracter > '9')) && 
(caracter != '.') )
{ // Verifica el uso de caracteres válidos.
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
if (nroCaracteres > 30)
{ // Valida que la cédula no tenga más de 30 caracteres
keyEvent.consume();
nroCaracteres -= 1;
} // Fin validación de la longitud de la direccion

if ( (nroCaracteres > 0) &&
((caracter < '0') || (caracter > '9')) &&(caracter != '-') &&
(caracter != ' ') &&
(caracter != '#') &&
(caracter != '|') &&
( (caracter < 'A') || (caracter > 'Z') ) &&
( (caracter < 'a') || (caracter > 'z') ) 
&&((caracter < '0') || (caracter > '9')) && 
(caracter != '.') &&       
(caracter != KeyEvent.VK_BACK_SPACE))
{
keyEvent.consume();
nroCaracteres -=1;
}
} 
// Fin verificación de caracteres a partir del 1er caracter
}

}

} // Fin ControlTecla
 
// Fin de la clase CampoCedula