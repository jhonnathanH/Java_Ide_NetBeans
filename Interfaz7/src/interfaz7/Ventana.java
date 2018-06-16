package interfaz7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ventana extends JFrame{
    
private JTextField tx1,tx2,tx3,tx4,tx5,tx6;
private JLabel etq1,etq2,etq3,etq4,etq5,etq6;
public Ventana() { // Inicio Constructor
                            
        super( "Prueba de Campos de Texto Especiales");
        Container contenedor = getContentPane();
                
        contenedor.setLayout( null );
int x, y;
x = 20;
y = 20;
etq1 = new JLabel ( "Campo de Cédula:" );
etq1.setHorizontalAlignment(SwingConstants.CENTER);
etq1.setToolTipText( "Introduzca un número de cédula" );
etq1.setBounds(x, y, 120, 20);
etq1.setOpaque(true);
etq1.setBackground(Color.DARK_GRAY);
etq1.setForeground(Color.WHITE);
contenedor.add( etq1 );


tx1 = new CampoCedula();    //  Uso de un objeto CampoCedula
tx1.setBounds(x + 140, y, 80, 20);
tx1.setForeground(Color.BLUE);
contenedor.add ( tx1 );
ManejadorCampoTexto manejador1 = new ManejadorCampoTexto();
tx1.addActionListener( manejador1 );
                
        setVisible( true );
this.setBounds(100,100, 500, 400);
    
etq2 = new JLabel ( "Campo de RIF:" );
etq2.setHorizontalAlignment(SwingConstants.CENTER);
etq2.setToolTipText( "Introduzca un número de RIF" );
etq2.setBounds(x, y+40, 120, 20);
etq2.setOpaque(true);
etq2.setBackground(Color.DARK_GRAY);
etq2.setForeground(Color.WHITE);
contenedor.add( etq2 );


tx2 = new CampoRif();    //  Uso de un objeto CampoRif
tx2.setBounds(x + 140, y+40, 85, 20);
tx2.setForeground(Color.BLUE);
contenedor.add ( tx2 );
ManejadorCampoTexto manejador2 = new ManejadorCampoTexto();
tx2.addActionListener( manejador2 );
                
        setVisible( true );
this.setBounds(100,100, 500, 400);

etq3 = new JLabel ( "Campo de número entero:" );
etq3.setHorizontalAlignment(SwingConstants.CENTER);
etq3.setToolTipText( "Introduzca un número entero, positivo o negativo" );
etq3.setBounds(x, y+80, 170, 20);
etq3.setOpaque(true);
etq3.setBackground(Color.DARK_GRAY);
etq3.setForeground(Color.WHITE);
contenedor.add( etq3 );


tx3 = new CampoNumEnt();    //  Uso de un objeto CampoRif
tx3.setBounds(x + 190, y+80, 80, 20);
tx3.setForeground(Color.BLUE);
contenedor.add ( tx3 );
ManejadorCampoTexto manejador3 = new ManejadorCampoTexto();
tx3.addActionListener( manejador3 );
                
        setVisible( true );
this.setBounds(100,100, 500, 400);

etq4 = new JLabel ( "Campo de número real:" );
etq4.setHorizontalAlignment(SwingConstants.CENTER);
etq4.setToolTipText( "Introduzca un número real, positivo o negativo" );
etq4.setBounds(x, y+120, 170, 20);
etq4.setOpaque(true);
etq4.setBackground(Color.DARK_GRAY);
etq4.setForeground(Color.WHITE);
contenedor.add( etq4 );


tx4 = new CampoNumReal();    //  Uso de un objeto CampoRif
tx4.setBounds(x + 190, y+120, 120, 20);
tx4.setForeground(Color.BLUE);
contenedor.add ( tx4 );
ManejadorCampoTexto manejador4 = new ManejadorCampoTexto();
tx4.addActionListener( manejador4 );
                
        setVisible( true );
this.setBounds(100,100, 500, 400);

etq5= new JLabel ( "Campo de contraseña:" );
etq5.setHorizontalAlignment(SwingConstants.CENTER);
etq5.setToolTipText( "Introduzca una contraseña" );
etq5.setBounds(x, y+160, 170, 20);
etq5.setOpaque(true);
etq5.setBackground(Color.DARK_GRAY);
etq5.setForeground(Color.WHITE);
contenedor.add( etq5);


tx5 = new CampoPass();    //  Uso de un objeto CampoRif
tx5.setBounds(x + 190, y+160, 80, 20);
tx5.setForeground(Color.BLUE);
contenedor.add ( tx5 );
ManejadorCampoTexto manejador5 = new ManejadorCampoTexto();
tx5.addActionListener( manejador5 );
                
        setVisible( true );
this.setBounds(100,100, 500, 400);

etq6= new JLabel ( "Campo de descripción:" );
etq6.setHorizontalAlignment(SwingConstants.CENTER);
etq6.setToolTipText( "Introduzca una descripción" );
etq6.setBounds(x, y+200, 170, 20);
etq6.setOpaque(true);
etq6.setBackground(Color.DARK_GRAY);
etq6.setForeground(Color.WHITE);
contenedor.add( etq6);


tx6 = new CampoDescr();    //  Uso de un objeto CampoRif
tx6.setBounds(x + 190, y+200, 250, 20);
tx6.setForeground(Color.BLUE);
contenedor.add ( tx6 );
ManejadorCampoTexto manejador6 = new ManejadorCampoTexto();
tx6.addActionListener( manejador6 );
                
        setVisible( true );
this.setBounds(100,100, 500, 400);
} // Fin Constructor

// Clase interna privada para manejar eventos tipo ActionEvent
private class ManejadorCampoTexto 
                  implements ActionListener { // Inicio ManejadorCampoTexto
    
        public void actionPerformed ( ActionEvent evento) {
          String texto = "";
if (evento.getSource() == tx1)
              texto = "Campo de Cédula: " + evento.getActionCommand();
if (evento.getSource() == tx2)
              texto = "Campo de RIF: " + evento.getActionCommand();
if (evento.getSource() == tx3)
              texto = "Campo de número entero: " + evento.getActionCommand();
if (evento.getSource() == tx4)
              texto = "Campo de número real: " + evento.getActionCommand();
if (evento.getSource() == tx5)
              texto = "Campo de contraseña: " + evento.getActionCommand();
if (evento.getSource() == tx6)
              texto = "Campo de descripción: " + evento.getActionCommand();
         
         //  Muestra en una ventana el texto introducido en el campo de texto
          JOptionPane.showMessageDialog(null, texto);
        
}
        
    } // Fin ManejadorCampoTexto
}   //  Fin de la clase Ventana