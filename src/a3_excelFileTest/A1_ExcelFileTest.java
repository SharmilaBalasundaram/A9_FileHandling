package a3_excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1_ExcelFileTest {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\sharmi\\workspace\\A9_FileHandling\\Files\\sample.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Home");
		
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		int colcount=sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		
	}

}
