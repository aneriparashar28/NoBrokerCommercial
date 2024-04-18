package CommercialPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class SethZuri 

{
	public SethZuri(WebDriver driver2)
	{
		
	}

	WebDriver driver;
	
public void godown() throws AWTException
{
	
	Robot robot = new Robot();
	for (int i = 0; i < 53; i++) 
	{
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);
		
    }
}

public void select() throws AWTException
{
	Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);
}
	
	
}
