import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenricUtility.FileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LanunchBrowser {

	public static void main(String[] args) throws Throwable {
    FileUtility file= new FileUtility();
    String Broswer = file.getKeyAndValue("browser");
    WebDriver driver;
    
    if(Broswer.equalsIgnoreCase("chrome")) {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    }
    
    else if(Broswer.equalsIgnoreCase("firefox")){
    	WebDriverManager.chromedriver().setup();
    	driver= new ChromeDriver();
    }
    else
    {
    	driver= new ChromeDriver();
    }
driver.close();
	}

}
