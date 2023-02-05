package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="user_name")
	private WebElement usernametextfeild;
	
	@FindBy(name="user_password")
	private WebElement passwordtextfeild;
	
	@FindBy (id="submitButton")
	private WebElement loginbutton;
	


public WebElement getUsername() {
	return usernametextfeild;
}

public WebElement getPassword() {
	return passwordtextfeild;
}

public WebElement getLoginbutton() {
	return loginbutton;
	
}
//public void loginToApp(String username, String password)
//{
//	usernametextfeild.sendKeys(username);
//	passwordtextfeild.sendKeys(password);
//	loginbutton.click();
//}

public void loginToapp() {
usernametextfeild.sendKeys("admin");
}
public void loginToApp1() {
	passwordtextfeild.sendKeys("admin");
}
public void loginToaApp12() {
	loginbutton.click();
}
}