
package camposdetextosespeciales;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Campo4 extends JPasswordField {
int nroCaracteres;
public Campo4() { 
    super(2);
    nroCaracteres = 0; 
    Campo4.ControlTecla ctrlTecla = new Campo4.ControlTecla(); 
    this.setToolTipText( "Introduzca su contraseña" );
    this.addKeyListener(ctrlTecla); }
// Clase interna privada para manejar eventos tipo KeyEvent 
private class ControlTecla implements KeyListener {
    // Inicio ControlTecla
    public void keyPressed(KeyEvent keyEvent) { }
    
    public void keyReleased(KeyEvent keyEvent) { } 
    
    public void keyTyped(KeyEvent keyEvent) {
        char caracter = keyEvent.getKeyChar();
if (  (caracter != KeyEvent.VK_BACK_SPACE) && 
       ((caracter < '0') || (caracter > '9')) 
&&(caracter != '-') && (caracter != 'A') 
&& (caracter != 'B') && (caracter != 'C') && (caracter != 'D') 
&& (caracter != 'E')&& (caracter != 'F') 
&& (caracter != 'G') && (caracter != 'H') && (caracter != 'I') 
&& (caracter != 'J')&& (caracter != 'K') 
&& (caracter != 'L') && (caracter != 'M') && (caracter != 'N') 
&& (caracter != 'O')&& (caracter != 'P') 
&& (caracter != 'Q') && (caracter != 'R') && (caracter != 'S') 
&& (caracter != 'T')&& (caracter != 'U') 
&& (caracter != 'V') && (caracter != 'W') && (caracter != 'X') 
&& (caracter != 'Y')&& (caracter != 'z') 
&& (caracter != 'a') && (caracter != 'b') && (caracter != 'c') 
&& (caracter != 'd')&& (caracter != 'e') 
&& (caracter != 'f') && (caracter != 'g') && (caracter != 'h') 
&& (caracter != 'i')&& (caracter != 'j') 
&& (caracter != 'k') && (caracter != 'l') && (caracter != 'm') 
&& (caracter != 'n')&& (caracter != 'o') 
&& (caracter != 'p') && (caracter != 'q') && (caracter != 'r') 
&& (caracter != 's')&& (caracter != 't') 
&& (caracter != 'u') && (caracter != 'v') && (caracter != 'w') 
&& (caracter != 'x')&& (caracter != 'y') 
&& (caracter != 'z') && (caracter != 'ñ') && (caracter != 'Ñ')   )
{
    // Verifica el uso de caracteres válidos
    keyEvent.consume();
} // Fin verificación del uso de caracteres válidos 

else { if (caracter == KeyEvent.VK_BACK_SPACE) { 
    // Verifica si se presionó la tecla de retroceso
if (nroCaracteres > 0) 
    nroCaracteres -= 1; } 
// Fin verificación de uso de la tecla de retroceso 
else nroCaracteres +=1; 
if (nroCaracteres > 12) { // Valida que la cédula no tenga más de 10 caracteres 
    keyEvent.consume();
    nroCaracteres -= 1; } // Fin validación de la longitud de la cédula 
if (nroCaracteres == 1) { // Determina si el primer caracter es V ó E 
    if (
(caracter != KeyEvent.VK_BACK_SPACE) && (caracter != 'A') 
&& (caracter != 'B') && (caracter != 'C') && (caracter != 'D') 
&& (caracter != 'E')&& (caracter != 'F') 
&& (caracter != 'G') && (caracter != 'H') && (caracter != 'I') 
&& (caracter != 'J')&& (caracter != 'K') 
&& (caracter != 'L') && (caracter != 'M') && (caracter != 'N') 
&& (caracter != 'O')&& (caracter != 'P') 
&& (caracter != 'Q') && (caracter != 'R') && (caracter != 'S') 
&& (caracter != 'T')&& (caracter != 'U') 
&& (caracter != 'V') && (caracter != 'W') && (caracter != 'X') 
&& (caracter != 'Y')&& (caracter != 'z') 
&& (caracter != 'a') && (caracter != 'b') && (caracter != 'c') 
&& (caracter != 'd')&& (caracter != 'e') 
&& (caracter != 'f') && (caracter != 'g') && (caracter != 'h') 
&& (caracter != 'i')&& (caracter != 'j') 
&& (caracter != 'k') && (caracter != 'l') && (caracter != 'm') 
&& (caracter != 'n')&& (caracter != 'o') 
&& (caracter != 'p') && (caracter != 'q') && (caracter != 'r') 
&& (caracter != 's')&& (caracter != 't') 
&& (caracter != 'u') && (caracter != 'v') && (caracter != 'w') 
&& (caracter != 'x')&& (caracter != 'y') 
&& (caracter != 'z') && (caracter != 'ñ') && (caracter != 'Ñ') )
    {
     keyEvent.consume(); 
     nroCaracteres -=1; } } 
// Fin evaluación del primer caracter 

// Fin ControlTecla
} // Fin de la clase contraseña
}
}
}
