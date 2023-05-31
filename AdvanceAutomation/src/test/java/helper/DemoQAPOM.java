package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoQAPOM 
{
	WebDriver wd;
	
	public DemoQAPOM(WebDriver driver)
	{
		this.wd=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="firstName") WebElement firstname;
	@FindBy(id="lastName") WebElement lastname;
	@FindBy(id="userEmail")WebElement email;
	@FindBy(xpath="//input[@value='Male']") WebElement gender;
	@FindBy(id="userNumber")WebElement userNumber;
	@FindBy(id="dateOfBirthInput")WebElement dateOfBirth;
	@FindBy(css="div.subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")WebElement subject;
	@FindBy(xpath="//input[@id='hobbies-checkbox-1']")WebElement hobby;
	@FindBy(id="uploadPicture")WebElement upload;
	@FindBy(id="currentAddress") WebElement adress;
	
	public void enterFirstname(String name) 
	{
		firstname.sendKeys(name);
	}
	
	public void enterLastname(String lname) 
	{
		lastname.sendKeys(lname);
	}
	
	public void enterEmail(String mail) 
	{
		email.sendKeys(mail);
	}
	
	public void clickOnGender() 
	{
		JavaScriptExeUTIL.clickByjs(wd, gender);
		//gender.click();
	}
	
	public void enterMobileNumber(String number) 
	{
		userNumber.sendKeys(number);
	}
	
	public void enterDateOfBirth() 
	{
		JavaScriptExeUTIL.clickByjs(wd, dateOfBirth);
		//dateOfBirth.click();
		Select month = new Select(wd.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		month.selectByVisibleText("November");
		Select year = new Select(wd.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		year.selectByVisibleText("1992");
		wd.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--026']")).click();
	}
	
	public void enterSubject(String sname) 
	{
		subject.sendKeys("Mathamatics");
	}
	
	public void enterHobby() 
	{
		JavaScriptExeUTIL.clickByjs(wd, hobby);
	}
	
	public void uploadFile() 
	{
		upload.sendKeys("C:\\Users\\Selenuium\\test.txt");
	}
	
	public void enterAdress(String addr) 
	{
		adress.sendKeys(addr);
	}
	
}
