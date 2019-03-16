package in.lnt.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnotations {
  @Test
  public void f() {
	  System.out.println("Test1");
  }
  @Test
  public void f1() {
	  System.out.println("Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println();
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
