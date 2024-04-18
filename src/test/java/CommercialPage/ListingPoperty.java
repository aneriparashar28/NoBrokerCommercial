package CommercialPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListingPoperty {
WebDriver driver ;
Login log;
Robot robot ;

	
@FindBy(xpath="//div[text()=\"Commercial\"]" )WebElement commercial;
@FindBy(xpath = "//div[@class =\"css-1hwfws3 nb-select__value-container nb-select__value-container--has-value\"]")WebElement City;
@FindBy(xpath= "//label[@class = \"nb-radio radio-inline\" and @for =\"COMMERCIAL_RENT\"]")WebElement combuy;
@FindBy(xpath="//div[@class=\"nb-select__placeholder\"]" )WebElement protype;
@FindBy(xpath= "//img[@class =\"w-2p h-2p mr-0.3p\"]" )WebElement search;


public ListingPoperty(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this); 
}
	
public void commclick() throws AWTException, InterruptedException
{
commercial.click();	
}
	
public void enterdetalis() 
throws AWTException, InterruptedException

{

City.click();
Thread.sleep(2000);
robot = new Robot();

robot.keyPress(KeyEvent.VK_UP);
robot.keyRelease(KeyEvent.VK_UP);
Thread.sleep(2000);

robot.keyPress(KeyEvent.VK_UP);
robot.keyRelease(KeyEvent.VK_UP);
Thread.sleep(2000);
	 
robot.keyPress(KeyEvent.VK_ENTER); 
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);
	  
robot.keyPress(KeyEvent.VK_ENTER); 
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);
	  
// go to location option
	  
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);

driver.findElement(By.id("listPageSearchLocality")).sendKeys("Bandra");
//Thread.sleep(2000);

//enter locality 
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(2000);
  
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(2000);
  
robot.keyPress(KeyEvent.VK_ENTER); 
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);
 
//radio button 
  

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOf(combuy));
combuy.click();
  
Thread.sleep(2000);
  
//select property type 
  
  
combuy.click();
Thread.sleep(2000);

robot = new Robot();
Thread.sleep(2000);
protype.click();

robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(2000);

robot.keyPress(KeyEvent.VK_ENTER); 
robot.keyRelease(KeyEvent.VK_ENTER);
	  
}
	
public void clicksearch() throws InterruptedException

{

 Thread.sleep(1000);
 search.click();
 
}



}



		


