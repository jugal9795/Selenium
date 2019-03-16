package in.lnt.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		/*		System.setProperty("webdriver.gecko.driver","D:\\AutomationTesting\\Jars\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();	 */
	

	System.setProperty("webdriver.chrome.driver","D:\\AutomationTesting\\Jars\\chromedriver_win32(4)\\chromedriver.exe");
WebDriver driver2=new ChromeDriver();	 //*[@id="menu_documentation"]/a

	driver2.get("https://www.seleniumhq.org/");
	//driver2.findElement(By.linkText("Download")).click();
	driver2.findElement(By.name("q")).sendKeys("LNT");
Thread.sleep(3000);
	
String title=	driver2.getTitle();     

System.out.println("i am on"+title+"page");

driver2.quit();


	}
}
