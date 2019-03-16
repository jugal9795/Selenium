package day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import browserSetup.BrowserSetup;

public class Companies {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = BrowserSetup.browserStart("chrome","https://www.nseindia.com/");
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
FileInputStream fin=new FileInputStream("mi2.D:\\Simxlsx");
		
		XSSFWorkbook book =new XSSFWorkbook(fin);
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		for(int i=0;i<=sheet.getLastRowNum();i++) 
		{
		String data=sheet.getRow(i).getCell(0).toString();
		System.out.print(data);
		
		driver.findElement(By.id("keyword")).clear();
		driver.findElement(By.id("keyword")).sendKeys(data);
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+data+"')]"))).click().perform();
		TakesScreenshot shot=(TakesScreenshot) driver;
		
		File src=shot.getScreenshotAs(OutputType.FILE);
		BrowserSetup.getScreenShot(data);
		FileHandler.copy(src,new File(".\\Sim.png"));
	
		}		
}
}