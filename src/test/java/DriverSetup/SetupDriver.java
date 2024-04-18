

package DriverSetup;
 
import org.openqa.selenium.WebDriver;
 
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class SetupDriver {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static EdgeOptions options1;
	public static WebDriver chromedriver() {
		WebDriverManager.chromedriver().setup();
		options=new ChromeOptions();
		options.addArguments("--start-maximized");
//		options.addArguments("incognito");
	options.addArguments("disable-notifications");
////		options.addArguments("headless");
//		options.addArguments("disable-blink-features-AutomationControlled");
		driver=new ChromeDriver(options);
		driver.get("https://www.nobroker.in/");
		return driver;
	}
	
	public static WebDriver edgedriver() {
		WebDriverManager.edgedriver().setup();
		options1=new EdgeOptions();
		options1.addArguments("--start-maximized");
//		options1.addArguments("incognito");
//		options1.addArguments("disable-notifications");
////		options1.addArguments("headless");
//		options1.addArguments("disable-blink-features-AutomationControlled");
		driver=new ChromeDriver(options);
		driver.get("https://www.nobroker.in/");
		return driver;
	}
}
