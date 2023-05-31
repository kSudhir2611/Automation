package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

import helper.BaseClass;
import helper.DemoQAPOM;
import helper.JavaScriptExeUTIL;
import helper.NewBase;

public class DemoPractice extends BaseClass {
	
	//@Test(priority=1)
	public void demopractice() throws InterruptedException, IOException
	{
		wd.get("https://demo.automationtesting.in/Register.html");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = wd.findElement(By.xpath("//select[@id='countries']"));
		JavaScriptExeUTIL.drawBorder(wd, ele);
		TakesScreenshot ts = (TakesScreenshot)wd;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg= new File(".//scr"+dtm()+" .png");
		FileUtils.copyFile(src, trg);

	}
	//@Test(priority=2)
	public void alertWithCancle() throws InterruptedException 
	{
		wd.get("https://jqueryui.com/droppable/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wd.switchTo().frame(wd.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement dragable = wd.findElement(By.id("draggable"));
		WebElement droppable = wd.findElement(By.id("droppable"));
		
		Actions act = new Actions(wd);
		Action builder = act.clickAndHold(dragable).moveToElement(droppable)
				.release(droppable).build();
		builder.perform();
		
		
	}
	//@Test
	public void checkBox() throws InterruptedException 
	{
		wd.get("https://jqueryui.com/checkboxradio/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> allbox = wd.findElements(By.xpath("//label[@class='ui-checkboxradio-label ui-corner-all ui-button ui-widget']//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
	
			for(WebElement ele:allbox) 
			{
				JavaScriptExeUTIL.clickByjs(wd, ele);
				Thread.sleep(1000);
			}
	
	}
	public static String dtm() 
	{
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	//@Test
	public void toolTip() 
	{
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(5));
		wd.get("https://jqueryui.com/tooltip/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.switchTo().frame(wd.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement tool = wd.findElement(By.xpath("//input[@id='age']"));
		wait.until(ExpectedConditions.visibilityOf(tool));
		
		
		System.out.println("Tooltip of age field: "+tool.getAttribute("title"));
	}
	//@Test
	public void webtablehandling() 
	{
		wd.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		int rowCount = wd.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
		System.out.println("rowCount: "+rowCount);
		int colCount = wd.findElements(By.xpath("//table[@id='customers']//tbody//tr//th")).size();
		System.out.println("colCount: "+colCount);
		
		for(int i=2;i<rowCount;i++) 
		{
			String company = wd.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[1]")).getText();
			String contact = wd.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[2]")).getText();
			String country = wd.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[3]")).getText();
			System.out.println(company+" : "+contact+" : "+country);
		}
	}
	
	//@Test
	public void handlingWindow() 
	{
		wd.get("https://nxtgenaiacademy.com/multiplewindows/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String parentid=wd.getWindowHandle();
		System.out.println("parent window id: "+parentid);
		
		wd.findElement(By.xpath("//div[@class='elementor-element elementor-element-d5cad06 elementor-widget elementor-widget-html']//button[@id='button1']")).click();
		
		Set<String> allid = wd.getWindowHandles();
		
		for(String id:allid) 
		{
			if(!id.equalsIgnoreCase(parentid)) 
			{
				wd.switchTo().window(id);
				//wd.manage().window().maximize();
				JavascriptExecutor js = (JavascriptExecutor)wd;
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			}
			wd.close();
		}
		wd.switchTo().window(parentid);
		wd.findElement(By.xpath("//div[@class='elementor-element elementor-element-f5f0e8d elementor-widget elementor-widget-html']//button[@id='button1']")).click();
	}
	
	
	//@Test
	public void frameHandling() 
	{
		wd.get("https://nxtgenaiacademy.com/iframe/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.switchTo().frame("iframe_a");
		
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("document.getElementById('vfb-5').value='Sudhir dada'");
		//wd.findElement(By.id("vfb-5")).sendKeys("Sudhir Kupate");
	}
	//@Test
	public void handlingttable() 
	{
		wd.get("https://nxtgenaiacademy.com/iframe/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.switchTo().frame("iframe_a");
		
		int rowCount = wd.findElements(By.xpath("//table//tbody//tr")).size();
		
		for(int i=0;i<rowCount;i++) 
		{
			String firstColumn = wd.findElement(By.xpath("//table//tbody//tr["+i+"]//td[1]")).getText();
			String secondColumn = wd.findElement(By.xpath("//table//tbody//tr["+i+"]//td[2]")).getText();
			
			System.out.println(firstColumn+"   "+secondColumn);
		}
	}
	//@Test
	public void readingDataFromExcel() throws IOException 
	{
		String location = System.getProperty("user.dir")+".//src//test//resources//userdata.xlsx";
		
		File file = new File(location);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("number of rows: "+rowCount);
		System.out.println("number of column: "+colCount);
		
		for(int i=0;i<rowCount;i++) 
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++) 
			{
				XSSFCell cell=row.getCell(j);
				
				org.apache.poi.ss.usermodel.CellType celltype = cell.getCellType();
				
				switch(celltype) 
				{
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
					
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;	
				}
				System.out.print(" | ");
			}
			System.out.println();
		}	
	}
	
	//@Test
	public void fillingForm() throws InterruptedException 
	{
		wd.get("https://demoqa.com/automation-practice-form");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		DemoQAPOM demoqa = new DemoQAPOM(wd);
		demoqa.enterFirstname("Sudhir");
		demoqa.enterLastname("Kupate");
		demoqa.enterEmail("sk@gmail.com");
		demoqa.clickOnGender();
		demoqa.enterMobileNumber("89898989898"); 
		demoqa.enterDateOfBirth();
		Thread.sleep(2000);
		//demoqa.enterSubject("Mathamatics");
		demoqa.enterHobby();
		demoqa.uploadFile();
		demoqa.enterAdress("Kolhapur");
	}
	@Test
	public void fileUpload() 
	{
		wd.get("https://tus.io/demo");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement uploadfile = wd.findElement(By.id("P0-0"));
		uploadfile.sendKeys("C:\\Users\\Selenuium\\test.txt");
		String msg = wd.findElement(By.xpath("//p[@class='_heading_1as67_21']")).getText();
		System.out.println(msg);
	}
}

	
	
		
	
	

