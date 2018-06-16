
//Realizado por Rafael Hernandez C.I.21242608 y Frank Fung C.I.20082306

package camposdetextosespeciales;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame {
    
    private JLabel etq1,etq2,etq3,etq4,etq5,etqTit,etqint1,etqint2;
    private JTextField tx1,tx2,tx3,tx5;
    private JPasswordField pass;
    
    
    String texto1 = "";        
    public Ventana(){
        
       super("Prueba de Campos de Textos Especiales");

               
       int x,y;
       x=20;
       y=20;
      
       
       Container Contenedor = getContentPane();
       Contenedor.setLayout(null);
       

       etqTit = new JLabel("Realizado por:");
       etqTit.setHorizontalAlignment(SwingConstants.LEFT);
       etqTit.setToolTipText("Informacion de los autores");
       etqTit.setBounds(x,y,250,20);
       etqTit.setOpaque(true);
       etqTit.setBackground(Color.BLUE); 
       etqTit.setForeground(Color.WHITE);
       Contenedor.add( etqTit ); 
       
       etqint1 = new JLabel("Rafael Hernandez C.I.21242608");
       etqint1.setHorizontalAlignment(SwingConstants.CENTER);
       etqint1.setToolTipText("Informacion de los autores");
       etqint1.setBounds(x,y+30,250,20);
       etqint1.setOpaque(true);
       etqint1.setBackground(Color.BLUE); 
       etqint1.setForeground(Color.WHITE);
       Contenedor.add( etqint1 ); 
       
       etqint2 = new JLabel( "Frank Fung C.I.20082306 ");
       etqint2.setHorizontalAlignment(SwingConstants.RIGHT);
       etqint2.setToolTipText("Informacion de los autores");
       etqint2.setBounds(x,y+60,250,20);
       etqint2.setOpaque(true);
       etqint2.setBackground(Color.BLUE); 
       etqint2.setForeground(Color.WHITE);
       Contenedor.add( etqint2 ); 
       
       etq1 = new JLabel("Campo de cedula:");
       etq1.setHorizontalAlignment(SwingConstants.CENTER);
       etq1.setToolTipText("Introduzca el numero de cedula Ej:V-21242608");
       etq1.setBounds(x,y+90,120,20);
       etq1.setOpaque(true);
       etq1.setBackground(new Color(0,150,150)); 
       etq1.setForeground(Color.WHITE);
       Contenedor.add( etq1 ); 
       
       tx1= new CampoCedula();
       tx1.setBounds(x+125,y+90,80,20);
       tx1.setForeground(Color.BLACK);
       tx1.setBackground(Color.WHITE);
       Contenedor.add(tx1);
       
       etq2 = new JLabel(" Numero (+ o -)(Max 8 digitos):");
       etq2.setHorizontalAlignment(SwingConstants.LEFT);
       etq2.setToolTipText("Introduzca el numero Ej:+12345678 o 987654321");
       etq2.setBounds(x,y+120,185,20);
       etq2.setOpaque(true);
       etq2.setBackground(new Color(0,100,100)); 
       etq2.setForeground(Color.WHITE);
       Contenedor.add( etq2 ); 
       
       tx2= new Campo2();
       tx2.setBounds(x+190,y+120,90,20);
       tx2.setForeground(Color.BLACK);
       tx2.setBackground(Color.WHITE);
       Contenedor.add(tx2);
       
       etq3 = new JLabel(" Numero (+ o -)(Max 10 Enteros)(Max 4 Decimal):");
       etq3.setHorizontalAlignment(SwingConstants.LEFT);
       etq3.setToolTipText("Introduzca el numero Ej:+123.45678 o 9.87654321");
       etq3.setBounds(x,y+150,280,20);
       etq3.setOpaque(true);
       etq3.setBackground(new Color(0,100,250)); 
       etq3.setForeground(Color.WHITE);
       Contenedor.add( etq3 ); 
       
       tx3= new Campo3();
       tx3.setBounds(x+285,y+150,130,20);
       tx3.setForeground(Color.BLACK);
       tx3.setBackground(Color.WHITE);
       Contenedor.add(tx3);
       
       etq4 = new JLabel("Contraseña:");
       etq4.setHorizontalAlignment(SwingConstants.CENTER);
       etq4.setToolTipText("Introduzca se contraseña Ej:A-1234567890");
       etq4.setBounds(x,y+180,80,20);
       etq4.setOpaque(true);
       etq4.setBackground(Color.BLACK); 
       etq4.setForeground(Color.WHITE);
       Contenedor.add( etq4 ); 
       
       pass= new Campo4();
       pass.setBounds(x+85,y+180,90,20);
       pass.setForeground(Color.BLACK);
       pass.setBackground(Color.WHITE);
       Contenedor.add(pass);
       
       etq5 = new JLabel("Descripcion:");
       etq5.setHorizontalAlignment(SwingConstants.CENTER);
       etq5.setToolTipText("Introduzca su descripcion");
       etq5.setBounds(x,y+210,80,20);
       etq5.setOpaque(true);
       etq5.setBackground(new Color(0,100,200)); 
       etq5.setForeground(Color.WHITE);
       Contenedor.add( etq5 ); 
       
       tx5= new Campo5();
       tx5.setBounds(x+85,y+210,220,20);
       tx5.setForeground(Color.BLACK);
       tx5.setBackground(Color.WHITE);
       Contenedor.add(tx5);
      
       ManejadorCampoTexto manejador = new ManejadorCampoTexto();
       tx1.addActionListener( manejador );
       tx2.addActionListener( manejador );
       tx3.addActionListener( manejador );
       pass.addActionListener(manejador);
       tx5.addActionListener(manejador);
       setVisible(true);
       this.setBounds(200,150,480,300);
    }
       // Clase interna privada para manejar eventos tipo ActionEvent 
    private class ManejadorCampoTexto implements ActionListener { 
    // Inicio ManejadorCampoTexto 
    public void actionPerformed ( ActionEvent evento) {
          if (evento.getSource() == tx1)
              texto1 =  "Campo de texto 1: " + evento.getActionCommand();
          else if ( evento.getSource() == tx2 )
              texto1 =  "Campo de texto 2: " + evento.getActionCommand();
          else if ( evento.getSource() == tx3 )
              texto1 =  "Campo de texto 3: " + evento.getActionCommand() ;
          else if ( evento.getSource() == pass )
              texto1 =  "Contraseña: " + new String( pass.getPassword() ) ;
          else if ( evento.getSource() == tx5 )
              texto1 =  "Campo de texto5:" + evento.getActionCommand() ;
    
          JOptionPane.showMessageDialog(null, texto1);
//Actualiza el campo de texto cada vez que se presiona la tecla enter
}                                
}
}