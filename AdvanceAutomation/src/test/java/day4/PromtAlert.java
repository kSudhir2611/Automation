package day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper.BaseClass;

public class PromtAlert extends BaseClass {
  @Test
  public void promptAlerthandling() throws Exception {
	  wd.get("https://demo.automationtesting.in/Alerts.html");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  wd.findElement(By.linkText("Alert with Textbox")).click();
	  wd.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
	  
	  Alert prompt = wd.switchTo().alert();
	  Thread.sleep(3000);
	  prompt.sendKeys("selenium");
	  System.out.println(prompt.getText());
	  Thread.sleep(3000);
	  prompt.accept();
  }
}
