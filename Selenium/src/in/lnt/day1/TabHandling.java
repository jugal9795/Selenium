package  in.lnt.day1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import browserSetup.BrowserSetup;

public class TabHandling {
	public static void main(String [] args)  
	{
		WebDriver driver=	BrowserSetup.browserStart("chrome","http://seleniumhq.org");
		String ParentID=driver.getWindowHandle();
		WebElement E=driver.findElement(By.linkText("Download"));
		new Actions(driver).keyDown(Keys.CONTROL).click(E).perform();
		
		Set<String> allWin=driver.getWindowHandles();
		Iterator<String> itr=allWin.iterator();
		while(itr.hasNext())
		{
			String ID=itr.next();
					System.out.println(ID);
					if(!(ID.equals(ParentID)))
					{
						driver.switchTo().window(ID);
						System.out.println("You are on "+driver.getTitle());
						driver.close();   // CLosing Tab/Window
					}
			driver.switchTo().window(ParentID);						
		}
}
}