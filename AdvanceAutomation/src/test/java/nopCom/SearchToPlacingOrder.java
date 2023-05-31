package nopCom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.BaseClass;
import helper.JavaScriptExeUTIL;

public class SearchToPlacingOrder extends BaseClass
{
	@Test
	public void searchToPlaceOrder() throws InterruptedException 
	{
		wd.get("https://demo.nopcommerce.com/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.findElement(By.xpath("//a[@class='ico-login']")).click();
		wd.findElement(By.id("Email")).sendKeys("sampedro@gmail.com");
		wd.findElement(By.id("Password")).sendKeys("sam@2023");
		wd.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		
		wd.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("laptop");
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		
		wd.findElement(By.xpath("//input[@id='advs']")).click();
		Select category = new Select(wd.findElement(By.xpath("//select[@id='cid']")));
		category.selectByIndex(3);
		wd.findElement(By.xpath("//input[@id='isc']")).click();
		Select manufacturer =  new Select(wd.findElement(By.xpath("//select[@id='mid']")));
		manufacturer.selectByIndex(2);
		wd.findElement(By.xpath("//input[@id='sid']")).click();
		wd.findElement(By.xpath("//button[@class='button-1 search-button']")).click();
		
		wd.findElement(By.xpath("//a[normalize-space()='HP Envy 6-1180ca 15.6-Inch Sleekbook']")).click();
		
		wd.findElement(By.xpath("//button[@id='add-to-cart-button-8']")).click();
		
		String msg = wd.findElement(By.xpath("//p[@class='content']")).getText();
		Assert.assertEquals(msg, "The product has been added to your shopping cart");
		
		JavaScriptExeUTIL.clickByjs(wd, wd.findElement(By.xpath("//span[@class='cart-label']")));
		Select giftwrap = new Select(wd.findElement(By.xpath("//select[@id='checkout_attribute_1']")));
		giftwrap.selectByIndex(1);
		
		wd.findElement(By.cssSelector("input#termsofservice")).click();
		wd.findElement(By.xpath("//button[@id='checkout']")).click();
		
		wd.findElement(By.cssSelector("input#BillingNewAddress_City")).sendKeys("kolhapur");
		wd.findElement(By.cssSelector("input#BillingNewAddress_Address1")).sendKeys("Gargoti");
		wd.findElement(By.cssSelector("input#BillingNewAddress_ZipPostalCode")).sendKeys("416209");
		wd.findElement(By.cssSelector("input#BillingNewAddress_PhoneNumber")).sendKeys("456565332");
		wd.findElement(By.xpath("//button[@onclick='Billing.save()']")).click();
		
		Select country = new Select(wd.findElement(By.xpath("BillingNewAddress_CountryId")));
		country.selectByVisibleText("India");
		
		WebElement ele=wd.findElement(By.id("shippingoption_0"));
		System.out.println("shipping by land transport: "+ele.isSelected());
		wd.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click();
		
		
		
		
	}

}
