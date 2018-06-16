/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hilocontador;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Angel
 */
public class GUI extends JFrame{

    private PanelContador v[];
    public GUI(int n){
        setTitle("Prueba Hilos Contadores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,350);
        Container contenedor = getContentPane();
        contenedor.setLayout( new GridLayout(n,1));
        
        v = new PanelContador[n];
        for (int i = 0; i < v.length; i++) {
         v[i] = new PanelContador();
         contenedor.add(v[i]);          
        }
        
    }
}
