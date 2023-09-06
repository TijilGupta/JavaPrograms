package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
public static void main(String[]args) throws IOException  {
	FileInputStream fs =new FileInputStream(new File("C:\\\\Users\\\\home\\\\Desktop\\\\WriteInExcel.xlsx"));
    XSSFWorkbook wb=new XSSFWorkbook(fs);//workbook
	XSSFSheet sheet = wb.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(0);
	XSSFCell cell=row.getCell(0);
	String data=cell.getStringCellValue();
	System.out.println(data);
	String data1=sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data1);
	int rows=sheet.getLastRowNum();
	int cols=sheet.getRow(0).getLastCellNum();
	System.out.println("rows"+rows);
	System.out.println("cols"+cols);
	for(int r=0; r<=rows; r++)
		for(int c=0; c<cols; c++) {
			
			System.out.print(sheet.getRow(r).getCell(c).getStringCellValue()+" ");
		
		}
	System.out.println();
}
}
