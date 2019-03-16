package day3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browserSetup.BrowserSetup;

public class Read {
	public static void main(String[] args)throws Exception
	{
		WebDriver driver=	BrowserSetup.browserStart("chrome","http://127.0.0.1:8080/htmldb/f?p=4550:11:12052024886449178888::NO:::");
		FileInputStream fin=new FileInputStream("D:\\Simmi.xlsx");
		
		XSSFWorkbook book =new XSSFWorkbook(fin);
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		for(int i=0;i<=sheet.getLastRowNum();i++) {
		
		String data=sheet.getRow(i).getCell(0).toString();
		System.out.print(data);
		
		String data1=sheet.getRow(i).getCell(1).toString();
		System.out.print(data1);
		
		driver.findElement(By.id("P11_USERNAME")).clear();
		driver.findElement(By.id("P11_USERNAME")).sendKeys(data);
		driver.findElement(By.id("P11_PASSWORD")).clear();
		driver.findElement(By.id("P11_PASSWORD")).sendKeys(data1);
		driver.findElement(By.xpath("/html/body/form/div[6]/table/tbody/tr/td[3]/table[2]/tbody/tr/td/input[1]")).click();
		
		if(driver.getTitle().equals("Oracle"))
		{
			driver.findElement(By.xpath("/html/body/form/a[4]")).click(); //Logout
			driver.findElement(By.linkText("Login")).click();
			sheet.getRow(i).createCell(2).setCellValue("Login Successful");
		}
		else
		{
			System.out.println("Error Login");
			sheet.getRow(i).createCell(2).setCellValue("Login Failed");
		}
		FileOutputStream fout=new FileOutputStream("D:\\\\Simmi.xlsx");
		book.write(fout);
//		String data2=sheet.getRow(i).getCell(1).toString();
//		System.out.println(" "+data2);
		}
	}
}

