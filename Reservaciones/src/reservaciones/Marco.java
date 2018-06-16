package Reservaciones;

import java.awt.*;

import javax.swing.*;

public class Marco extends JFrame{//constructor del marco, que es una clase que hereda las caracteristicas de JFrame
	
	public Marco(){
	
	setVisible(true);//permite la visibilidad del lamina
	
	setTitle("Hotel Search");//Titulo de nuestra ventana
	
	setBounds(400,200,725,550);//ubicacion del marco, tamaño y ancho
	
	setResizable(false);//impedir que se maximine la ventana
	
	LaminaBotones milamina=new LaminaBotones();// intancia LaminaBotones
	
	add(milamina);//agregar la lamina al contructor
		
	//imagen del icono de la ventana
	Toolkit mipantalla=Toolkit.getDefaultToolkit();
		
	Image miIcono=mipantalla.getImage("src/imagen/hotelsearch.png");//icono de la pestaña
	
	setIconImage(miIcono);
		
	milamina.setLayout(new FlowLayout(FlowLayout.CENTER, 75, 100));//alineacion CENTER
		
	milamina.setBackground(Color.WHITE);//background de la pantalla
		
		}
	
}

