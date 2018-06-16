/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3tags;


public class Version {
	private static final String VERSION;
	private static final String URL = "http://github.com/mpatric/mp3agic";
	
	static { // get version from JAR manifest
		String implementationVersion =  Version.class.getPackage().getImplementationVersion();
		VERSION = implementationVersion != null ? implementationVersion : "UNKNOWN-SNAPSHOT";
	}
	
	public static String asString() {
		return getVersion() + " - " + getUrl(); 
	}	

	public static String getVersion() {
		return VERSION;
	}
	
	public static String getUrl() {
		return URL;
	}
}