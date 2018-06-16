/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication8;
import JID3.org.blinkenlights.jid3;;

/**
 *
 * @author jhon
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
public void readTags(String file) {
  MediaFile mediaFile = new MP3File(new File(file));
  try {
   for (Object obj : mediaFile.getTags()) {
    if (obj instanceof ID3V1_0Tag)
     readID3V1Tags(obj);
    else if (obj instanceof ID3V2_3_0Tag)
     readID3V2_3Tags(obj);
   }
  } catch (ID3Exception e1) {
   e1.printStackTrace();
  }
 }
    
}
