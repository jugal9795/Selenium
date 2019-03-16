package in.lnt.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginlogout 
{

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\AutomationTesting\\Jars\\chromedriver_win32(4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:11055808387013508250::NO:");
	driver.findElement(By.name("p_t01")).sendKeys("sys");
	driver.findElement(By.name("p_t02")).sendKeys("Newuser123");
	driver.findElement(By.xpath("//*[@id=\"wwvFlowForm\"]/div[6]/table/tbody/tr/td[3]/table[2]/tbody/tr/td/input[1]")).click();
    driver.findElement(By.linkText("SQL")).click();
    driver.findElement(By.linkText("SQL Commands")).click();
    
	driver.findElement(By.xpath("//*[@id=\"P1003_SQL_COMMAND1\"]")).sendKeys("select * from tab");
    
	   driver.findElement(By.xpath("//*[@id=\"R149883011479458110\"]/tbody/tr/td[4]/input")).click();
	
	Thread.sleep(4000);
	
	driver.quit();
	
}
}
