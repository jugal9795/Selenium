package Day10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import org.testng.annotations.Test;
//import org.openqa.selenium.firefox;

import java.lang.reflect.Method;

public class Reflection {
  @Test
  public void f() throws Exception {
	  
	  Class arzoo = Class.forName("org.openqa.selenium.firefox.FirefoxDriver");
	  
	 //Constructor[] akash = arzoo.getConstructors();
	  
	  Field[] DF = arzoo.getDeclaredFields();
	  
	  for (Field F:DF) {
		  
		  System.out.println(F.getName());
	  }
	  

	  System.out.println(arzoo.getSuperclass());
	
	  Method[] MD = arzoo.getMethods();
	  for(Method m:MD)
	  {
		  System.out.println(m.getName());
	  }
	  }
	  
  }

