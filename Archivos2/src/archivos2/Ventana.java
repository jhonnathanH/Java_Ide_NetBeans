/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ventana extends JFrame {
private JPanel encabezado, datos, botones;
private JLabel etq1, etq2, etq3, etq4;
private CampoCedula txt1;
private JTextField txt2;
private CampoEdad txt3;
private JButton btn1, btn2;
public Ventana()
{
super("Inserción de datos en un archivo de texto");
Container contenedor = getContentPane();
// Asignación del administrador de esquema al contenedor
contenedor.setLayout(new BorderLayout(1,1));
// Definición del panel correspondiente al encabezado 
encabezado = new JPanel(new FlowLayout());
encabezado.setMaximumSize(new Dimension(200, 50));
// Definición del panel correspondiente al área de introducción de datos 
datos = new JPanel(new GridLayout(3,2,10,10));
datos.setBorder(BorderFactory.createLineBorder (Color.DARK_GRAY, 1));
datos.setBackground(new Color(255,255,220));
datos.setMaximumSize(new Dimension(200, 150));
datos.setPreferredSize(new Dimension(200, 150));
// Definición del panel correspondiente al área de botones
botones = new JPanel(new FlowLayout());
botones.setPreferredSize(new Dimension(200, 50));
botones.setMaximumSize(new Dimension(200, 50));
// Establecimiento de la etiqueta para el encabezado
etq4 = new JLabel ( "Introduzca los siguientes datos: ");
etq4.setHorizontalAlignment(SwingConstants.CENTER);
etq4.setPreferredSize(new Dimension(200, 30));
encabezado.add( etq4 );
// Establecimiento de la etiqueta para la cédula
etq1 = new JLabel ( "Cédula: ");
etq1.setHorizontalAlignment(SwingConstants.RIGHT);
etq1.setPreferredSize(new Dimension(80, 30));
etq1.setMaximumSize(new Dimension(80, 30));
datos.add( etq1 );
txt1 = new CampoCedula();
txt1.setPreferredSize(new Dimension(80, 30));
txt1.setMaximumSize(new Dimension(80, 30));
datos.add(txt1);
// Establecimiento de la etiqueta para el nombre
etq2 = new JLabel ( "Nombre: ");
etq2.setHorizontalAlignment(SwingConstants.RIGHT);
etq2.setPreferredSize(new Dimension(80, 30));
etq2.setMaximumSize(new Dimension(80, 30));
datos.add( etq2 );
txt2 = new JTextField();
txt2.setPreferredSize(new Dimension(80, 30));
txt2.setMaximumSize(new Dimension(80, 30));
datos.add(txt2);
// Establecimiento de la etiqueta para la edad
etq3 = new JLabel ( "Edad: ");
etq3.setHorizontalAlignment(SwingConstants.RIGHT);
etq3.setPreferredSize(new Dimension(80, 30));
etq3.setMaximumSize(new Dimension(80, 30));
datos.add( etq3 );
txt3 = new CampoEdad();
txt3.setPreferredSize(new Dimension(80, 30));
txt3.setMaximumSize(new Dimension(80, 30));
datos.add(txt3);
// Establecimiento del botón para limpiar los datos introducidos
btn1 = new JButton("Inicializar");
btn1.setPreferredSize(new Dimension(110, 30));
botones.add(btn1);
// Establecimiento del botón para grabar los datos al archivo
btn2 = new JButton("Grabar");
btn2.setPreferredSize(new Dimension(110, 30));
botones.add(btn2);
ManejadorBotones AccionBoton = new ManejadorBotones();
btn1.addActionListener(AccionBoton);
btn2.addActionListener(AccionBoton);
contenedor.add(encabezado, BorderLayout.NORTH);
contenedor.add(datos, BorderLayout.CENTER); 
contenedor.add(botones, BorderLayout.SOUTH);
setSize(500,250);
setVisible( true );
}
// Clase interna para el manejo de los eventos ActionListener
private class ManejadorBotones implements ActionListener
{
public void actionPerformed (ActionEvent a)
{
if (a.getSource() == btn1)
{
txt1.inicializar();
txt2.setText(null);
txt3.inicializar();
}
if (a.getSource() == btn2) { DatosArchivo archNombre = new DatosArchivo("C:\\Users\\jhon\\Documents\\NetBeansProjectspruebaArchivo2.txt"); archNombre.escribeLinea(txt1.getText() + "," + txt2.getText() + "," + txt3.getText()); archNombre.cerrarArchivo(); System.out.println("Registro Grabado"); }
}
}
}