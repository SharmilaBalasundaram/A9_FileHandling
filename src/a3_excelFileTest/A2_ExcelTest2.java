package a3_excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A2_ExcelTest2 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sharmi\\Desktop\\sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");
		
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		
		//readcell
		String data=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		
	}

}
