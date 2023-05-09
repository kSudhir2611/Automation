package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExeUTIL 
{
	public static void drawBorder(WebDriver driver,WebElement ele) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", ele);
	}
	
	public static String getTitleByJs(WebDriver wd) 
	{
		JavascriptExecutor js = (JavascriptExecutor)wd;
		String text = js.executeScript("return document.title").toString();
		return text;
	}
	
	public static void clickByjs(WebDriver wd,WebElement ele) 
	{
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public static void scrolldownByJs(WebDriver wd) 
	{
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollupByJs(WebDriver wd) 
	{
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
	
	public static void refreshByjs(WebDriver wd) 
	{
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("history.go(0)");
	}
	
	public static void generateAlertByJs(WebDriver wd,String msg) 
	{
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("alert('"+msg+"')");
	}
}
