package day3;

import org.testng.annotations.Test;

import browserSetup.BrowserSetup;
import util.Excel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FailScreenShot {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  driver.get("http://127.0.0.1:8080/htmldb");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys(n);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(s);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		driver.findElement(By.linkText("Logout")).click();;
		driver.findElement(By.partialLinkText("Log")).click();;
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod(ITestResult result) {
	  System.out.println(ITestResult.FAILURE);
	  System.out.println(ITestResult.SUCCESS);
	  System.out.println(ITestResult.SKIP);
	  if(result.getStatus()==ITestResult.FAILURE) {
		  System.out.println("Taking ScreenShot");
	  BrowserSetup.getScreenShot(result.getName());
	  }
  }


  @DataProvider
  public Object[][] dp()  {
	  {
			
		  Object data[][]=new Object[5][2];	  
		  Excel excel=new Excel("D:\\Simmi.xlsx");
			for(int i=0;i<=excel.rowCount("Sheet1");i++)
			{
		  data[i][0]=excel.Read("Sheet1",i,0);
		  data[i][1]=excel.Read("Sheet1",i,1);
			}
		 	   return data;
		  }
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
