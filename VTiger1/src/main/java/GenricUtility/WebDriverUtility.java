package GenricUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

public void maximizeScreen( WebDriver driver) {
	driver.manage().window().maximize();
	
}
//public void waitForPageLoad(WebDriver driver)
//{
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//}
public void scriptTimeOut(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
public void waitForElementWithCoustomTimeout(WebDriver driver , WebElement element, int Pollingtime) {
	
	FluentWait wait= new FluentWait(driver);
	wait.pollingEvery(Duration.ofSeconds(Pollingtime));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
}
public void switchToWindow(WebDriver driver,String partialwindowtitle) {
	Set<String> allId = driver.getWindowHandles();
	Iterator<String> it = allId.iterator();
	while(it.hasNext()) {
		String wid = it.next();
		driver.switchTo().window(wid);
		if(driver.getTitle().contains(partialwindowtitle));
		{
			break;
		}
	}
}

public void switchToAlertAndAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}

public void switchToFrameAndDismiss(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
public void switchToFrame(WebDriver driver, int index)
{
	driver.switchTo().frame(index);
	
}
public void switchToFrame(WebDriver driver,String id_name_Attributes) {
	driver.switchTo().frame(id_name_Attributes);
}
public void select(WebElement element, int index)
{
	Select sel= new Select(element);
	sel.selectByIndex(index);
}
public void select(WebElement element , String text) {
	Select sel= new Select(element);
	sel.selectByVisibleText(text);
	
}
public void mouseOverOnElement(WebDriver driver, WebElement element) {
	Actions act= new Actions(driver);
	act.moveToElement(element).perform();
}
public void rightClickOnElemnt(WebDriver driver, WebElement element) {
	Actions act= new  Actions(driver);
	act.contextClick(element).perform();
}
public void moveByOffset(WebDriver driver, int x, int y) {
	Actions act= new Actions(driver);
	act.moveByOffset(x, y).click().perform();
	
}

}
