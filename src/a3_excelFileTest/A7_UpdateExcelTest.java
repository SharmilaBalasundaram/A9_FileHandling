package a3_excelFileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A7_UpdateExcelTest {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\sharmi\\Desktop\\learning.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);
		int colCount=sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		
		for (int row=0;row<rowCount+1;row++){
			for (int col=0;col<colCount;col++){
				if (sheet.getRow(row).getCell(col) != null){
				
				if (sheet.getRow(row).getCell(col).getCellType() == Cell.CELL_TYPE_STRING){
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		System.out.print(data+" ");
				} else if (sheet.getRow(row).getCell(col).getCellType() == Cell.CELL_TYPE_NUMERIC){
					int data=(int) sheet.getRow(row).getCell(col).getNumericCellValue();
					System.out.print(data+" ");
				}
				} else {
					System.out.print(" empty ");
				}
		} System.out.println();
		}

		//update...
		FileOutputStream fos= new FileOutputStream(f);
		sheet.getRow(1).getCell(1).setCellValue("Sharmila");
		sheet.getRow(1).getCell(2).setCellValue("Chennai");

		workbook.write(fos);
		fos.close();
		
	}
}
