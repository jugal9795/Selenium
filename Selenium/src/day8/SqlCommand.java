package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SqlCommand {
	
	private By e_sql=By.xpath("//img[@title='SQL']");
	private By e_sqlcommands=By.xpath("//img[@title='SQL Commands']");
	private By e_typequery = By.xpath("//textarea[@id='P1003_SQL_COMMAND1']");
	private By e_run = By.xpath("//input[@value='Run']");
	private By e_display=By.xpath("//select[@id='P1003_ROWS']");
	private WebDriver driver;
	SqlCommand(WebDriver idriver)
	{
		this.driver=idriver;
	}
	
	private By e_logout=By.linkText("Logout");
	
	public void LogoutProcess() 
	{
		driver.findElement(e_logout).click();
	}
	
	public void executeCommands()
	{
		driver.findElement(e_sql).click();
		driver.findElement(e_sqlcommands).click();
	}
	
	public void executeQuery(String query)
	{
		driver.findElement(e_typequery).sendKeys(query);
		driver.findElement(e_run).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void dropdown()
	{
		new Select(driver.findElement(e_display)).selectByVisibleText("20");
		
	}
}
