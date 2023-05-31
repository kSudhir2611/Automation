package day2;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import helper.BaseClass;

public class DemoDragDrop extends BaseClass{
	
	private org.apache.logging.log4j.Logger logger = LogManager.getLogger(DemoDragDrop.class.getName());
  @Test
  public void dragAndDrop() {
	  wd.get("https://www.globalsqa.com/demo-site/draganddrop/");
	  logger.info("Appication is launched");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  logger.info("maximizing the window");
	  
	  WebElement fr = wd.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
	  wd.switchTo().frame(fr);
	  logger.info("switching to the frame");
	  
	  WebElement source = wd.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
	  WebElement target = wd.findElement(By.xpath("//*[@id=\"trash\"]"));
	  
	  Actions builder = new Actions(wd);
	  logger.error("Action class object is created");
	  
	
	  
	 Action dragtoElement = builder.clickAndHold(source)
			  				.moveToElement(target)
			  				.release(target)
			  				.build();
	  dragtoElement.perform();
	  logger.info("draag and drop operation performed");
  }
}
