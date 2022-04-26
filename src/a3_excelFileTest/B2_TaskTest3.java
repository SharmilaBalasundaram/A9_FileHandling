package a3_excelFileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B2_TaskTest3 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\Files\\task_TextfileToExcel.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String x="";
		
		//excel create sheet
		File ef=new File("C:\\Users\\sharmi\\Desktop\\learning.xlsx");
		FileInputStream fis=new FileInputStream(ef);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		
		while((x=br.readLine())!=null) {
			System.out.println(br.readLine());
			XSSFSheet sheet= workbook.createSheet(x);
			sheet.createRow(1).createCell(1).setCellValue(x);
			
		}
		br.close();
	}

	// not expected output came
		
	}

