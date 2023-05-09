package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import helper.BaseClass;

public class MantisProgram extends BaseClass {
  @Test
  public void demoMantis() {
	  wd.get("http://mantis.squadinfotech.in/login_page.php");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  wd.findElement(By.id("username")).sendKeys("tester1");
	  wd.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input[2]")).click();
	  wd.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/input[3]")).click();
	  
	  //mouse over
	  WebElement viewissue = wd.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a/i"));
	  WebElement reportissue = wd.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a/span"));
	  WebElement changelog = wd.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a/i"));
	  WebElement roadmap = wd.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a/span"));
	  WebElement repos = wd.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[6]/a/span"));
	  
	  Actions act = new Actions(wd);
	  
	  act.moveToElement(viewissue)
	  .moveToElement(reportissue)
	  .moveToElement(changelog)
	  .moveToElement(roadmap).moveToElement(repos).perform();
	  
	  
	  
  }
}
