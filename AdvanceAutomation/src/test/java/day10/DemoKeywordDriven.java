package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import helper.NewBase;

public class DemoKeywordDriven extends NewBase {
  @Test
  public void registerNewUser() throws IOException, InterruptedException 
  {
	  
	  wd.get("https://www.flatshop.in/my-account/#");
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  
	  FlatShopPOM fp = new FlatShopPOM(wd);
	  File file = new File("C:\\Users\\Selenuium\\flatshop.xlsx");
	  FileInputStream fr = new FileInputStream(file);
	  
	  XSSFWorkbook wb = new XSSFWorkbook(fr);
	  XSSFSheet sheet = wb.getSheet("register");
	  
	  int row = sheet.getPhysicalNumberOfRows();
	  System.out.println("Number of row:"+row);
	  
	  for(int i = 2; i < row; i++) 
	  {
		  XSSFRow r = sheet.getRow(i);
		  XSSFCell key = r.getCell(2);
		  
		  System.out.println("keyword:"+key.toString());
		  
		  switch(key.toString()) 
		  {
		  case "register":
			  fp.clickOnRegisterButton();
			  break;
			  
		  case "fname":
			  fp.enterFirstname("suraj");
			  break;
			  
		  case "lname":
			  fp.enterLastname("Kupate");
			  break;
			  
		  case "email":
			  fp.enterEmail("surajkupate@gmail.com");
			  break;
			  
		  case "pass":
			  fp.enterPassword("suraj456123458578787");
			  break;
			  
		  case "reg":
			  fp.register();
			  break;
		  }
		  XSSFCell c = r.createCell(3);
		  c.setCellValue("pass");
		  
		  
	  }
	  FileOutputStream fo = new FileOutputStream("C:\\Users\\Selenuium\\flatshop.xlsx");
	  wb.write(fo);
	  wd.close();
  }
}
