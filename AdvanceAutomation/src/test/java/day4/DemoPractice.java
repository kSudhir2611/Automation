package day4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.BaseClass;
import helper.JavaScriptExeUTIL;

public class DemoPractice extends BaseClass {
	
	@Test(priority=1)
	public void demopractice() throws InterruptedException
	{
		wd.get("https://demo.automationtesting.in/Windows.html");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wd.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		String pwid = wd.getWindowHandle();
		System.out.println("Parent window id: "+pwid);
		wd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> allwid = wd.getWindowHandles();
		for(String id:allwid) 
		{
			while(!id.equals(pwid)) 
			{
				wd.switchTo().window(id);
				JavaScriptExeUTIL.scrolldownByJs(wd);
				Thread.sleep(2000);
				wd.close();
			}
			//wd.switchTo().window(pwid);

		}

	}
	//@Test(priority=2)
	public void alertWithCancle() throws InterruptedException 
	{
		wd.get("https://demo.automationtesting.in/Frames.html");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wd.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement frame1 = wd.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		wd.switchTo().frame(frame1);
		WebElement frame2 = wd.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		wd.switchTo().frame(frame2);
		wd.findElement(By.xpath("//input[@type='text']")).sendKeys("Sudhir Kupate");
	}
		
			
		
}

	
	
		
	
	

