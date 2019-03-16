package in.lnt.day1;

import org.testng.annotations.Test;

import browserSetup.BrowserSetup;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Base {

public WebDriver driver;
  @BeforeTest()

  public void beforeTest() {
	 
		  driver = BrowserSetup.browserStart("firefox");
	
  }

  @AfterTest
  public void afterTest() {
driver.quit(); 
  }

}
