/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3tags;


public class UnsupportedTagException extends BaseException {
	
	private static final long serialVersionUID = 1L;
	
	public UnsupportedTagException() {
		super();
	}
	
	public UnsupportedTagException(String message) {
		super(message);
	}
	
	public UnsupportedTagException(String message, Throwable cause) {
		super(message, cause);
	}
}
