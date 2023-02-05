import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import PomPages.LoginPage;

public class Testcase1 extends BaseClass{
	@Test
	
	public void tc1() {
		
LoginPage p= new LoginPage(driver);
p.loginToapp();
p.loginToApp1();
p.loginToaApp12();

}
}