package day9;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import in.lnt.day1.Base;
import util.KeyWords;

public class Execute2 extends Base {
  @Test
  public void f() throws Exception
  {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  KeyWords keyWords=new KeyWords(driver);
	  keyWords.openUrl("https://opensource-demo.orangehrmlive.com/");
	  keyWords.type("txtUsername_name", "admin");
	  keyWords.type("txtPassword_id", "admin123");
	  keyWords.click("//*[@type='submit']_xpath");
	  //Thread.sleep(3000);

	  keyWords.click("//*[@id='welcome']_xpath");
	  keyWords.click("Logout_linktext");


	  
  }
}
