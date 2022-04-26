package a4_logFilesTest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A1_Sample{
	
	public static Logger log= LoggerFactory.getLogger(A1_Sample.class);
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\src\\a4_logFilesTest\\log4j.properties");
		
		log.error("Sample error123");
		log.info("Sample info123");
		
		
	}

}
