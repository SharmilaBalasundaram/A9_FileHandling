package a1_textFileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A5_ReadFileText {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\Files\\sample.txt");
		System.out.println(f.exists());
		
		if(!f.exists()){
			f.createNewFile();
			System.out.println("Your file is created...");
		}else{
			System.out.println("File is already exists");
		}
		
		//WriteFile....
		
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("I will become Automation Tester like my jaanu, ");
		bw.newLine();
		bw.newLine();
		bw.write("Will place in good company like him");
		bw.close();
		
		//Read File....
        FileReader fr=new FileReader(f);
        BufferedReader br= new BufferedReader(fr);
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());

        br.close();
	}

}
