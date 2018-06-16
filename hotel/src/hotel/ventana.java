/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author Jhonnnathan
 */
public class ventana extends JFrame {
private JPanel p1, p2, botones;
private JLabel etq1, etq2, etq3, etq4;
private JTextField txt1;
private JTextField txt2;
private JRadioButton op1, op2;
//private CampoEdad txt3;
private JButton btn1, btn2;
private ventana areaDibujo;
int variable1, variable2;

int ban1,ban2,ban3,d2;
String H1="Lakewood ";
String H2="Bridgewood";
String H3="Ridgewood";
String opcion;



private JPanel area1, area2, select1, select2,select3;

private ButtonGroup grupo1, grupo2;


public ventana (){ // Inicio constructor
 super("Busco Hotel"); 
 Container contenedor = getContentPane(); // Asignación del administrador de esquema al contenedor 
contenedor.setLayout(new BorderLayout(4,4)); // Definición del panel correspondiente al área 

area1 = new JPanel(new GridLayout(2,2,1,1)); // Definición del panel para la selección 
area2 = new JPanel(new GridLayout(2,2,1,1)); 
// Definición del panel para la selección 
select1 = new JPanel(new GridLayout(2,2,1,1)); 
 // Definición del panel para selección de la acción a ejecutar 
select2 = new JPanel(new FlowLayout()); 
select3 = new JPanel(new GridLayout(2,2,1,1));
 // Establecimiento de los radio buttons para la selección del color 
op1 = new JRadioButton("Usuario VIP"); 
op2 = new JRadioButton("Usuario Estandar");

grupo1 = new ButtonGroup(); 
grupo1.add(op1); 
grupo1.add(op2); 
area2.add(op1); 
area2.add(op2);
area1.add(area2); // Establecimiento de los radio buttons para la selección del usuario

grupo2 = new ButtonGroup();
btn1=new JButton("fecha fin");
btn1.setLocation(20, 20);
grupo2.add(btn1);
btn2=new JButton("Buscar");
grupo2.add(btn2);

select1.add(btn1);
select1.add(btn2); 

area1.add(select1); // Establecimiento del grupo

etq1 = new JLabel ( "fecha: ");

etq1.setPreferredSize(new Dimension(100, 30));
etq1.setMaximumSize(new Dimension(100, 30));
select2.add(etq1);
txt1 = new JTextField();
txt1.setPreferredSize(new Dimension(100, 30));
txt1.setMaximumSize(new Dimension(100, 30));
select2.add(txt1);  

area1.add(select2); // Asignación de la ubicación de los paneles principales
etq3 = new JLabel ( "Hotel mas barato");
etq3.setVisible(false);

etq4 = new JLabel ();
etq4.setVisible(false);

select3.add(etq3);
select3.add(etq4);
area1.add(select3);

contenedor.add(area1, BorderLayout.CENTER); 

ManejadorOpciones manejador = new ManejadorOpciones();
op1.addItemListener(manejador); op2.addItemListener(manejador);  // Asignación del manejador para las acciones a ejecutar 
 ManejadorBotones manejadorBtn = new ManejadorBotones();
 btn1.addActionListener(manejadorBtn);// Asignación del manejador para las opciones seleccionadas 
 btn2.addActionListener(manejadorBtn);
// Definición del tamaño de la ventana y habilitación de visibilidad 
 
 setSize(300,200); 
 setVisible( true );
 setLocationRelativeTo(null);
 setResizable(false);
 
ban1=0;
ban2=0;
ban3=0;
JOptionPane.showMessageDialog(null, "Ingresar Fecha DDMES(dia)AAAA  y  Tipo de usuario");
}




private class ManejadorOpciones implements ItemListener
{
public void itemStateChanged ( ItemEvent evento)
{
if (op1.isSelected())
{ variable1=1;
variable2=0;}
if (op2.isSelected())
{  variable2=1;
variable1=0;}

}
}
// Clase para manejar las acciones a ejecutar
private class ManejadorBotones implements ActionListener
{
public void actionPerformed ( ActionEvent e )
{
if (e.getSource() == btn1)
{
    

String vtx1;
vtx1= txt1.getText();
help algo= new help(vtx1);


    int dd = algo.dianumero();
    String dia = algo.diaSemana();
    String mes = algo.Mes();
    int AA = algo.año();
//codigo principal para el calculo del costo diario en cada hotel
if ((dia.equals("mon") || dia.equals("tue")|| dia.equals("wen")|| dia.equals("thu")|| dia.equals("fri") )&& variable2==1)
{ban1=ban1+110;
ban2=ban2+160;
ban3=ban3+220;
    
} else if((dia.equals("mon") || dia.equals("tue")|| dia.equals("wen")|| dia.equals("thu")|| dia.equals("fri") )&& variable1==1)
        {
        ban1=ban1+80;
ban2=ban2+110;
ban3=ban3+100;
    }
if ((dia.equals("sat") || dia.equals("sun"))&& variable2==1)
{
ban1=ban1+90;
ban2=ban2+60;
ban3=ban3+150;

}else if((dia.equals("sat") || dia.equals("sun"))&&variable1==1)
        {
        ban1=ban1+80;
ban2=ban2+50;
ban3=ban3+40;
    }
//verificar cual hotel es la mejor opcion
if(ban1==ban2 && ban2< ban3){
    opcion=H2;}
if(ban2==ban3 && ban2< ban1){
    opcion=H3;}
if(ban1==ban3 && ban1< ban2){
    opcion=H3;}
if((ban1 < ban2 && ban2 < ban3) || (ban1< ban3 && ban3< ban2)){
    opcion=H1;}
if((ban3 < ban2 && ban2< ban1) ||( ban3< ban1 && ban3< ban2)){
    opcion=H3;}
if((ban2 < ban1 && ban1< ban3 )|| (ban2< ban1 && ban3< ban1)){
    opcion=H1;}

//validar si desea agregar otro dia      
System.out.println(opcion+"-----" +  ban1 +"  "+ ban2 +"  "+   ban3);
int confirmado = JOptionPane.showConfirmDialog(
   null,
   "Desea agregar otro dia");

if (JOptionPane.OK_OPTION == confirmado){
   op1.setEnabled(false);
   op2.setEnabled(false);
if(dd< 30)
{d2=dd+1;
    if((dia.equals("mon"))){
            
            
    txt1.setText(d2+mes+"(tue)"+AA);
}
     if((dia.equals("tue"))){
            
            
    txt1.setText(d2+mes+"(wed)"+AA);
}
      if((dia.equals("wed"))){
            
            
    txt1.setText(d2+mes+"(thu)"+AA);
}
       if((dia.equals("thu"))){
            
            
    txt1.setText(d2+mes+"(fri)"+AA);
}
        if((dia.equals("fri"))){
            
            
    txt1.setText(d2+mes+"(sat)"+AA);
}
         if((dia.equals("sat"))){
           
    txt1.setText(d2+mes+"(sun)"+AA);}
     if((dia.equals("sun"))){
            
            
    txt1.setText(d2+mes+"(m)"+AA);
}
}
}
}
else
    txt1.setEnabled(false);
   System.out.println(".....");



if(e.getSource() == btn2)
{ System.out.println(opcion+"-----" +  ban1 + ban2    + ban3);
   etq4.setText(opcion);
    etq3.setVisible(true);
    etq4.setVisible(true);
}
}
}}
