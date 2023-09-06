package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel 
{
	public static void main(String[]args) throws IOException {
	
	FileInputStream fs= new FileInputStream(new File("C:\\\\Users\\\\home\\\\Desktop\\\\WriteInExcel.xlsx"));
	XSSFWorkbook wb=new XSSFWorkbook(fs);//workbook
	XSSFSheet sheet = wb.getSheet("Sheet1");
    XSSFRow row=sheet.getRow(0);
	if(row==null)
		  row=sheet.createRow(0);
	XSSFCell cell=row.getCell(3);
		if(cell==null)
			cell=row.createCell(3);
	cell.setCellValue("anand");
	FileOutputStream fo=new FileOutputStream(new File("C:\\\\Users\\\\home\\\\Desktop\\\\WriteInExcel.xlsx"));
			wb.write(fo);
}
}
