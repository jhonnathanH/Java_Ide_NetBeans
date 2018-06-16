
package camposdetextosespeciales;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Campo2 extends JTextField {
    int nroCaracteres;
    boolean Primero; 
    public Campo2(){
    super(2);
    nroCaracteres = 0; 
    ControlTecla ctrlTecla = new ControlTecla(); 
    this.setToolTipText( "Introduzca el numero" );
    this.addKeyListener(ctrlTecla); 
    
    }
    private class ControlTecla implements KeyListener {
    // Inicio ControlTecla
    public void keyPressed(KeyEvent keyEvent) { }
    
    public void keyReleased(KeyEvent keyEvent) { } 
    
    public void keyTyped(KeyEvent keyEvent) {
        char caracter = keyEvent.getKeyChar();
if ( ( (caracter < '0') || (caracter > '9') ) 
&& (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '-') 
&& (caracter != '+') ) {
    // Verifica el uso de caracteres válidos
    keyEvent.consume();
} // Fin verificación del uso de caracteres válidos 
else { 
if (caracter == KeyEvent.VK_BACK_SPACE) { 
// Verifica si se presionó la tecla de retroceso
if (nroCaracteres > 0) 
    nroCaracteres -= 1; } 
// Fin verificación de uso de la tecla de retroceso 
else nroCaracteres +=1; 
if (Primero==true) {
    if (nroCaracteres>9){
 // Si se introdujo un + o - deja hasta 9 caracteres sino deja hasta 8 
    keyEvent.consume();
    nroCaracteres -= 1; }}
// Fin validación de la longitud de la cédula 
else  {  
  if (nroCaracteres>8){
  keyEvent.consume();
    nroCaracteres -= 1;}
    }
if (nroCaracteres == 1) { // Determina si el primer caracter es +,- o un numero
    if (( (caracter < '0') || (caracter > '9') ) 
  &&  (caracter != '+') && (caracter != '-')
  && (caracter != KeyEvent.VK_BACK_SPACE)){
     keyEvent.consume(); 
     nroCaracteres -=1; }  
   /* Definiendo si el nro de caracteres totales sera 8 o 9 dependiendo 
    * si se introdujo un + o -
    */       
if ( (caracter != '+') && (caracter != '-')){
    Primero=false; }  
else{ Primero=true; }
}
// Fin evaluación del primer caracter 
else { 
    // Verifica que a partir del 3er caracter solo haya dígitos 
    if ( (nroCaracteres > 1)
            && ((caracter < '0') || (caracter > '9'))
            && (caracter != KeyEvent.VK_BACK_SPACE) ) { 
        keyEvent.consume();
        nroCaracteres -=1; } }
// Fin ControlTecla
} // Fin de la clase Campo2
}    
}   
}
