package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import helper.BaseClass;


public class MouseActions extends BaseClass {
  @Test
  public void mouseHower() throws Exception 
  {
	  /*wd.get("https://demo.guru99.com/test/newtours/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement link_home = wd.findElement(By.linkText("Home"));
	  WebElement home_table = wd.findElement(By.xpath("//html/body/div\"\n"
	  		+ "                        + \"/table/tbody/tr/td\"\n"
	  		+ "                        + \"/table/tbody/tr/td\"\n"
	  		+ "                        + \"/table/tbody/tr/td\"\n"
	  		+ "                        + \"/table/tbody/tr"));
	  
	  Actions builder = new Actions(wd);
	  Action mouseHower = builder.moveToElement(link_home).build(); 
	  
	  String bgcolor = home_table.getCssValue("background-color");
	  System.out.println("before hover: "+bgcolor);
	  mouseHower.perform();
	  bgcolor = home_table.getCssValue("background-color");
	  System.out.println("after hover: "+bgcolor);*/
	  
	  
	  /*wd.get("https://www.facebook.com/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement emailfield = wd.findElement(By.id("email"));
	  
	  Actions builder = new Actions(wd);
	  
	  Action seriesOfActions = builder.moveToElement(emailfield)
			  					.click()
			  					.keyDown(emailfield,Keys.SHIFT)
			  					.sendKeys(emailfield, "hello")
			  					.keyUp(emailfield, Keys.SHIFT)
			  					.doubleClick()
			  					.contextClick()
			  					.build();
	  seriesOfActions.perform();*/
	  
	  wd.get("https://jqueryui.com/slider/");
	  
	  
	  WebElement frameElement = wd.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	  wd.switchTo().frame(frameElement);
	  System.out.println(frameElement.getText());
	  WebElement slider = wd.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	  
	  Actions act = new Actions(wd);
	 
	  act.dragAndDropBy(slider, 100, 50).perform();
			  				
	
  }
}
