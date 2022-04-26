package a1_textFileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A6_AllTextReadFile {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\Files\\sample.txt");
		System.out.println(f.exists());
		
		if(!f.exists()){
			f.createNewFile();
			System.out.println("Your file is created...");
		}else{
			System.out.println("File is already exists");
		}
		
		
		//Read File....
        FileReader fr=new FileReader(f);
        BufferedReader br= new BufferedReader(fr);
        
        /*
        for (int i=0;i<3;i++) {
        System.out.println(br.readLine());
        }
        */
        
        String st;
        while ((st=br.readLine()) !=null){
        	System.out.println(st);
        	
        } 
        
        br.close();
   }
  
        }

       