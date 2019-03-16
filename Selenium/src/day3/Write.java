package day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
public static void main(String[] args) throws Exception {
	
	FileInputStream fin=new FileInputStream("\\\\Infva06621\\Share Folder\\AutomationTesting\\Simmi.xlsx");
	
	XSSFWorkbook book =new XSSFWorkbook(fin);
	XSSFSheet sheet=book.getSheet("Sheet1");
	
	sheet.getRow(3).createCell(1).setCellValue("LNT");
	
	FileOutputStream fout=new FileOutputStream("\\\\\\\\Infva06621\\\\Share Folder\\\\AutomationTesting\\\\Simmi.xlsx");
	book.write(fout);
	
}
}
