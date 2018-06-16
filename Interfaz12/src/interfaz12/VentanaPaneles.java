/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz12;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class VentanaPaneles extends JFrame {
private JPanel areaControles, selectColor, selectGrafico, selectAccion;
private VentanaGrafico areaDibujo;
private JRadioButton negro, azul, rojo, verde;
private JRadioButton rect, ovalo, circulo, rectRd;
private JButton btn1;
private ButtonGroup grupoColor, grupoFigura;
public VentanaPaneles() { // Inicio constructor
 super("Uso de Paneles y Administradores de Esquemas"); 
 Container contenedor = getContentPane(); // Asignación del administrador de esquema al contenedor 
contenedor.setLayout(new BorderLayout(5,5)); // Definición del panel correspondiente al área de dibujo 
areaDibujo = new VentanaGrafico();
areaDibujo.setBorder(BorderFactory.createLineBorder (Color.red, 2)); 
areaDibujo.setPreferredSize(new Dimension(610, 100)); // Definición del panel de controles 
areaControles = new JPanel(new GridLayout(3,1,2,2)); // Definición del panel para la selección del color 
selectColor = new JPanel(new GridLayout(4,1,2,2)); 
selectColor.setBorder(BorderFactory.createLineBorder (Color.blue, 2)); // Definición del panel para la selección del gráfico 
selectGrafico = new JPanel(new GridLayout(4,1,2,2)); 
selectGrafico.setBorder(BorderFactory.createLineBorder (Color.blue, 2)); // Definición del panel para selección de la acción a ejecutar 
selectAccion = new JPanel(new FlowLayout()); 
selectAccion.setBorder(BorderFactory.createLineBorder (Color.blue, 2)); // Establecimiento de los radio buttons para la selección del color 
negro = new JRadioButton("Negro", true); 
azul = new JRadioButton("Azul", false);
rojo = new JRadioButton("Rojo", false); 
verde = new JRadioButton("Verde", false);
grupoColor = new ButtonGroup(); 
grupoColor.add(negro); 
grupoColor.add(azul); grupoColor.add(rojo); grupoColor.add(verde); 
selectColor.add(negro); 
selectColor.add(azul);
selectColor.add(rojo); 
selectColor.add(verde); areaControles.add(selectColor); // Establecimiento de los radio buttons para la selección del gráfico 
rect = new JRadioButton("Rectángulo", false); rectRd = new JRadioButton("Rect.Redond.", false); ovalo = new JRadioButton("Ovalo", false); 
circulo = new JRadioButton("Círculo", false); grupoFigura = new ButtonGroup();
grupoFigura.add(rect); grupoFigura.add(rectRd); grupoFigura.add(ovalo); grupoFigura.add(circulo); selectGrafico.add(rect); selectGrafico.add(rectRd); 
selectGrafico.add(ovalo); selectGrafico.add(circulo); areaControles.add(selectGrafico); // Establecimiento del botón para borrar el área de dibujo
btn1 = new JButton ("Borrar"); 
btn1.setOpaque(true); btn1.setBackground(Color.WHITE); 
btn1.setForeground(Color.BLUE); 
btn1.setPreferredSize(new Dimension(100, 30));
selectAccion.add( btn1 ); 
areaControles.add(selectAccion); // Asignación de la ubicación de los paneles principales
contenedor.add(areaDibujo, BorderLayout.WEST); contenedor.add(areaControles, BorderLayout.EAST); // Asignación del manejador para las opciones seleccionadas 
ManejadorOpciones manejador = new ManejadorOpciones(); rect.addItemListener(manejador); rectRd.addItemListener(manejador); 
ovalo.addItemListener(manejador);
circulo.addItemListener(manejador); negro.addItemListener(manejador); azul.addItemListener(manejador); rojo.addItemListener(manejador); verde.addItemListener(manejador); // Asignación del manejador para las acciones a ejecutar 
 ManejadorBotones manejadorBtn = new ManejadorBotones(); btn1.addActionListener(manejadorBtn); // Definición del tamaño de la ventana y habilitación de visibilidad 
 setSize(850,400); setVisible( true ); } // Fin constructor
// Clase para manejar las opciones seleccionadas
private class ManejadorOpciones implements ItemListener
{
public void itemStateChanged ( ItemEvent evento)
{
if (negro.isSelected())
{ areaDibujo.colorSeleccion = Color.BLACK; }
if (azul.isSelected())
{ areaDibujo.colorSeleccion = Color.BLUE; }
if (rojo.isSelected())
{ areaDibujo.colorSeleccion = Color.RED; }
if (verde.isSelected())
{ areaDibujo.colorSeleccion = Color.GREEN; }
if (rect.isSelected())
{ areaDibujo.formaSeleccion = 0; }
if (rectRd.isSelected())
{ areaDibujo.formaSeleccion = 1; }
if (ovalo.isSelected())
{ areaDibujo.formaSeleccion = 2; }
if (circulo.isSelected())
{ areaDibujo.formaSeleccion = 3; }
areaDibujo.borrar = false;
repaint();
}
}
// Clase para manejar las acciones a ejecutar
private class ManejadorBotones implements ActionListener
{
public void actionPerformed ( ActionEvent e )
{
if (e.getSource() == btn1)
{
areaDibujo.borrar = true;
repaint();
}
}
}
}