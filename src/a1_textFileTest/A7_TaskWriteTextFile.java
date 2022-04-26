package a1_textFileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A7_TaskWriteTextFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\Files\\looping.txt");
		System.out.println(f.exists());
		
		if(!f.exists()){
			f.createNewFile();
			System.out.println("File is now cretaed");
		}else {
			System.out.println("File already exist");
		}
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i=0;i<=1000;i++){
		bw.write("VCentry"+i);
		bw.newLine();
		System.out.println("Vcentry"+i);
		}
		bw.close();
		
	}
	
}
