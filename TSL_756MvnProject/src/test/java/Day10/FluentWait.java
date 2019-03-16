package Day10;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import day8.Base1;

public class FluentWait extends Base1 {
  @Test
  public void f() 
  {
	  driver.get("http://google.com");
	  
	  
	/*  Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			  .withTimeout(30,TimeUnit.SECONDS)
			  .pollingEvery(5,TimeUnit.SECONDS)
			  .ignoring(NoSuchElementException.class)
	  */
	  
	  
	  
  }
}
