package in.lnt.day1;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
public static void main(String[] args) throws InterruptedException {
	
			System.out.println("Enter id");
			Scanner scan=new Scanner(System.in);
	        String id=scan.nextLine();
	        
	    	System.out.println("Enter password");
	       	    String pass=scan.nextLine();
	
	
	System.setProperty("webdriver.chrome.driver","D:\\AutomationTesting\\Jars\\chromedriver_win32(4)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1:8080/htmldb/f?p=4550:11:11055808387013508250::NO:");
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys(id);
			
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pass);
	
	driver.findElement(By.cssSelector("input[value='Login']")).click();

	if(driver.getTitle().equals("Oracle"))
	{
	     System.out.println("Login Successfull");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[title='Logout']")).click();
		 driver.quit();
	}
	else
		System.out.println("Invalid Combination");
	     driver.quit();

}
}
