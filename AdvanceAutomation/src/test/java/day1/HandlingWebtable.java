package day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper.BaseClass;

public class HandlingWebtable extends BaseClass {
  @Test
  public void tablehandling() 
  {
	  wd.get("http://the-internet.herokuapp.com/tables");
	  
	  int row_count = wd.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
	  System.out.println("number of row: "+row_count);
	  int col_count = wd.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();
	  System.out.println("number of column: "+col_count);
	  
	  for(int i=1; i < row_count; i++) 
	  {
		  String lastname = wd.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[1]")).getText();
		  String firstname = wd.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[2]")).getText();
		  String email = wd.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[3]")).getText();
		  String due = wd.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[4]")).getText();
		  String website = wd.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[5]")).getText();
		  
		  System.out.println(lastname+"   "+firstname+"   "+email+"   "+due+"   "+website);
	  }
	  System.out.println();
  }
}
