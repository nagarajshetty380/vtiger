package Campaigns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;

public class CreateCampwithProduct extends BaseClass{
	@Test
	

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		
		FileInputStream fis= new FileInputStream("./src/test/resources/Property Data.properties");
		Properties p= new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		
		driver.findElement(By.xpath("(//a[text()='Products'][1])")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		//fetch data from excel
//		FileInputStream fis1= new FileInputStream("./src/test/resources/datafile.xlsx");
//		Workbook book = WorkbookFactory.create(fis1);
//		Sheet sh = book.getSheet("Sheet2");
//		Row row = sh.getRow(0);
//		Cell cell = row.getCell(0);
//		String orgname = cell.getStringCellValue();
//		
		
//		
//		driver.findElement(By.name("productname")).sendKeys(orgname);
//		driver.findElement(By.name("button")).click();	
//		
//		
		//signout
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
		

		
	}

}
