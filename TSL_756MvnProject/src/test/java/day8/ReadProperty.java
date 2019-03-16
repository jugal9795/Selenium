package day8;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import in.lnt.day1.Base;

public class ReadProperty extends Base {
@Test
public void Read() throws Exception
{
	Properties prop = new Properties();
	prop.load(new FileInputStream(".\\constant.property"));
	
	driver.get(prop.getProperty("url"));
	driver.findElement(element(prop.getProperty("e_download"))).click();
}
	public By element(String Value) 
	{
		By B=null;
		if(Value.endsWith("_linktext"))
			B= By.linkText(Value.split("_")[0]);
		else if(Value.endsWith("_xpath"))
			B =By.xpath(Value.split("_")[0]);
		
		return B;
		
	}

}
