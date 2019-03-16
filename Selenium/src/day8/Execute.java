package day8;

import org.testng.annotations.Test;

import in.lnt.day1.Base;

@Test
public class Execute extends Base{
  public void f() throws InterruptedException {
	  Login ln= new Login(driver);
	  SqlCommand command = new SqlCommand(driver);
	  driver.get("http://127.0.0.1:8080/htmldb");
	  
	  ln.LoginProcess("sys", "Newuser123");
	  command.executeCommands();
	  command.dropdown();
	  command.executeQuery("select * from tab");
	  Thread.sleep(4000);
	  command.LogoutProcess(); 
	  }
}
