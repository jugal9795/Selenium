package day9;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkCheck {
	private WebDriver driver;

	public LinkCheck(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(idriver, this);
	}

	@FindBy(tagName = "a")	List<WebElement> ls;

	public void CheckLink() {
		for (int i = 0; i < ls.size(); i++) {
			ls.get(i).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.navigate().back();

		}
	}
}
