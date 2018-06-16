/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3tags;


import java.nio.ByteBuffer;

public class ByteBufferUtils {

    public static String extractNullTerminatedString(ByteBuffer bb) {
        int start = bb.position();

        byte[] buffer = new byte[bb.remaining()];

        bb.get(buffer);

        String s = new String(buffer);
        int nullPos = s.indexOf(0);

        s = s.substring(0, nullPos);

        bb.position(start + s.length() + 1);

        return s;
    }

}