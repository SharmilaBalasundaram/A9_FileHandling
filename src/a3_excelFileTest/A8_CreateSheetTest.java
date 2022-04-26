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

public class A8_CreateSheetTest {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\sharmi\\Desktop\\learning.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.createSheet("selenium");
		XSSFRow newRow=sheet.createRow(5);
        XSSFCell newCell5=newRow.createCell(5);
        XSSFCell newCell6= newRow.createCell(6);
        newCell5.setCellValue("Ishanika");
        newCell6.setCellValue("december 10,2021");
        FileOutputStream fos=new FileOutputStream(f);
        workbook.write(fos);;
        fos.close();
	}

}
