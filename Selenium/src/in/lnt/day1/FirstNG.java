package in.lnt.day1;

import org.testng.annotations.Test;

import browserSetup.BrowserSetup;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class FirstNG
{
	
	WebDriver driver;
	//Actions a = new Actions(driver);
	
 /* @Test(priority=1)
  public void f()
  {
	  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:9639024226117177160::NO:::");
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Oracle");
  }*/
  @Test(dataProvider="dp")
  public void login(String UN, String PWD) {
	  
	  driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:9639024226117177160::NO:::");
	  driver.findElement(By.xpath("//*[@ type='text']")).sendKeys(UN);;
	  driver.findElement(By.xpath("//*[@ type='password']")).sendKeys(PWD);;
	  driver.findElement(By.xpath("//*[@ value='Login']")).click();
	  //driver.findElement(By.xpath("//*[@ value='Login']"));
}
  @DataProvider
  public Object[][] dp(){
	  Object data[][] = new Object[2][2];
			  data[0][0] = "sys";
			  data[0][1] = "Newuser123";
			  data[1][0] = "sys";
			  data[1][1] = "Newuser123";
	     
	return data;
	  
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	 driver = BrowserSetup.browserStart("chrome");
  }
  

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

  /*@Test(priority=2,description="Search Box Detail Testing")
  public void searchBoxTest()
  {
	  WebElement e = driver.findElement(By.name("q"));
	  Assert.assertEquals(e.isEnabled(), true);
	  Assert.assertEquals(e.isDisplayed(), true);
	  Assert.assertEquals(e.getAttribute("maxlength"),"2048");
  }*/
}
