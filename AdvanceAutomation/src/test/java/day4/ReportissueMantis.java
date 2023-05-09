package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import helper.BaseClass;

public class ReportissueMantis extends BaseClass {
  @Test
  public void submitIssue() 
  {
	  wd.get("http://mantis.squadinfotech.in/login_page.php");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  wd.findElement(By.id("username")).sendKeys("tester1");
	  wd.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input[2]")).click();
	  wd.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input[3]")).click();
	  
	//report issue
	  wd.findElement(By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[1]/div/a/i")).click();
	  
	  Select drp = new Select(wd.findElement(By.id("category_id")));
	  
	  drp.selectByValue("2");
	  WebElement summary = wd.findElement(By.name("summary"));
	  summary.sendKeys("Defect found in login functionality");
	  WebElement descri = wd.findElement(By.xpath("//*[@id=\"description\"]"));
	  descri.sendKeys("login is happening with invalid credential");
	  wd.findElement(By.cssSelector("input[value='Submit Issue']"));
  }
}
