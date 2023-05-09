package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProviderWithExcel {
  


@Test(dataProvider="data")
  public void printData(String id,String uname,String fname,String lname,String email,String pass,String ph)
  {
	  System.out.println("**************userdata******************");
	  System.out.println(id+"     "+uname+"     "+lname+"     "+email+"     "+pass+"    "+ph);
  } 
  
  
  @DataProvider(name="data")
  public String[][] userData() throws IOException 
  {
	  String path = System.getProperty("user.dir")+"\\src\\test\\resources\\userdata.xlsx";
	  File file = new File(path);
	  FileInputStream fis = new FileInputStream(file);
	  
	  XSSFWorkbook workbook = new XSSFWorkbook(fis); 
	  XSSFSheet sheet = workbook.getSheet("Sheet1");
	  int rowCount = sheet.getPhysicalNumberOfRows();
	  int colCount = sheet.getRow(0).getLastCellNum();
	  System.out.println("Number of rows: "+rowCount);
	  System.out.println("Number of col: "+colCount);
	  
	  String[][] data = new String[rowCount-1][colCount];
	  for(int i = 0; i < rowCount-1; i++) 
	  {
		  XSSFRow row = sheet.getRow(i+1);
		  for(int j = 0; j < colCount; j++) 
		  {
			  XSSFCell cell = row.getCell(j);
			 CellType celltype = cell.getCellType();
			 switch(celltype) 
			 {
			 case STRING: 
				 data[i][j]=cell.getStringCellValue();
				 break;
			 case NUMERIC:
				 data[i][j]=String.valueOf(cell.getNumericCellValue());
				 break;
			 }
		  }
	  }
	  return data;
  }



}

