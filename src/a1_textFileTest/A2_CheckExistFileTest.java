package a1_textFileTest;

import java.io.File;
import java.io.IOException;

public class A2_CheckExistFileTest {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\Files\\sample.txt");
		System.out.println(f.exists());
		
		if(!f.exists()){
			f.createNewFile();
			System.out.println("Your file is created...");
		}else{
			System.out.println("File is already exists");
		}
	}

}
