/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actualizar_claves_usolistas;



/**
 *

 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame{
    

private JTextField tx1;
private JLabel etq1;
private ListaClaves a;


public Ventana(ListaClaves b) { // Inicio Constructor 
super( "Prueba*************************************"); 
Container contenedor = getContentPane(); 
contenedor.setLayout( null ); 
int x, y;
x = 20; 
y = 20; 
a=b;
//para el campo cedula se inicializa y se posiciona lo siguente
etq1 = new JLabel ( "Campo de Clave" ); 
etq1.setHorizontalAlignment(SwingConstants.CENTER);
etq1.setToolTipText( "Introduzca una clave" );
etq1.setBounds(x, y, 120, 20);
etq1.setOpaque(true); 
etq1.setBackground(Color.DARK_GRAY); 
etq1.setForeground(Color.WHITE);
contenedor.add( etq1 ); 
tx1 = new CampoClave();



tx1.setBounds(x + 140, y, 80, 20); 
tx1.setForeground(Color.BLUE); 
contenedor.add ( tx1 );
ManejadorCampoTexto manejador = new ManejadorCampoTexto();
tx1.addActionListener( manejador );
setVisible( true ); 



this.setBounds(100,100, 300, 150);
} // Fin Constructor
// Clase interna privada para manejar eventos tipo ActionEvent 
private class ManejadorCampoTexto
implements ActionListener { 
    // Inicio ManejadorCampoTexto y campo password
    public void actionPerformed ( ActionEvent evento) { 
        String texto = "";
    if (evento.getSource() == tx1 ) {
        texto = "Campo de texto 1: " + evento.getActionCommand();
        
      boolean z; 
      z = a.buscar(evento.getActionCommand());
       if(z ==false){
           JOptionPane.showMessageDialog(null, texto);
       }
      
    
    }
    
    } // Muestra en una ventana el texto introducido en el campo de texto
    //o campo de password
    
 
}
}