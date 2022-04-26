package a3_excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A4_ExcelTest4 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sharmi\\Desktop\\learning.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		
		//readcell
		for (int row=0;row<rowCount+1;row++){
			for (int col=0;col<colCount;col++){	
				
				//format your cell
			sheet.getRow(row).getCell(col).setCellType(Cell.CELL_TYPE_STRING);
			String data=sheet.getRow(row).getCell(col).getStringCellValue();
			System.out.print(data+" ");
			}		
			System.out.println();
		}
		
	}

}
