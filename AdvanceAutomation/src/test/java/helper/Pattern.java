package helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Pattern extends BaseClass
{	 @Test
	 public  void practice() throws  SQLException, AWTException, InterruptedException
	{
		wd.get("https://demo.guru99.com/test/upload/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ele = wd.findElement(By.name("uploadfile_0"));
		JavaScriptExeUTIL.clickByjs(wd, ele);
		
		Robot rb = new Robot();
		rb.delay(2000);
		//copy on clipboard
		StringSelection ss = new StringSelection("C://Users//Selenuium//test.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//control v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		System.out.println("paste");
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		System.out.println("release");
		//enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		System.out.println("Enter");
		
		wd.findElement(By.xpath("//input[@id='terms']")).click();
		wd.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
		
		
		
		
		
		
	}
		
}

	
	
	

