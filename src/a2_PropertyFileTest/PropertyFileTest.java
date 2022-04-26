package a2_PropertyFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyFileTest {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\Files\\sample.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.get("username"));

		Enumeration e=prop.keys();
		
		while (e.hasMoreElements()){
		String key=	(String) e.nextElement();
		System.out.println(key+"-"+prop.getProperty(key));
		}
	}
}
