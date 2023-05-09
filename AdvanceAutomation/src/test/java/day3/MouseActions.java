package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import helper.BaseClass;


public class MouseActions extends BaseClass
{
  //@Test(priority=1)
  public void mouseActionsRightClick() 
  {
	  wd.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement button = wd.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	  Actions builder = new Actions(wd);
	  builder.contextClick(button).perform();
	  
  }
  
  
  @Test(priority=2)
  public void mouseActionsMoveToElement() 
  {
	  wd.get("https://demo.opencart.com/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement desktop = wd.findElement(By.linkText("Desktops"));
	  WebElement component = wd.findElement(By.linkText("Components"));
	  WebElement webcamera = wd.findElement(By.xpath("//a[normalize-space()='Web Cameras (0)']"));
	  
	  Actions builder = new Actions(wd);
	  
	  Action mouseMoving = builder.moveToElement(desktop)
			  				.moveToElement(component)
			  				.moveToElement(webcamera)
			  				.build();
	  mouseMoving.perform();
	  
  }
  
  @Test(priority=3)
  public void mouseActionsDragAndDrop() 
  {
	  wd.get("https://demoqa.com/droppable");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement source = wd.findElement(By.id("draggable"));
	  WebElement target = wd.findElement(By.id("droppable"));
	  
	  Actions act = new Actions(wd);
	  
	  act.dragAndDrop(source, target).perform();	  
  }
  
  @Test
  public void mouseActionsDragDropBy() 
  {
	  wd.get("https://demo.automationtesting.in/Slider.html");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement slider = wd.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
	  
	  System.out.println(slider.getLocation().getX());
	  
	  Actions act = new Actions(wd);
	  act.dragAndDropBy(slider, 500, 0).perform();
	  
	  System.out.println(slider.getLocation().getX());
  }
}
