/*

 */
package workanasep;
import com.sun.javafx.Utils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import jdk.nashorn.internal.runtime.Source;
/**
 *
 * @author Jhonnnathan
 */
public class WorkanaSep extends javax.swing.JFrame {

    /**
     * Creates new form Ven
     */
    public WorkanaSep() {
        initComponents();
        setTitle("Ventana");
        setResizable(false);
        setLocationRelativeTo(null);
        text1.setVisible(false);
        text2.setVisible(false);
        text3.setVisible(false);
        text4.setVisible(false);
        clavess.setVisible(false);
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
    }

    /**
    
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opciones = new javax.swing.ButtonGroup();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Radio1 = new javax.swing.JRadioButton();
        Radio2 = new javax.swing.JRadioButton();
        Radio3 = new javax.swing.JRadioButton();
        Radio4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        text3 = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        text4 = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        clavess = new javax.swing.JPasswordField();

        jTextField4.setText("jTextField1");

        jLabel4.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Opciones.add(Radio1);
        Radio1.setText("Plantilla 1");
        Radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio1ActionPerformed(evt);
            }
        });

        Opciones.add(Radio2);
        Radio2.setText("Plantilla 2");
        Radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio2ActionPerformed(evt);
            }
        });

        Opciones.add(Radio3);
        Radio3.setText("Plantilla 3");

        Opciones.add(Radio4);
        Radio4.setText("Plantilla 4");
        Radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio4ActionPerformed(evt);
            }
        });

        jButton1.setText("Comenzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        text1.setText("jTextField1");
        text1.setEnabled(false);
        text1.setInheritsPopupMenu(true);
        text1.setOpaque(false);
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setText("Acumulado");
        label1.setEnabled(false);

        text2.setText("jTextField1");
        text2.setEnabled(false);
        text2.setInheritsPopupMenu(true);
        text2.setOpaque(false);

        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setText("Acumulado");
        label2.setEnabled(false);

        text3.setText("jTextField1");
        text3.setEnabled(false);
        text3.setInheritsPopupMenu(true);
        text3.setOpaque(false);

        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setText("Acumulado");
        label3.setEnabled(false);

        text4.setText("jTextField1");
        text4.setEnabled(false);
        text4.setInheritsPopupMenu(true);
        text4.setOpaque(false);
        text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text4ActionPerformed(evt);
            }
        });

        label4.setBackground(new java.awt.Color(255, 255, 255));
        label4.setText("Acumulado");
        label4.setEnabled(false);

        label5.setBackground(new java.awt.Color(255, 255, 255));
        label5.setText("ClaveAdmin");
        label5.setEnabled(false);

        clavess.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Radio4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4)
                            .addGap(18, 18, 18)
                            .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Radio3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3)
                            .addGap(18, 18, 18)
                            .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Radio2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2)
                            .addGap(18, 18, 18)
                            .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(Radio1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label1)
                            .addGap(18, 18, 18)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label5)
                                .addGap(18, 18, 18)
                                .addComponent(clavess, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Radio1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Radio2)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Radio3)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Radio4)
                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5)
                    .addComponent(clavess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        text1.getAccessibleContext().setAccessibleParent(jButton2);
        label1.getAccessibleContext().setAccessibleParent(jButton2);
        text2.getAccessibleContext().setAccessibleParent(jButton2);
        label2.getAccessibleContext().setAccessibleParent(jButton2);
        text3.getAccessibleContext().setAccessibleParent(jButton2);
        label3.getAccessibleContext().setAccessibleParent(jButton2);
        text4.getAccessibleContext().setAccessibleParent(jButton2);
        label4.getAccessibleContext().setAccessibleParent(jButton2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radio1ActionPerformed

    private void Radio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radio4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        seleccion_opcion();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radio2ActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text4ActionPerformed
       ; // TODO add your handling code here:
    }//GEN-LAST:event_text4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       clavess.setVisible(true);
       label5.setVisible(true);
        
               
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void seleccion_opcion(){
        
        if(Radio1.isSelected()){
              //JOptionPane.showMessageDialog(null, "A basic JOptionPane message dialog");
            
              Lectura arc=new Lectura();
              arc.cargarArchivo();
        }else if(Radio2.isSelected()){
        Lectura arc=new Lectura();
              arc.cargarArchivo();
        
    }else if(Radio3.isSelected()){
          Lectura arc=new Lectura();
              arc.cargarArchivo();
    }else if(Radio4.isSelected()){
        Lectura arc=new Lectura();
              arc.cargarArchivo();
       } 
        }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorkanaSep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkanaSep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkanaSep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkanaSep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkanaSep().setVisible(true);
            }
        });
    }
    
public class Lectura    {
    public void cargarArchivo() {
       abrir();
   }
    private void abrir() {
  //ruta del archivo en el pc
        variables cons = new variables();
        if(Radio1.isSelected()){
  
 String file = new String("../../../Desktop/app/plantilla/plantilla1.docx"); 
  

  try{ 
       lea ff=new lea(cons);
       
       contador1=1+cons.getCont1();
       cons.setCont1(contador1);
       escribe hh=new escribe(cons);
       
   text1.setVisible(true);
   label1.setVisible(true);
   text1.setText( String.valueOf(contador1));
   JOptionPane.showMessageDialog(null, contador1);
   //definiendo la ruta en la propiedad file
   Runtime.getRuntime().exec("cmd /c start "+ file);
     
   }catch(IOException e){
      e.printStackTrace();
   } 
        
        }else if(Radio2.isSelected()){
  String file2 = new String("../../../Desktop/app/plantilla/plantilla2.docx"); 
  try{ 
      lea ff=new lea(cons);
       
       contador2=1+cons.getCont2();
       cons.setCont2(contador2);
       escribe hh=new escribe(cons);
       
   text2.setVisible(true);
   label2.setVisible(true);
   text2.setText( String.valueOf(contador2));
   //definiendo la ruta en la propiedad file
   Runtime.getRuntime().exec("cmd /c start "+ file2);
     
   }catch(IOException e){
      e.printStackTrace();
   } 
        }else if(Radio3.isSelected()){
  String file3 = new String("../../../Desktop/app/plantilla/plantilla3.docx"); 
  
        try{ 
              lea ff=new lea(cons);
       
       contador3=1+cons.getCont3();
       cons.setCont3(contador3);
       escribe hh=new escribe(cons);
       
   text3.setVisible(true);
   label3.setVisible(true);
   text3.setText( String.valueOf(contador3));
            
   //definiendo la ruta en la propiedad file
   Runtime.getRuntime().exec("cmd /c start "+file3);
     
   }catch(IOException e){
      e.printStackTrace();
   } }else if(Radio4.isSelected()){
  String file4 = new String("../../../Desktop/app/plantilla/plantilla4.docx"); 
  
 try{ 
   //definiendo la ruta en la propiedad file
       lea ff=new lea(cons);
       
       contador4=1+cons.getCont4();
       cons.setCont4(contador4);
       escribe hh=new escribe(cons);
       
   text4.setVisible(true);
   label4.setVisible(true);
   text4.setText( String.valueOf(contador4));
     
   Runtime.getRuntime().exec("cmd /c start "+file4);
     
   }catch(IOException e){
      e.printStackTrace();
   } 
    }

  }
 }
   




    private int variable;
    private int contador1, contador2, contador3,contador4;
    private int band=0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Opciones;
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JRadioButton Radio3;
    private javax.swing.JRadioButton Radio4;
    private javax.swing.JPasswordField clavess;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    // End of variables declaration//GEN-END:variables
}
   



