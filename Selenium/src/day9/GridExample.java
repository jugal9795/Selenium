package day9;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridExample {
  @Test
  public void f() throws Exception 
  {
	  DesiredCapabilities dc=DesiredCapabilities.firefox();
	  dc.setPlatform(Platform.WINDOWS);
	  dc.setBrowserName("firefox");
	  
	  WebDriver driver=new RemoteWebDriver(new URL("http://192.168.100.174:4444/wd/hub"),dc);
	  driver.get("http://seleniumhq.org");
	  Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
	  
  }
  
  @BeforeTest
  @Parameters("browser")
  public void BeforeTest(String browser) throws Exception
  {
	  DesiredCapabilities dc=null;
	  if(browser.equalsIgnoreCase("firefox"))
	  {
		  dc=DesiredCapabilities.firefox();
		  dc.setPlatform(Platform.WINDOWS);
		  dc.setBrowserName("firefox");
	  }
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  dc=DesiredCapabilities.chrome();
		  dc.setPlatform(Platform.WINDOWS);
		  dc.setBrowserName("chrome");
	  }
  }
}
