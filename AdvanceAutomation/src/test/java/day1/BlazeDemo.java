package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.BaseClass;

public class BlazeDemo extends BaseClass {
	
	@Test(description="print all element of dropdown")
	public void dropdownElement() throws InterruptedException 
	{
		/*wd.get("https://blazedemo.com/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement from = wd.findElement(By.name("fromPort"));
		
		Select drp = new Select(from);
		
		List<WebElement> alloptions = drp.getOptions();
		
		for(int i = 0; i < alloptions.size(); i++) 
		{
			String ele = alloptions.get(i).getText();
			System.out.println(ele);
		}*/
		
		wd.get("http://omayo.blogspot.com/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement drp = wd.findElement(By.xpath("//select[@id='drop1']"));
		
		Select dd = new Select(drp);
		dd.selectByIndex(2);
		
		WebElement textbx = wd.findElement(By.id("textbox1"));
		textbx.clear();
		textbx.sendKeys("Sudhir");
		
		WebElement btn = wd.findElement(By.id("but2"));
		System.out.println("button enabled: "+btn.isEnabled());
		
		WebElement disablebtn = wd.findElement(By.id("tb2"));
		System.out.println("disabled textbox: "+disablebtn.isEnabled());
		
		int rowCount = wd.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		int colCount = wd.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();
		
		System.out.println("row count :"+rowCount);
		System.out.println("col count :"+colCount);
		
		WebElement prompt = wd.findElement(By.xpath("//input[@id='prompt']"));
		
		prompt.click();
		Alert alert = wd.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Sandy pedro");
		Thread.sleep(3000);
		alert.accept();
		
		WebElement confirm = wd.findElement(By.xpath("//input[@id='confirm']"));
		confirm.click();
		Thread.sleep(3000);
		wd.switchTo().alert().accept();
		
		WebElement b = wd.findElement(By.id("button9"));
		Actions act = new Actions(wd);
		act.contextClick(b).perform();
		
		WebElement n = wd.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		act.doubleClick(n).perform();
		
		Alert alert1 = wd.switchTo().alert();
		alert1.accept();
		
		String t1 = wd.switchTo().frame("iframe1").getTitle();
		System.out.println(t1);
		String t2 = wd.switchTo().frame("iframe2").getTitle();
		System.out.println(t2);
	}
}
