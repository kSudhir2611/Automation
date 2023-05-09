package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.BaseClass;

public class CheckboxDemo extends BaseClass {
  @Test
  public void checkboxSelected() {
	  wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement checkbox = wd.findElement(By.name("remember"));
	  
	  boolean status = checkbox.isSelected();
	  
	  Assert.assertEquals(status, false);
  }
}
