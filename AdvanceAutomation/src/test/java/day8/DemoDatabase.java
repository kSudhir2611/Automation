package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DemoDatabase {
  @Test
  public void demoDatabaseTesting() throws SQLException 
  {
	  Connection con = DriverManager.getConnection("jdbc:mysql://148.72.215.41:3306/testingdb", "testuser", "testuser");
	  
	  Statement stmt = con.createStatement();
	  
	  ResultSet res = stmt.executeQuery("select * from login");
	  
	  while(res.next()) 
	  {
		  String uname = res.getString(1);
		  String pwd = res.getString(2);
		  System.out.println("username"+uname+" password "+pwd);
	  }
  }
}
