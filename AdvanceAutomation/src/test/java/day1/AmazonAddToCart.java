package day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import helper.NewBase;

public class AmazonAddToCart extends NewBase {
  @Test
  public void addingProductToCart() throws Exception 
  {
	  wd.get("https://www.amazon.in/");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  WebElement searchbox = wd.findElement(By.id("twotabsearchtextbox"));
	  searchbox.sendKeys("redmi  mobile");
	  Thread.sleep(3000);
	  searchbox.sendKeys(Keys.ENTER);
	  
	  wd.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Redmi A1 (Light Blue, 2GB RAM, 32GB Storage) | Seg')]")).click();
	 
	  String PID = wd.getWindowHandle();
	  System.out.println("parent window handle: "+PID);
	  
	  Set<String> allwinid = wd.getWindowHandles();
	  
	  for(String wid:allwinid) 
	  {
		  wd.switchTo().window(wid);
		  System.out.println(wd.getTitle());
		  while(!wid.equalsIgnoreCase(PID)) 
		  {
			  wd.findElement(By.xpath("//li[@id='color_name_0']")).click();
			  wd.findElement(By.id("add-to-cart-button")).click();
			  
			  Thread.sleep(5000);
			  wd.findElement(By.xpath("//a[@id='nav-cart']")).click();
			 
			  
			  WebElement cart = wd.findElement(By.xpath("//span[@class='a-truncate-cut'][contains(text(),'Redmi A1 (Light Blue, 2GB RAM, 32GB Storage) | Seg')]"));
			  if(cart.isDisplayed()) 
			  {
				  System.out.println("Test case passed");
			  }else {
				  System.out.println("Test case failed");
			  }
			  wd.close();
			  
		  }
	  }
	  wd.switchTo().window(PID);
	  
  }
}
