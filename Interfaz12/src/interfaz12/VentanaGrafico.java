/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz12;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class VentanaGrafico extends JPanel {
public Color colorSeleccion;
public int formaSeleccion;
public boolean borrar;
public VentanaGrafico() { super(); }
public void paint(Graphics t)
{
super.paint(t);
if ( !borrar )
{
t.setColor(colorSeleccion);
switch (formaSeleccion)
{
case 0:
t.fillRect((getWidth() - 300)/2,(getHeight() - 200)/2,300,200);
break;
case 1:
t.fillRoundRect((getWidth() - 300)/2,(getHeight() - 200)/2,300,200,45,45);
break;
case 2:
t.fillOval((getWidth() - 250)/2,(getHeight() - 150)/2,250,150);
break;
case 3:
t.fillOval((getWidth() - 250)/2,(getHeight() - 250)/2,250,250);
break;
}
}
}
}