/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3tags;


public class InvalidDataException extends BaseException {
	
	private static final long serialVersionUID = 1L;

	public InvalidDataException() {
		super();
	}
	
	public InvalidDataException(String message) {
		super(message);
	}
	
	public InvalidDataException(String message, Throwable cause) {
		super(message, cause);
	}
}