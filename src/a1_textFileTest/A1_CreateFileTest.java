package a1_textFileTest;

import java.io.File;
import java.io.IOException;

public class A1_CreateFileTest {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\Files\\sample.txt");
		f.createNewFile();
	}

}
