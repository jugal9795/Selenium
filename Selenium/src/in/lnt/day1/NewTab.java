package in.lnt.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationTesting\\Jars\\chromedriver_win32(4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String newtab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath("//*[@id='menu_download']/a")).sendKeys(newtab);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id=\'menu_documentation\']/a")).sendKeys(newtab);

	}

}
