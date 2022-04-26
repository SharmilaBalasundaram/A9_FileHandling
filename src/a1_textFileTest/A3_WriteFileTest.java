package a1_textFileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A3_WriteFileTest {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\Files\\sample.txt");
		System.out.println(f.exists());
		
		if(!f.exists()){
			f.createNewFile();
			System.out.println("Your file is created...");
		}else{
			System.out.println("File is already exists");
		}
		
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("I will become Automation Tester like my jaanu, ");
		bw.newLine();
		bw.write("Will place in good company like him");
		bw.close();

	}

}
