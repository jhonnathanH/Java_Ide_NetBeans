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

public class Ventana extends JFrame{
    

private JTextField tx1,tx2,tx3,tx4,tx6;
private JLabel etq1,etq2,etq3,etq4,etq5,etq6;
private JPasswordField pw5;

public Ventana() { // Inicio Constructor 
super( "Prueba de Campos de Texto Especiales"); 
Container contenedor = getContentPane(); 
contenedor.setLayout( null ); 
int x, y;
x = 20; 
y = 20; 
//para el campo cedula se inicializa y se posiciona lo siguente
etq1 = new JLabel ( "Campo de Cédula:" ); 
etq1.setHorizontalAlignment(SwingConstants.CENTER);
etq1.setToolTipText( "Introduzca un número de cédula" );
etq1.setBounds(x, y, 120, 20);
etq1.setOpaque(true); 
etq1.setBackground(Color.DARK_GRAY); 
etq1.setForeground(Color.WHITE);
contenedor.add( etq1 ); 
tx1 = new CampoCedula();



tx1.setBounds(x + 140, y, 80, 20); 
tx1.setForeground(Color.BLUE); 
contenedor.add ( tx1 );
ManejadorCampoTexto manejador = new ManejadorCampoTexto();
tx1.addActionListener( manejador );
setVisible( true ); 

//para el Rif
etq2 = new JLabel ( "Campo de RIF:" ); 
etq2.setHorizontalAlignment(SwingConstants.CENTER);
etq2.setToolTipText( "Introduzca un número de RIF" );
etq2.setBounds(x, y+60, 120, 20);
etq2.setOpaque(true); 
etq2.setBackground(Color.DARK_GRAY); 
etq2.setForeground(Color.WHITE);
contenedor.add( etq2 ); 
tx2 = new CampoRif();

tx2.setBounds(x + 140, y+60, 80, 20); 
tx2.setForeground(Color.BLUE); 
contenedor.add ( tx2 );

tx2.addActionListener( manejador );
setVisible( true ); 

// para intro de numero
etq3= new JLabel ( "Campo de numero:" ); 
etq3.setHorizontalAlignment(SwingConstants.CENTER);
etq3.setToolTipText( "Introduzca un número " );
etq3.setBounds(x, y+60*2, 120, 20);
etq3.setOpaque(true); 
etq3.setBackground(Color.DARK_GRAY); 
etq3.setForeground(Color.WHITE);
contenedor.add( etq3 ); 
tx3 = new introNumero();

tx3.setBounds(x + 140, y+60*2, 80, 20); 
tx3.setForeground(Color.BLUE); 
contenedor.add ( tx3 );

tx3.addActionListener( manejador );
setVisible( true ); 

//para el numero real
etq4 = new JLabel ( "Campo numero ent y dec:" ); 
etq4.setHorizontalAlignment(SwingConstants.CENTER);
etq4.setToolTipText( "Introduzca un número con parte entera y decimal" );
etq4.setBounds(x, y+60*3, 120, 20);
etq4.setOpaque(true); 
etq4.setBackground(Color.DARK_GRAY); 
etq4.setForeground(Color.WHITE);
contenedor.add( etq4 ); 
tx4 = new introNumeroReal();

tx4.setBounds(x + 140, y+60*3, 80, 20); 
tx4.setForeground(Color.BLUE); 
contenedor.add ( tx4 );

tx4.addActionListener( manejador );
setVisible( true ); 

//* para ila contrañesa
etq5= new JLabel( "contraseña" );
etq5.setHorizontalAlignment(SwingConstants.CENTER);
etq5.setToolTipText( "Introduzca una contraseña " );
etq5.setBounds(x, y+60*4, 120, 20);
etq5.setOpaque(true); 
etq5.setBackground(Color.DARK_GRAY); 
etq5.setForeground(Color.WHITE);
contenedor.add( etq5 ); 

       
pw5=new Contraseña();
pw5.setBounds(x + 140, y+60*4, 80, 20); 
pw5.setForeground(Color.BLUE); 
contenedor.add ( pw5 );

pw5.addActionListener( manejador );
setVisible( true ); 

//para el 6
etq6 = new JLabel ( "Direccion" ); 
etq6.setHorizontalAlignment(SwingConstants.CENTER);
etq6.setToolTipText( "Introduzca una direccion" );
etq6.setBounds(x, y+60*5, 120, 20);
etq6.setOpaque(true); 
etq6.setBackground(Color.DARK_GRAY); 
etq6.setForeground(Color.WHITE);
contenedor.add( etq6 ); 
tx6 = new Direccion();

tx6.setBounds(x + 140, y+60*5, 250,20); 
tx6.setForeground(Color.BLUE); 
contenedor.add ( tx6 );

tx6.addActionListener( manejador );
setVisible( true ); 


this.setBounds(100,100, 500, 400);
} // Fin Constructor
// Clase interna privada para manejar eventos tipo ActionEvent 
private class ManejadorCampoTexto
implements ActionListener { 
    // Inicio ManejadorCampoTexto y campo password
    public void actionPerformed ( ActionEvent evento) { 
        String texto = "";
    if (evento.getSource() == tx1 ) {
        texto = "Campo de texto 1: " + evento.getActionCommand();
    JOptionPane.showMessageDialog(null, texto);
    }
    if (evento.getSource() == tx2 ) {
        texto = "Campo de texto 2: " + evento.getActionCommand();
    JOptionPane.showMessageDialog(null, texto);
    }
    if (evento.getSource() == tx3 ) {
        texto = "Campo de texto 3: " + evento.getActionCommand();
    JOptionPane.showMessageDialog(null, texto);
    }
     if (evento.getSource() == tx4 ) {
        texto = "Campo de texto 4: " + evento.getActionCommand();
    JOptionPane.showMessageDialog(null, texto);
    }
      if (evento.getSource() == pw5 ) {
        texto = "Campo de password 5: " + evento.getActionCommand();
    JOptionPane.showMessageDialog(null, texto);
    }
        if (evento.getSource() == tx6 ) {
        texto = "Campo de texto 6: " + evento.getActionCommand();
    JOptionPane.showMessageDialog(null, texto);
    }
    } // Muestra en una ventana el texto introducido en el campo de texto
    //o campo de password
    
 
} 


 

} // Fin de la clase Ventana