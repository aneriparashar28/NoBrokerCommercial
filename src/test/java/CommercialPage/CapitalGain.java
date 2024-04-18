package CommercialPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CapitalGain
{
 
	WebDriver driver;
	
	@FindBy(xpath= "//img[@alt = \"logo\"]" )WebElement logo;
	@FindBy(xpath= "//a[@class =\"nb__2Im-D\"]" )WebElement enquire;
	@FindBy(xpath= "//a[text() = \"Capital Gain\"]" )WebElement capgain;
	@FindBy(xpath= "//input[@id=\"cg_purchase\"]" )WebElement cgpp;
	@FindBy(xpath= "//input[@id=\"cg_sale\"]" )WebElement cgsp;
	@FindBy(xpath= "//select[@id=\"cg_time_purchase\"]" )WebElement purtime ;
	@FindBy(xpath= "//select[@id=\"cg_tax\"]" )WebElement income;
	@FindBy(xpath= "//select[@id=\"cg_time_sale\"]" )WebElement saletime;
	@FindBy(xpath= "//input[@id =\"capital_submit\"]" )WebElement submitcg;
	@FindBy(xpath="(//p[text()=\"Let us help you to find a property to invest in\"])[1]") WebElement assertCg;
	public CapitalGain(WebDriver driver) 
	{
    	this.driver=driver;
		PageFactory.initElements(driver,this);
    }


	public void nblogo()
	{
		logo.click();
	}

	public void scroll() throws InterruptedException, AWTException
	{
		Robot robot = new Robot();
		 
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void enquire() throws InterruptedException, AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) 
		{
		    if (!handle.equals(mainWindowHandle)) 
		    {
		        driver.switchTo().window(handle);
            }
		}
	
	
	}
	
	public void capgain() throws InterruptedException, AWTException 
	{
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		capgain.click();
		
		
	}
	
	public void cgclick() throws AWTException
	{
		
	
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
		

	}
	
	public void priceCG(String pur, String sale)
	{
	 cgpp.sendKeys(pur);	
	 cgsp.sendKeys(sale);
	}
	
	public void dropdowndeets() throws InterruptedException
	{
		Thread.sleep(2000);
		purtime.click();
		Select select = new Select(purtime);
		//select.selectByVisibleText("2012-2013");
		select.selectByValue("113");
		
		income.click();
		Select select1 = new Select(income);
		select1.selectByVisibleText("7.5-10 Lakhs");
		
		saletime.click();
		Select select2 = new Select(saletime);
		select2.selectByVisibleText("2022-2023");
		saletime.click();
		Thread.sleep(2000);

	}
	
	public void submit()
	{
		
		submitcg.click();
		
	}
	public String assertcapitalgain() {
	return assertCg.getText();
	}
}

