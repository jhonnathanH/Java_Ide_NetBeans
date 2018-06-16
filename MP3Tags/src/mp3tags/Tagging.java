/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mp3tags;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ClaudiaV
 */
public class Tagging {
    
    protected JLabel title2,artist,song,year,genre,composer,album,org_artist,comments,URL,image,lyrics,copyright,track,etq1,etq2;
    protected JTextField mp3_dir, artist_f, song_f,genre_f,album_f,year_f,composer_f,org_artist_f,URL_f,comments_f,image_f,lyrics_f,copyright_f,track_f;
    protected JButton write_b, newsong_b;
    Integer i = new Integer(3);
    
    Container contenedor2;
    GridBagConstraints c = new GridBagConstraints();
    
    public Tagging(Container contenedor){
            
            contenedor2=contenedor;
                       
            //Título - Ventana edición        
            title2 = new JLabel("MP3 ID3 Tags");
            title2.setFont(new Font("Serif", Font.BOLD, 20));
            c.gridy=0;
            c.gridx = 2;
            contenedor2.add(title2,c);
            
            //Etiquetas para añadir separación
            etq1 = new JLabel(" ");
            etq1.setFont(new Font("Serif", Font.BOLD, 20));
            etq1.setForeground(Color.RED);
            c.gridy=1;
            c.gridx = 2;
            contenedor.add(etq1,c);
            
            etq2 = new JLabel("  ");
            c.gridy=i+14;
            contenedor.add(etq2,c);
            
            //Etiquetas - Campos de edición
            Dimension dlabel = new Dimension(125,20);
            Dimension dfield = new Dimension(150,20);
            
            //Artista
            artist = new JLabel("Artista/Intérprete:  ");
            artist.setPreferredSize(dlabel);
            artist.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx = 0;
            c.gridy=i;
            contenedor2.add(artist,c);
            
            artist_f = new JTextField ();
            artist_f.setPreferredSize(dfield);
            c.gridx=1;
            contenedor2.add(artist_f,c);
            
            //Nombre de la canción
            song = new JLabel("Nombre de canción:  ");
            song.setPreferredSize(dlabel);
            song.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=3;
            contenedor2.add(song,c);
            
            song_f = new JTextField ();
            song_f.setPreferredSize(dfield);
            c.gridx=4;
            contenedor2.add(song_f,c);
            
            //Género
            genre = new JLabel("Género:  ");
            genre.setPreferredSize(dlabel);
            genre.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=0;
            c.gridy=i+2;
            contenedor2.add(genre,c);
            
            genre_f = new JTextField ();
            genre_f.setPreferredSize(dfield);
            c.gridx=1;
            contenedor2.add(genre_f,c);
            
            //Album
            album = new JLabel("Albúm:  ");
            album.setPreferredSize(dlabel);
            album.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=3;
            contenedor2.add(album,c);
            
            album_f = new JTextField ();
            album_f.setPreferredSize(dfield);
            c.gridx=4;
            contenedor2.add(album_f,c);
            
            //Año
            year = new JLabel("Año:  ");
            year.setPreferredSize(dlabel);
            year.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=0;
            c.gridy=i+4;
            contenedor2.add(year,c);
            
            year_f = new JTextField ();
            year_f.setPreferredSize(dfield);
            c.gridx=1;
            contenedor2.add(year_f,c);
            
            //Compositor
            composer = new JLabel("Compositor:  ");
            composer.setPreferredSize(dlabel);
            composer.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=3;
            contenedor2.add(composer,c);
            
            composer_f = new JTextField ();
            composer_f.setPreferredSize(dfield);
            c.gridx=4;
            contenedor2.add(composer_f,c);
            
            //Artista original
            org_artist = new JLabel("Artista original:  ");
            org_artist.setPreferredSize(dlabel);
            org_artist.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=0;
            c.gridy=i+6;
            contenedor2.add(org_artist,c);
            
            org_artist_f = new JTextField ();
            org_artist_f.setPreferredSize(dfield);
            c.gridx=1;
            contenedor2.add(org_artist_f,c);
            
            //URL
            URL = new JLabel("Link:  ");
            URL.setPreferredSize(dlabel);
            URL.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=3;
            contenedor2.add(URL,c);
            
            URL_f = new JTextField ();
            URL_f.setPreferredSize(dfield);
            c.gridx=4;
            contenedor2.add(URL_f,c);
            
            //Comentarios
            comments = new JLabel("Comentarios:  ");
            comments.setPreferredSize(dlabel);
            comments.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=0;
            c.gridy=i+8;
            contenedor2.add(comments,c);
            
            comments_f = new JTextField ();
            comments_f.setPreferredSize(dfield);
            c.gridx=1;
            contenedor2.add(comments_f,c);
            
            //Imagen
            image = new JLabel("Dir. Imágen:  ");
            image.setPreferredSize(dlabel);
            image.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=3;
            contenedor2.add(image,c);
            
            image_f = new JTextField ();
            image_f.setPreferredSize(dfield);
            c.gridx=4;
            contenedor2.add(image_f,c);

            //Duración
            copyright = new JLabel("Copyright:  ");
            copyright.setPreferredSize(dlabel);
            copyright.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=0;
            c.gridy=i+10;
            contenedor2.add(copyright,c);
            
            copyright_f = new JTextField ();
            copyright_f.setPreferredSize(dfield);
            c.gridx=1;
            contenedor2.add(copyright_f,c);
            
            //No. de pista
            track = new JLabel("No. de pista:  ");
            track.setPreferredSize(dlabel);
            track.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=3;
            contenedor2.add(track,c);
            
            track_f = new JTextField ();
            track_f.setPreferredSize(dfield);
            c.gridx=4;
            contenedor2.add(track_f,c);            
            
            //Letra
            lyrics = new JLabel("Letra:  ");
            lyrics.setPreferredSize(dlabel);
            lyrics.setHorizontalAlignment(SwingConstants.RIGHT);
            c.gridx=0;
            c.gridy=i+12;
            contenedor2.add(lyrics,c);
            
            lyrics_f = new JTextField ();
            lyrics_f.setPreferredSize(new Dimension(550,200));
            c.gridwidth = 4;
            c.gridheight = 2;
            c.gridx=1;
            contenedor2.add(lyrics_f,c);
            
            //Botón - Escribir
            write_b = new JButton("Escribir en mp3");
            write_b.setPreferredSize(new Dimension(150,25));
            c.gridx=4;
            c.gridy=i+15;
            contenedor2.add(write_b,c);
            
            //Botón - Nueva canción
            newsong_b = new JButton("Cambiar canción");
            newsong_b.setPreferredSize(new Dimension(150,25));
            c.gridx=1;
            contenedor2.add(newsong_b,c); 
        
    }
}
