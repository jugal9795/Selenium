package in.lnt.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertTest  extends Base{
  @Test
  public void test() throws InterruptedException {
	  driver.get("http://www.magneticautomation.in/2019/01/alert-example.html");
	  driver.findElement(By.xpath("//button[@onclick='myFunction1()']")).click();;
	  Alert A= driver.switchTo().alert();
	  String txt= A.getText();
	  
	  System.out.println(txt);
	  Thread.sleep(10000);
	  A.accept();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();;
	  Alert A2=driver.switchTo().alert();
	  System.out.println(A2.getText());
	  Thread.sleep(5000);
	  A2.sendKeys("john");
	  
	
	  Thread.sleep(5000);
	  A2.dismiss();

  }
}
