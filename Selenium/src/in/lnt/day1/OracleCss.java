package in.lnt.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleCss
{

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\AutomationTesting\\Jars\\chromedriver_win32(4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:11055808387013508250::NO:");
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sys");
			
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Newuser123");
	
	driver.findElement(By.cssSelector("input[value='Login']")).click();
	driver.findElement(By.cssSelector("a.dhtmlBottom")).click();
	
	
	//driver.findElement(By.cssSelector("img[title='Logout']")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("a.htmldbInstruct")).click();
	
	
	
/*	driver.findElement(By.linkText("SQL")).click();
    driver.findElement(By.linkText("SQL Commands")).click();
    
	driver.findElement(By.xpath("//*[@id=\"P1003_SQL_COMMAND1\"]")).sendKeys("select * from tab");
    
	   driver.findElement(By.xpath("//*[@id=\"R149883011479458110\"]/tbody/tr/td[4]/input")).click();
	*/
	
	
	driver.quit();
	
}
}
