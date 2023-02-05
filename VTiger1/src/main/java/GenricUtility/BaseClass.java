package GenricUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeSuite
	public void Bs() {
		System.out.println("database connection");
	}
	@BeforeTest
	public void Bt() {
		System.out.println("paralell execution");
	}
@BeforeClass
public void Bc() throws Throwable {
	FileUtility fileb= new FileUtility();
	String Browser = fileb.getKeyAndValue("browser");
	if(Browser.equalsIgnoreCase("chrome")) {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    }
    
    else if(Browser.equalsIgnoreCase("firefox")){
    	WebDriverManager.chromedriver().setup();
    	driver= new ChromeDriver();
    }
    else
    {
    	driver= new ChromeDriver();
    }
	System.out.println("launching the browser");
}
@BeforeMethod
public void Bm()
{
	System.out.println("login to application");
}
@AfterMethod
public void Am() {
	System.out.println("logout the application");
}
@AfterClass
public void Ac() {
	System.out.println("close browser");
}

@AfterTest
public void At() {
	System.out.println("close the execution");
}
@AfterSuite
public void As() {
	System.out.println("database closed");
}
}