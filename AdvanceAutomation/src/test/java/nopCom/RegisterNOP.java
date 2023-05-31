package nopCom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import helper.BaseClass;

//@Listeners(nopCom.ListenerClass.class)
public class RegisterNOP extends BaseClass
{
	@Test(dataProvider = "data")
	public void ResisterNewCustomer(String name,String lname,String mail,String com,String pass,String cpass) 
	{
		wd.get("https://demo.nopcommerce.com/register");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		RegisterPOM rp = new RegisterPOM(wd);
		rp.selectGender();
		rp.enterFirstname(name);
		rp.enterLastname(lname);
		rp.selectday();
		rp.selectMonth();
		rp.selectday();
		rp.selectYear();
		rp.enterEmail(mail);
		rp.enterCompany(com);
		rp.enterPassword(pass);
		rp.enterConfirmPassword(cpass);
		rp.clickOnRegister();
		
		String msg = wd.findElement(By.xpath("//div[@class='result']")).getText();
		Assert.assertEquals(msg, "Your registration completed");
		wd.findElement(By.xpath("//a[@class='button-1 register-continue-button']")).click();
		
		wd.findElement(By.xpath("//a[@class='ico-login']")).click();
		wd.findElement(By.xpath("//input[@id='Email']")).sendKeys(mail);
		wd.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
		wd.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		wd.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
	@DataProvider(name="data")
	public String[][] dataForregistration() 
	{
		String[][] data = {{"Samu","Pdrou","su@gmail.com","uABC","sp@123","sp@123"},
							{"Johnu","Prou","ju@gmail.com","tret","jp@123","jp@123"},
							{"Kim","Wick","kiw@gmail.com","GHI","kw@123","kw@123"},
							{"Sasha","Nikol","son@gmail.com","JKL","sn@123","sn@123"}};
		return data;
	}
}
