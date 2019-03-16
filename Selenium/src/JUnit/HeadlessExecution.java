package JUnit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessExecution 
	{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//driver.get("https://www.seleniumhq.org/");
		
		
		System.setProperty("webdriver.firefox.driver", ".\\Drivers\\geckodriver.exe");
		FirefoxOptions op=new FirefoxOptions();
		op.addArguments("--headless");
		op.addArguments("--start-maximized");
		driver=new FirefoxDriver(op);
		
		driver.manage().window().maximize();
		
	}
	static WebDriver driver;
	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		driver.quit();
	}

	@Test
	public void test() 
	{
		driver.get("http://google.com");
		assertEquals("Google",driver.getTitle());
		assertTrue(driver.findElement(By.linkText("Maven users")).isDisplayed());
	}

}
