/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hilocontador;
import javax.swing.*;
/**
 *
 * @author Angel
 */
public class HiloContador extends Thread{
    private String id;
    private int inicializacion;
    private int tope;
    private boolean detenido;
    private boolean enPausa;
    private JTextField salida;
    
    public HiloContador(String id, int inicializacion, int tope, JTextField salida){
        super(id);
        this.id = id;
        this.inicializacion = inicializacion;
        this.tope = tope;
        this.salida = salida;
        enPausa = false;
        detenido = false;
    }

    @Override
    public void run() {
        int x = inicializacion;
        while(!detenido){
            try {
                if(!enPausa){
                    x = x+1;
                    salida.setText(x+"");
                    if (x == tope)
                        x = inicializacion;
                }
                sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
    
    
    
    
    public boolean getEnpausa(){
        return enPausa;
    }
    
    public void setEnPausa(boolean enPausa){
        this.enPausa = enPausa;
    }
    
    public boolean getDetenido(){
        return detenido;
    }
    
    public void setDetenido(boolean detenido){
        this.detenido = detenido;
    }
    
    
    
}
