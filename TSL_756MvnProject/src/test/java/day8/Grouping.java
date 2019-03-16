package day8;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups="smoke")
  public void f1() {
	  System.out.println("In Test 1");
  }
  
  @Test(groups= {"smoke","regression"})
  public void f2() {
	  System.out.println("In Test 2");
  }
  
  @Test(groups="regression")
  public void f3() {
	  System.out.println("In Test 3");
  }
}
