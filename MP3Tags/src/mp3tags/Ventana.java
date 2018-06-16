/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp3tags;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author ClaudiaV
 */
public class Ventana extends JFrame{
    
    private JLabel title, space,etq_good;
    private JTextArea desc_text;
    private JTextField mp3_dir;
    private JButton start_b;
    protected Tagging frameTag;
    ID3v2 id3v2Tag;
    Mp3File mp3file;
    
    Container contenedor = getContentPane();
    GridBagConstraints c = new GridBagConstraints();
    public Ventana(){
        super ("MP3 Tags - ID3v2.3.0");
        
        contenedor.setLayout(new GridBagLayout());
        
        //Título        
        title = new JLabel("¡Bienvenido!");
        title.setFont(new Font("Serif", Font.BOLD, 20));
        c.gridx=0;
        c.gridy=0;
        contenedor.add(title,c);
        
        //Texto descriptivo de la aplicación
        desc_text = new JTextArea("Esta aplicación permite agregar o editar información en archivos MP3 bajo el estándar ID3v2.3.0."
                + "\nIntroduzca la dirección completa del archivo MP3 que desea manejar:\n");
        desc_text.setBackground(this.getBackground());
        c.gridy=1;
        contenedor.add(desc_text,c);
        
        //Campo para ingresar la dirección del archivo mp3
        mp3_dir = new JTextField ("     Escriba aquí la dirección     ");
        mp3_dir.setToolTipText("Ejemplo: C:\\Users\\MiNombre\\Music\\Canción1.mp3");
        c.gridy=2;
        contenedor.add(mp3_dir,c);
        
        //Etiqueta vacía para agregar separación
        space = new JLabel(" ");
        c.gridy=3;
        contenedor.add(space,c);
        
        //Botón - Comenzar
        start_b = new JButton("Comenzar");
        c.gridy=4;
        contenedor.add(start_b,c);
        
        //Manejador de eventos para el botón
        listener_start list_start_b = new listener_start();
        start_b.addActionListener(list_start_b);
        
        
        setSize(700,250);
        //setResizable(false);
        setVisible(true);
    }
    
    private class listener_start implements ActionListener{
        public void actionPerformed ( ActionEvent evento){
            
            try{
            //Debe verificarse que no existen problemas con el archivo antes de pasar a la ventana de etiquetado
            mp3file = new Mp3File(mp3_dir.getText());
                                        
            //Limpiar la ventana
            title.setVisible(false);
            start_b.setVisible(false);
            desc_text.setVisible(false);
            mp3_dir.setVisible(false);
            contenedor.removeAll();
            
            //Ampliar la ventana
            setSize(800,500);
            
            //Agregar campos de información
            frameTag = new Tagging(contenedor);
            
            //Crear un objeto ID3v2 y verificar si el mp3 posee una etiqueta de tal tipo
            //ID3v2 id3v2Tag;
            if (mp3file.hasId3v2Tag()) {
        	id3v2Tag =  mp3file.getId3v2Tag();
                
                //Mostrar datos en los campos de texto
                frameTag.artist_f.setText(id3v2Tag.getArtist());
                frameTag.song_f.setText(id3v2Tag.getTitle());
                frameTag.genre_f.setText(id3v2Tag.getGenreDescription());
                frameTag.album_f.setText(id3v2Tag.getAlbum());
                frameTag.year_f.setText(id3v2Tag.getYear());
                frameTag.composer_f.setText(id3v2Tag.getComposer());
                frameTag.org_artist_f.setText(id3v2Tag.getOriginalArtist());
                frameTag.URL_f.setText(id3v2Tag.getUrl());
                frameTag.comments_f.setText(id3v2Tag.getComment());
                // FALTA IMAGEN frameTag.image_f.setText(id3v2Tag.get);
                frameTag.copyright_f.setText(id3v2Tag.getCopyright());
                frameTag.track_f.setText(id3v2Tag.getTrack());
                //FALTA LETRA frameTag.lyrics_f.setText(id3v2Tag.get);               
            } else {
        	id3v2Tag = new ID3v24Tag();
        	mp3file.setId3v2Tag(id3v2Tag);
                }           
                                    
            //Manejador de eventos para el botón 'Escribir en archivo mp3'
            listener_write list_write_b = new listener_write();
            frameTag.write_b.addActionListener(list_write_b);
            }
            catch(Exception e){
                //Error con el archivo
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo, asegúrese de que la dirección es válida", 
                    "", JOptionPane.ERROR_MESSAGE);
            }           
        }        
    }
    
    private class listener_write implements ActionListener{
        public void actionPerformed ( ActionEvent evento){
            
            //Escribir datos al archivo mp3
            
            Genero textoGenero = new Genero();
            int numGenero = textoGenero.EmparejarGenero(frameTag.genre_f.getText());
            
            id3v2Tag.setTrack(frameTag.track_f.getText());
            id3v2Tag.setArtist(frameTag.artist_f.getText());
            id3v2Tag.setTitle(frameTag.song_f.getText());
            id3v2Tag.setAlbum(frameTag.album_f.getText());
            id3v2Tag.setYear(frameTag.year_f.getText());
            id3v2Tag.setGenre(numGenero);
            id3v2Tag.setComment(frameTag.comments_f.getText());
            id3v2Tag.setComposer(frameTag.composer_f.getText());
            id3v2Tag.setOriginalArtist(frameTag.org_artist_f.getText());
            id3v2Tag.setUrl(frameTag.URL_f.getText());
            
            try { 
               
                //imagen
                String direccion=frameTag.image_f.getText();
                File archivoPortada= new File(direccion);
                byte[] fileContent = Files.readAllBytes(archivoPortada.toPath());
                id3v2Tag.setAlbumImage(fileContent,"imagenCaratula");
                
            } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Error al abrir el archivo, asegúrese de que la dirección es válida", 
                    "", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
            //Falta Lyrics
            id3v2Tag.setCopyright(frameTag.copyright_f.getText());

            try{
                //Ver como sobreescribir archivo!!!!
                mp3file.save("Prueba.mp3");
                //Mensaje de éxito
                JOptionPane.showMessageDialog(null, "La información fue escrita con éxito en el archivo mp3", 
                        "", JOptionPane.INFORMATION_MESSAGE);
                
                frameTag.write_b.setEnabled(false);
                frameTag.etq1.setText("Finalizado");
                frameTag.newsong_b.setText("Nueva canción");
            } 
            catch(Exception e){
                
                //Manejar excepción
            }

        }
    }
}
