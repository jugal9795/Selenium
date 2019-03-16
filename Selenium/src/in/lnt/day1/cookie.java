package in.lnt.day1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import in.lnt.day1.Base;

public class cookie extends Base {
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  Set<Cookie> allcookies=driver.manage().getCookies();
	  for(Cookie C:allcookies)
	  {
		  System.out.println("cookie Name is"+C.getName());
		  System.out.println("cookie Domain is"+C.getDomain());
		  System.out.println("cookie Expiry is"+C.getExpiry());
		  System.out.println("cookie Value is"+C.getValue());
		  System.out.println("cookie Path is"+C.getPath());
	  }
	  
  }
}
