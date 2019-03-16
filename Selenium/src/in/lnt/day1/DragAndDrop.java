package in.lnt.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import browserSetup.BrowserSetup;
public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = BrowserSetup.browserStart("chrome","https://jqueryui.com/droppable/");
 Actions action = new Actions(driver);
 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
 WebElement srcElement=driver.findElement(By.id("draggable"));
 WebElement desElement=driver.findElement(By.id("droppable"));
 action.dragAndDrop(srcElement,desElement).perform();
 
 driver.switchTo().parentFrame();
 BrowserSetup.getScreenShot("minnie");
	}
}