package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {
	private WebDriver driver;

	public LoginFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);//initialize the driver
	}

	@FindBy(name="p_t01") WebElement e_username;
	@FindBy(name = "p_t02") WebElement e_password;
	@FindBy(xpath="//*[@value='Login']") WebElement e_login;
	//@FindBy(how = How.XPATH, using = "//*[@value='Login']") WebElement e_login;

	public void LoginProcess(String un, String pwd) {
		e_username.sendKeys(un);
		e_password.sendKeys(pwd);
		e_login.click();
	}
}