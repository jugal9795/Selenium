package day3;

import org.testng.annotations.Test;

import browserSetup.BrowserSetup;
import util.Excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	  @Test(dataProvider="dp")
  public void f(String n, String s) {
		  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:9639024226117177160::NO:::");
		  driver.findElement(By.xpath("//*[@ type='text']")).sendKeys(n);;
		  driver.findElement(By.xpath("//*[@ type='password']")).sendKeys(s);;
		  driver.findElement(By.xpath("//*[@ value='Login']")).click();
			driver.findElement(By.linkText("Logout")).click();;
			driver.findElement(By.partialLinkText("Log")).click();;
  }

  @DataProvider
  public Object[][] dp() throws IOException {
	  Object data[][]=new Object[5][2];
	  Excel e =new Excel("D:\\Simmi.xlsx");
	  for(int i=0;i<=e.rowCount("Sheet1");i++)
	  {
		  data[i][0]=e.Read("Sheet1", i, 0);
		  data[i][1]=e.Read("Sheet1", i, 1);
	  }
	
  return data;
  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = BrowserSetup.browserStart("chrome");
  }

  @AfterTest
  public void afterTest() {
	  	driver.close();
  
  }
  

}


//WebDriver driver = BrowserSetup.browserStart("chrome","https://www.nseindia.com/");
//Actions action = new Actions(driver);
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//FileInputStream fin=new FileInputStream("mi2.D:\\Simxlsx");
//
//XSSFWorkbook book =new XSSFWorkbook(fin);
//XSSFSheet sheet=book.getSheet("Sheet1");
//
//for(int i=0;i<=sheet.getLastRowNum();i++) 
//{
//String data=sheet.getRow(i).getCell(0).toString();
//System.out.print(data);
//
