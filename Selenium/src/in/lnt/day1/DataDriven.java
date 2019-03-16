package in.lnt.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class DataDriven {

	
	
  @Test
  public void f() throws SQLException {
	  DriverManager.registerDriver(new oracle.jdbc.OracleDriver() );
	  
	 Connection c=DriverManager.getConnection("\"jdbc:oracle:thin:@localhost:1521:xe", "system", "Newuser123");
	 ResultSet r=c.createStatement().executeQuery("Select * from Login");
	 while(r.next())
	 {
		 System.out.println(r.getString(1));
		 System.out.println(r.getString(2));
	 }
  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
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
