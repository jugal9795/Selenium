package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import in.lnt.day1.Base;


public class Scrolling extends Base {

  @Test
  public void f() throws Exception
  { 
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	 driver.get("https://www.seleniumhq.org");
	
	 js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("Selenium blog")));
	 Thread.sleep(4000);
	 
	 js.executeScript("window.scrollBy(0,-700)");
	 Thread.sleep(4000);
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
	  Thread.sleep(4000);
	  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	  Thread.sleep(4000);
  }
}
