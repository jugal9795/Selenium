package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public  class Conn {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Newuser123");

	Statement smt=con.createStatement();
	ResultSet rs=smt.executeQuery("Select  * from Login ");
	rs.next();
	System.out.println(rs.getString(1));

}




}

