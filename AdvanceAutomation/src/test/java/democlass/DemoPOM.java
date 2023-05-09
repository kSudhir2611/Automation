package democlass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import helper.JavaScriptExeUTIL;

public class DemoPOM 
{
	WebDriver driver;
	
	DemoPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By firstname = By.xpath("//input[@placeholder='First Name']");
	By lastname = By.xpath("//input[@placeholder='Last Name']");
	By adress = By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']");
	By email = By.xpath("//input[@type='email']");
	By phone = By.xpath("//input[@type='tel']");
	By gender = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	By hobby = By.xpath("//*[@id=\"checkbox1\"]");
	By skill = By.xpath("//select[@id='Skills']");
	By country = By.xpath("//span[@role='combobox']");
	By  year = By.xpath("//select[@id='yearbox']");
	By month = By.xpath("//select[@placeholder='Month']");
	By day = By.xpath("//select[@id='daybox']");
	By fpass = By.xpath("//input[@id='firstpassword']");
	By cpass = By.xpath("//input[@id='secondpassword']");
	By submit = By.xpath("//button[@id='submitbtn']");
	
	public void enterFirstname(String name) 
	{
		driver.findElement(firstname).sendKeys(name);
	}
	
	public void enterLastname(String lname) 
	{
		driver.findElement(lastname).sendKeys(lname);
	}
	
	public void enterAdress(String adrs) 
	{
		driver.findElement(adress).sendKeys(adrs);
	}
	
	public void enterEmail(String mail) 
	{
		driver.findElement(email).sendKeys(mail);
	}
	
	public void enterPhone(String ph) 
	{
		driver.findElement(phone).sendKeys(ph);
	}
	
	public void clickGender() 
	{
		JavaScriptExeUTIL.clickByjs(driver, driver.findElement(gender));
	}
	
	public void clickHobby() 
	{
		JavaScriptExeUTIL.clickByjs(driver, driver.findElement(hobby));
	}
	
	public void selectSkill() 
	{
		WebElement drp = driver.findElement(skill);
		Select s = new Select(drp);
		s.selectByVisibleText("Java");
	}
	
	public void selectCountry() 
	{
		List<WebElement> allc = driver.findElements(country);
		for(WebElement ele:allc) 
		{
			String cname = ele.getText();
			if(cname.equals("India")) 
			{
				ele.click();
				break;
			}
				
		}
	}
	
	public void selectYear() 
	{
		WebElement drp = driver.findElement(year);
		Select s = new Select(drp);
		s.selectByVisibleText("1992");
	}
	
	public void selectMonth() 
	{
		WebElement drp = driver.findElement(month);
		Select s = new Select(drp);
		s.selectByVisibleText("November");
	}
	
	public void selectDay() 
	{
		WebElement drp = driver.findElement(day);
		Select s = new Select(drp);
		s.selectByVisibleText("26");
	}
	
	public void enterFirstPassword(String pass) 
	{
		driver.findElement(fpass).sendKeys(pass);
	}
	
	public void enterConfirmPassword(String cpassword) 
	{
		driver.findElement(cpass).sendKeys(cpassword);
	}
	
	public void clickSubmit() 
	{
		JavaScriptExeUTIL.clickByjs(driver, driver.findElement(submit));
	}
	

}
