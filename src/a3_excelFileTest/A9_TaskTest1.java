package a3_excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A9_TaskTest1 {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\sharmi\\Desktop\\learning.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.createSheet();
		
		for (int i=0;i<=100;i++){
		
			XSSFRow newRow = sheet.createRow(i);
			XSSFCell data = newRow.createCell(0); 
			data.setCellValue("Vcentry"+i);
			}
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		
		
		
		
		
	}
}
