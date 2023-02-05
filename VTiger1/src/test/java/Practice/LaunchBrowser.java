package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Properties pdata= new Properties();
		FileInputStream file= new FileInputStream("./src/test/resources/Property Data.properties");
		pdata.load(file);
		driver.get(pdata.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(pdata.getProperty("USERNAME"));
		driver.findElement(By.name("user_password")).sendKeys(pdata.getProperty("password"));
		driver.findElement(By.id("submitButton")).click();

				
		driver.get("url");
		driver.findElement(By.id("username")).sendKeys("USERNAME");
		
		driver.findElement(By.name("pwd")).sendKeys("password");
		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	
		//fetching data from excel
		
		//FileInputStream efis = new FileInputStream("src/test/resources/datafile.xlsx");
	  //  Workbook book= WorkbookFactory.create(efis);
	    
	    Thread.sleep(1000);
	  
	    
	   
	   
	    
	    Actions a= new Actions(driver);
	    a.contextClick().perform();
	    driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	    driver.close();
	}

}

		
		

	


