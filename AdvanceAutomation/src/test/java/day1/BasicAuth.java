package day1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.BaseClass;

public class BasicAuth extends BaseClass{
  @Test
  public void basicAuth() 
  {
	  wd.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String act = wd.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
	  String exp = "Congratulations! You must have the proper credentials.";
	  
	  Assert.assertEquals(act, exp);
  }
}
