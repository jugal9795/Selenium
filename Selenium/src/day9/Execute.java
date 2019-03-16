package day9;

import org.testng.annotations.Test;

import in.lnt.day1.Base;

public class Execute extends Base {
	
@Test
public void f()   //will run first capital letter named function then
{
	  LoginFactory LF=new LoginFactory(driver);
	  driver.get("http://127.0.0.1:8080/htmldb");
	  LF.LoginProcess("sys","Newuser123");
}

@Test
public void LinkTest()
{
	  LinkCheck link=new LinkCheck(driver);
	  driver.get("http://newtours.demoaut.com");
	link.CheckLink(); 

}

}
