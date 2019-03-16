package day9;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import in.lnt.day1.Base;
import util.Excel;
import util.KeyWords;

public class Hybrid extends Base {
  @Test(dataProvider="dp")
  public void f(String key, String Locator, String data) 
  {
	  KeyWords k=new KeyWords(driver);
	  switch(key)
	  {
	  case "openUrl":
		  k.openUrl(data);
		  break;
	  case "type":
		  k.type(Locator, data);
		  break;
	  case "click":
		  k.click(Locator);
		  break;
	  case "getScreenShot":
		  k.getScreenShot(data);
		  break;
	  }
  }
  
  @DataProvider
  public Object[][] dp()
  {
	  Excel ex=new Excel("D:\\Book1.xls");
	  Object data[][]=new Object[ex.rowCount("Sheet1")][3];
	  for(int i=0;i<ex.rowCount("Sheet1");i++)
	  {
		  data[i][0]=ex.Read("Sheet1", i+1, 0);
		  data[i][1]=ex.Read("Sheet1", i+1, 1);
		  data[i][2]=ex.Read("Sheet1", i+1, 2);
	  }
	  return data;
  }
}
