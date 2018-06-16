package camposdetextosespeciales;
    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
public class Campo3 extends JTextField{
    int decimales=0;
    int entero=0;
    boolean dec=false;
    boolean masmenos=false;
public Campo3 (){
    super(2);
    ControlTecla ctrlTecla = new ControlTecla();
    this.setToolTipText( "Introduzca un Numero real" );
    this.addKeyListener(ctrlTecla);
}
private class ControlTecla implements KeyListener {      // Inicio ControlTecla
        
public void keyPressed(KeyEvent keyEvent) {}
public void keyReleased(KeyEvent keyEvent) {} 
public void keyTyped(KeyEvent keyEvent) {
    char caracter = keyEvent.getKeyChar();
    if ( ( (caracter < '0') || (caracter > '9') ) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.')&&(caracter != '-') &&(caracter != '+') )
        {  //  Verifica el uso de caracteres válidos
        keyEvent.consume();
        }  // Fin verificación del uso de caracteres válidos
    else { 
        if (caracter == KeyEvent.VK_BACK_SPACE && entero>0 && decimales==0)  
            {  //  Verifica si se presionó la tecla de retroceso si no hay decimales,solo elimina enteros
            entero-=1;
            }  //  Fin verificación de uso de la tecla de retroceso si no hay decimales,solo elimina enteros
        else if (caracter == KeyEvent.VK_BACK_SPACE && entero>0 && decimales!=0)  
            {  //  Verifica si se presionó la tecla de retroceso si hay decimales,solo elimina decimales
            decimales-=1;
            // Si ya no queda decimales
            if (decimales==0)
                dec=false;
            }  //  Fin verificación de uso de la tecla de retroceso si hay decimales
        else if (caracter == KeyEvent.VK_BACK_SPACE){
            // Verifica si se presiono la tecla de retroceso sin haber enteros ni decimales
            entero=0;
            }
        else{
            //Si no se presiono la tecla de retroceso
            if (dec==false)
                entero+=1;
            else if (dec==true)
                //Verifica si hay decimales
                decimales+=1;
        }
       if (entero == 1) 
            {  //   Determina si el primer caracter es + o -
            if((caracter == '+') || (caracter == '-')){
            masmenos=true;
            }
            if ((caracter != '-') && (caracter != '+') &&((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE))
                {
                keyEvent.consume();
                entero-=1;
                
                }
            }  
        else 
            if ((caracter == '.') && entero >2 && dec==false){
                //Determina si se presiono "."
                dec=true;
                decimales+=1;
                entero-=1;
                }
            else
                if (entero >= 2 &&((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && dec==false)
                    {//Verifica si no se ha presionado ".",y cuenta puro enteros
                    keyEvent.consume();
                    entero-=1;
                }
                else if(dec==true  &&((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)){
                    //Verifica si ya se empieza a contar los decimales
                    keyEvent.consume();
                    decimales-=1;
                }  
        if (masmenos==true && entero >11 && dec==false){
            keyEvent.consume();
            entero-=1;
        }
        if (entero >10 && dec==false && masmenos==false){
            //Condicion de limite de enteros
            keyEvent.consume();
            entero-=1;       
        }       
        if (decimales>5){
            //Condicion de limite de decimales
            keyEvent.consume();
            decimales-=1;
        } 
    }   
}
} // Fin ControlTecla
}



