package CommercialPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DefectForm 

{
	WebDriver driver;
	
	@FindBy(xpath= "//input[@id=\"cg_purchase\"]" )WebElement cgpp;
	@FindBy(xpath= "//input[@id=\"cg_sale\"]" )WebElement cgsp;
	@FindBy(xpath= "//select[@id=\"cg_time_purchase\"]" )WebElement purtime ;
	@FindBy(xpath= "//select[@id=\"cg_tax\"]" )WebElement income;
	@FindBy(xpath= "//select[@id=\"cg_time_sale\"]" )WebElement saletime;
	@FindBy(xpath= "//input[@id =\"capital_submit\"]" )WebElement submitcg;
	@FindBy(xpath="//input[@id =\"name_popup\"] ")WebElement namedf ;
	@FindBy(xpath="//input[@id =\"email_popup\"] ")WebElement emaildf;
	@FindBy(xpath="//input[@id =\"number_popup\"] ")WebElement mobiledf;
	
	
	
	
	public DefectForm(WebDriver driver) 
	{
    	this.driver=driver;
		PageFactory.initElements(driver,this);
    }
	
	

	public void followcode() throws AWTException, InterruptedException
{
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		submitcg.click();
		
}

public void enterdf(String Name, String Email, String Mobile)
{
	namedf.sendKeys(Name);
	emaildf.sendKeys(Email);
	mobiledf.sendKeys(Mobile);
}

public void submitdf()
{
	
}

}
