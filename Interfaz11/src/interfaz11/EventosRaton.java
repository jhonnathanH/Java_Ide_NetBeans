/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */package interfaz11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventosRaton extends JFrame {
JButton btn1, btn2;
JLabel etq1, etq2, etq3, etq4;
int pos_x, pos_y;
boolean dibujar = false;
public EventosRaton ()
{ // Inicio constructor 
    super("Demostración eventos del ratón"); 
    Container contenedor = getContentPane(); contenedor.setLayout(new FlowLayout());
// Definición de etiqueta empleada para ilustrar los eventos
// del ratón mouseEntered y mouseExited
etq1 = new JLabel ("Prueba");
etq1.setHorizontalAlignment(SwingConstants.CENTER);
etq1.setOpaque(true);
etq1.setBackground(Color.BLUE);
etq1.setForeground(Color.WHITE);
etq1.setPreferredSize(new Dimension(250, 30));
contenedor.add( etq1 );
// Definición del botón utilizado para ilustrar el evento del ratón
// mouseClicked
btn1 = new JButton ("Botón 1");
btn1.setOpaque(true);
btn1.setBackground(Color.RED);
btn1.setForeground(Color.WHITE);
btn1.setPreferredSize(new Dimension(250, 30));
contenedor.add( btn1 );
// Definición de etiqueta empleada para ilustrar el evento del ratón
// mouseClicked y la identificación del botón del ratón presionado
etq2 = new JLabel ("Prueba");
etq2.setHorizontalAlignment(SwingConstants.CENTER);
etq2.setOpaque(true);
etq2.setBackground(Color.PINK);
etq2.setForeground(Color.BLACK);
etq2.setPreferredSize(new Dimension(250, 30));
contenedor.add( etq2 );
// Definición del botón utilizado para demostrar los eventos del ratón
// mousePressed y mouseDragged
btn2 = new JButton ("Dibujar");
btn2.setOpaque(true);
btn2.setBackground(Color.CYAN);
btn2.setForeground(Color.WHITE);
btn2.setPreferredSize(new Dimension(250, 30));
contenedor.add( btn2 );
// Definición de la etiqueta empleada para ilustrar el evento del ratón
// mouseMoved
etq3 = new JLabel ();
etq3.setHorizontalAlignment(SwingConstants.CENTER);
etq3.setOpaque(true);
etq3.setBackground(Color.MAGENTA);
etq3.setForeground(Color.WHITE);
etq3.setPreferredSize(new Dimension(250, 30));
contenedor.add( etq3 );
// Establecimiento del manejador de los eventos del ratón
MovimientosRaton ctrlRaton = new MovimientosRaton();
etq1.addMouseListener(ctrlRaton);
etq1.addMouseMotionListener(ctrlRaton);
btn1.addMouseListener(ctrlRaton);
btn1.addMouseMotionListener(ctrlRaton);
etq2.addMouseListener(ctrlRaton);
etq2.addMouseMotionListener(ctrlRaton);
this.addMouseListener(ctrlRaton);
this.addMouseMotionListener(ctrlRaton);
btn2.addMouseListener(ctrlRaton);
btn2.addMouseMotionListener(ctrlRaton);
setSize(400,400);
setVisible( true );
} // Fin constructor
private class MovimientosRaton implements MouseListener, MouseMotionListener
{ // Clase interna para manejar los eventos de ratón 
    public void mouseClicked ( MouseEvent e ) {
        if ( e.getSource() == btn1 ) { 
            btn1.setForeground(Color.YELLOW);
    
        btn1.setText("Mouse Clicked"); } if ( e.getSource() == etq2 )
{ 
    if (e.getButton() == 1) // Identifica el botón izquierdo 
    
    etq2.setText( "Botón Izquierdo"); else if (e.getButton() == 3) // Identifica el botón derecho 
        etq2.setText( "Botón Derecho"); else etq2.setText( "Otro Botón"); } if ( e.getSource() == btn2 ) {
            // Habilita/Deshabilita el dibujo con el ratón 
            dibujar = !dibujar; } }
public void mousePressed ( MouseEvent e ) { if ( dibujar ) { 
    // Identifica las coordenadas en las que se presionó un botón del ratón
    pos_x = e.getX(); pos_y = e.getY(); } }
public void mouseReleased ( MouseEvent e ) { System.out.println(String.valueOf(e.getClickCount())); }
public void mouseEntered ( MouseEvent e ) { if ( e.getSource() == etq1 ) { etq1.setBackground(Color.GREEN); etq1.setText("Mouse Entered"); } }
public void mouseExited ( MouseEvent e ) { if ( e.getSource() == etq1 ) { etq1.setBackground(Color.BLUE); etq1.setText("Mouse Exited"); } }
public void mouseDragged ( MouseEvent e ) { if (dibujar) { int x = e.getX(); int y = e.getY(); Graphics g = getGraphics(); g.drawLine(pos_x, pos_y, x, y); pos_x = x; pos_y = y; g.dispose(); } }
public void mouseMoved ( MouseEvent e )
{ etq3.setText ( "Posición del Ratón: x = " + String.valueOf( e.getLocationOnScreen().x) + " y = " + String.valueOf( e.getLocationOnScreen().y) ); }
}
}// Fin de la clase interna para manejar los eventos de ratón
