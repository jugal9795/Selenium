package in.lnt.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	WebDriver driver = new  ChromeDriver();
	driver.get("http://www.blazedemo.com/");
	
	Select select =new Select(driver.findElement(By.name("fromPort")));
	
	//select.selectByIndex(4);
//	select.selectByValue("Paris");
	select.selectByVisibleText("Boston");
	System.out.println(driver.findElement(By.name("fromPort")).getText());
	List<WebElement> ls=select.getOptions();
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i).getText());
	}
	new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Rome");
	driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
	driver.findElement(By.cssSelector("input[value='Choose This Flight']")).click();
	driver.findElement(By.name("inputName")).sendKeys("Shruti");
	driver.findElement(By.name("address")).sendKeys("Rajarampuri");
	driver.findElement(By.name("city")).sendKeys("Kolhapur");
	driver.findElement(By.name("state")).sendKeys("Maharashtra");
	driver.findElement(By.name("zipCode")).sendKeys("416008");
	driver.findElement(By.name("creditCardNumber")).sendKeys("2354897852");
     Select select1 =new Select(driver.findElement(By.name("cardType")));
	select1.selectByVisibleText("American Express");
	driver.findElement(By.name("creditCardMonth")).sendKeys("12");
	driver.findElement(By.name("creditCardYear")).sendKeys("2022");
	driver.findElement(By.name("nameOnCard")).sendKeys("shruti koli");
	driver.findElement(By.name("rememberMe")).click();
	driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
}
}
