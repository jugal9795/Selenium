import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import browserSetup.BrowserSetup;
import in.lnt.day1.ScreenShot;

public class Reliance {
public static void main(String[] args) {
	
	WebDriver driver = BrowserSetup.browserStart("chrome","https://www.nseindia.com/");
	Actions action = new Actions(driver);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("keyword")).sendKeys("Reliance Industries Limited");
	//action.moveToElement(driver.findElement(By.id("keyword"))).keyDown(Keys.ENTER).click().perform();
	//action.sendKeys(driver.findElement(By.id("keyword"))).keyDown(Keys.ENTER).click().perform();
	//WebElement E=driver.findElement(By.xpath("//*[contains(text(),'Reliance Industries Limited')]"));
	action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Reliance Industries Limited')]"))).click().perform();
	TakesScreenshot shot=(TakesScreenshot)driver;
	File src=shot.getScreenshotAs(OutputType.FILE);
	try {
	FileHandler.copy(src, new File(".\\Shot.png"));
	}
	catch(Exception e) {
	System.out.println(e);
	}
	
	
	
	String faceV = driver.findElement(By.xpath("//span[@id='faceValue']")).getText();
	System.out.println("face value is:"+faceV);
	
	String high52 = driver.findElement(By.xpath("//*[@id='high52']/font")).getText();
	System.out.println("face value is:"+high52);
	
	String low52 = driver.findElement(By.xpath("//*[@id='low52']/font")).getText();
	System.out.println("face value is:"+low52);
	
}
}
