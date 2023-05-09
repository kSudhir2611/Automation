package day7;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.BaseGrid;

public class GridThree extends BaseGrid  {
	
	@BeforeMethod
	  public void start() throws Exception 
	  {
		  wd = initilizeBrowser("MicrosoftEdge");
	  }
		
		
	  @Test
	  public void fisrt() 
	  {
		  wd.get("https://chromedriver.chromium.org/");
		  System.out.println(wd.getTitle());
	  }
	 

	  @AfterMethod
	  public void afterMethod() 
	  {
		  wd.quit();
	  }
}
