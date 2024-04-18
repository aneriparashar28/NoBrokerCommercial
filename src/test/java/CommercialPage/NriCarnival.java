   

 
//**********************************************************SCENARIO-2 : NriCarnival***********************************************************************


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

    public class NriCarnival 

{
	WebDriver driver;
	
	@FindBy(xpath= "//img[@alt = \"logo\"]" )WebElement logo;
	@FindBy(xpath= "//a[@class =\"nb__2Im-D\"]" )WebElement enquire;
	@FindBy(xpath= "//input[@placeholder=\"Name\"]" )WebElement namenc;
	@FindBy(xpath= "//input[@placeholder=\"Email\"]" )WebElement emailnc;
	@FindBy(xpath= "//input[@placeholder=\"Mobile Number\"]" )WebElement mobilenc;
	@FindBy(id= "selectTheCity" )WebElement citync;
	@FindBy(id= "budget" )WebElement budgetnc;
	@FindBy(xpath= "//button[text()=\"Submit\"]" )WebElement submitnc;
	@FindBy(xpath = "//p[@id =\"thankyou\"] ")WebElement congomsg; 
	
	public NriCarnival(WebDriver driver) 
	
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
	

	public void nricar() throws InterruptedException, AWTException 

	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	
	public void register() throws InterruptedException, AWTException
	{
		
		Robot robot = new Robot();
		
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(200);
		
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
		

	public void formdets(String name, String email, String mobile ) throws InterruptedException
	
	{
		namenc.sendKeys(name);
		
		emailnc.sendKeys(email);
		
	    mobilenc.sendKeys(mobile);
	}

	public void citync() throws AWTException 
	{
	Select select = new Select(citync);
	select.selectByVisibleText("Mumbai");
	}

	public void budgetnc() 
    {
	Select select = new Select(budgetnc);
	select.selectByVisibleText("50 Lacs - 1 Cr");
	}

	public void submit() 
    {
	submitnc.click();
	}

}
