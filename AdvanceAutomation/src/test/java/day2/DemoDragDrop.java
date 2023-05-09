package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoDragDrop extends BaseClass{
  @Test
  public void dragAndDrop() {
	  wd.get("https://www.globalsqa.com/demo-site/draganddrop/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement fr = wd.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
	  wd.switchTo().frame(fr);
	  
	  WebElement source = wd.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
	  WebElement target = wd.findElement(By.xpath("//*[@id=\"trash\"]"));
	  
	  Actions builder = new Actions(wd);
	  
	
	  
	 Action dragtoElement = builder.clickAndHold(source)
			  				.moveToElement(target)
			  				.release(target)
			  				.build();
	  dragtoElement.perform();
			  				
  }
}
