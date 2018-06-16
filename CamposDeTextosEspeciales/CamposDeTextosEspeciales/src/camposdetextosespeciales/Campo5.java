
package camposdetextosespeciales;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Campo5 extends JTextField {
int nroCaracteres;
public Campo5() { 
    super(2);
    nroCaracteres = 0; 
    Campo5.ControlTecla ctrlTecla = new Campo5.ControlTecla(); 
    this.setToolTipText( "Introduzca la descripcion" );
    this.addKeyListener(ctrlTecla); }
// Clase interna privada para manejar eventos tipo KeyEvent 
private class ControlTecla implements KeyListener {
    // Inicio ControlTecla
    public void keyPressed(KeyEvent keyEvent) { }
    
    public void keyReleased(KeyEvent keyEvent) { } 
    
    public void keyTyped(KeyEvent keyEvent) {
char caracter = keyEvent.getKeyChar();
if (caracter == KeyEvent.VK_BACK_SPACE) { 
    // Verifica si se presionó la tecla de retroceso
if (nroCaracteres > 0) 
    nroCaracteres -= 1; } 
// Fin verificación de uso de la tecla de retroceso 
else nroCaracteres +=1; 
if (nroCaracteres > 30) { // Valida que la cédula no tenga más de 30 caracteres 
    keyEvent.consume();
    nroCaracteres -= 1; } // Fin validación de la longitud de descripcion

}
}
}