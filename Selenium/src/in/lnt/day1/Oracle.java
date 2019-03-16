package in.lnt.day1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

public class Oracle  extends Base
{
  @Test
  
  public void f() throws InterruptedException {
	  driver.get("http://127.0.0.1:8080/htmldb");
	  driver.findElement(By.xpath("//*[@type='text']")).sendKeys("sys");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Newuser123");
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Administration")).click();
		if(driver.getTitle().equals("Adminstration"))
		{
			System.out.println("fail");
		}
		else if(driver.getTitle().equals("HTML DB Login")) {
			System.out.println("successful");
		}
  }
}
