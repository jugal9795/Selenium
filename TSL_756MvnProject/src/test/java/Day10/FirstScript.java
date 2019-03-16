package Day10;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import browserSetup.BrowserSetup;
import day8.Base1;

public class FirstScript extends Base1 {
  @Test
  public void f() throws Exception {
	  
	  ExtentHtmlReporter htmlR = new ExtentHtmlReporter("Google.html");
			  htmlR.setAppendExisting(true);
			  
			  
	  ExtentReports ex = new ExtentReports();
	  ex.attachReporter(htmlR);
			  
	  ExtentTest test=ex.createTest("TitleTest");
	  test.info("Opening URL");
	  driver.get("http://google.com");
	  test.info("Checking title");
	  Assert.assertEquals(driver.getTitle(), "Google");
	  BrowserSetup.getScreenShot("akash");
	 test.pass("Title test pass");
	 test.addScreencastFromPath(".//akashFri_Mar_15_15_28_52_IST_2019.png");
	     ex.flush();
	  
	  
  }
}
//D:\akash\TSL_756MvnProject\allure-results