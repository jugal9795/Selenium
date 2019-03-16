import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	Workbook book;

	Excel (String FileName) throws IOException{
		FileInputStream file = new FileInputStream(FileName);
		if (FileName.endsWith(".xls"))
		{
			book = new HSSFWorkbook(file);

		}
		else if(FileName.endsWith(".xlsx"))
		{
			book = new XSSFWorkbook(file);

		}
	}
	public String read (String SheetName, int row , int cell)
	{
		Sheet sh = book.getSheet(SheetName);
		String data = sh.getRow(row).getCell(cell).toString();
		if(data.endsWith(".0"))
		{
			data = data.split("\\.")[0];
		}
		return data;
	}

	public int RowCount (String SheetName)
	{
		return book.getSheet(SheetName).getLastRowNum();

	}
	public int CellCount (String SheetName, int row)
	{
		return book.getSheet(SheetName).getRow(row).getLastCellNum();
	}
}
