/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3tags;



public class NotSupportedException extends BaseException {

	private static final long serialVersionUID = 1L;
	
	public NotSupportedException() {
		super();
	}
	
	public NotSupportedException(String message) {
		super(message);
	}
	
	public NotSupportedException(String message, Throwable cause) {
		super(message, cause);
	}
}