  package CommercialStepDefination;

   import org.testng.Assert;
   import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
   import org.openqa.selenium.TakesScreenshot;
   import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.AWTException; 
   import java.util.List;
   import org.openqa.selenium.TakesScreenshot;
   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import CommercialPage.CapitalGain;
   import CommercialPage.DefectForm;
   import CommercialPage.ListingPoperty;
   import CommercialPage.Login;
   import CommercialPage.NriCarnival;
   import CommercialPage.SethZuri;
   import DriverSetup.SetupDriver;
   import io.cucumber.datatable.DataTable;
   import io.cucumber.java.AfterStep;
   import io.cucumber.java.Scenario;
   import io.cucumber.java.en.And;
   import io.cucumber.java.en.Given;
   import io.cucumber.java.en.Then;
   import io.cucumber.java.en.When;
   import io.github.bonigarcia.wdm.WebDriverManager;


public class CommercialStepDefination 

{
static WebDriver driver ;
Login log;
ListingPoperty lp;
NriCarnival nri;
CapitalGain cg;
DefectForm df;
SethZuri sz;



//*********************************************SCENARIO-1 : EnterDetais***********************************************************************


@Given("the User should be logged in the NoBroker website")
public void the_user_should_be_logged_in_the_no_broker_website() throws InterruptedException 

{
  driver = SetupDriver.chromedriver();
  //	log = new Login(driver); 	
  //	log.userLogin();
}


@When("user selects the commercial option")
public void user_selects_the_commercial_option() throws InterruptedException, AWTException 

{
	lp = new ListingPoperty(driver);
	lp.commclick();
}


@And("user enters all the required details in the given section")
public void user_enters_all_the_required_details_in_the_given_section() throws AWTException, InterruptedException 

{
	lp.enterdetalis();
}


@Then("the user is taken to the property listing page")
public void the_user_is_taken_to_the_property_listing_page() throws InterruptedException 

{
   lp.clicksearch(); 
   Assert.assertEquals(driver.getCurrentUrl(), "https://www.nobroker.in/property/commercial/rent/mumbai/Bandra%20East?searchParam=W3sibGF0IjoxOS4wNjA5MjcsImxvbiI6NzIuODQ2NTMwNywicGxhY2VJZCI6IkNoSUpSVkQ2Rk9ISTV6c1J4eXFwaXM2ekFhcyIsInBsYWNlTmFtZSI6IkJhbmRyYSBFYXN0In1d&radius=2.0&commercialPropertyType=COWORKING&city=mumbai&locality=Bandra%20East");
}


@AfterStep
public static void takeScreendown1(Scenario scenerio)

{
	   TakesScreenshot ts= (TakesScreenshot) driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}





//******************************************SCENARIO-2 : NriCarnival***********************************************************************


//method to click on the no broker logo
@When("Click on the no broker logo")
public void click_on_the_no_broker_logo()

{
	nri=new NriCarnival(driver);
	nri.nblogo();
}	

//method to scroll till the desired element
@And("scroll down to view the enquire now button")
public void scroll_down_to_view_the_enquire_now_button() throws InterruptedException, AWTException

{
	nri.scroll();
}

//method to click on the enquire now button
@And("select the enquire now button")
public void select_the_enquire_now_button() throws InterruptedException, AWTException 

{
	nri.enquire();
}

//method to click on the nri carnival button 
@And("click on the nri carnival")
public void click_on_the_nri_carnival() throws InterruptedException, AWTException 

{
	nri.nricar();
}

//method to click on the register button after which the forms apperas 
@And("click on register now")
public void click_on_register_now() throws InterruptedException, AWTException 

{
	nri.register();
}

//method to enter the details in the form
//the details are taken through scenario outline 
@And("^User enter details with (.*),(.*),(.*)$")
public void user_enter_details_with(String string, String string2, String string3) throws InterruptedException 

{
   nri.formdets(string, string2, string3);
}

//method to select the city 
@And("user selects the city")
public void user_selects_the_city() throws AWTException 

{
 nri.citync();
}

//method to select budget 
@And("user selects the budget")
public void user_selects_the_budget() 

{
	nri.budgetnc();
}

//method to click on the submit button 
@Then("click on submit button")
public void click_on_submit_button()

{

	nri.submit();
	//String congomsg = driver.findElement(By.xpath("//p[@id =\"thankyou\"]"))
    //@FindBy(xpath = "//p[@id =\"thankyou\"] ")WebElement congomsg;
			//Assert that the text is contained within the element
			//assert "Thanks for Filling the Details " in element.text, "Text not found"
//	
//			 WebElement congomsg = driver.findElement(By.xpath("//p[@id =\"thankyou\"]"));
//    // Assert that the text is present
//    Assert.assertTrue(congomsg.getText().contains("Thanks for Filling the Details "));
//			
	
	 Assert.assertEquals(driver.getCurrentUrl(),"https://www.nobroker.in/prophub/new-builder-projects/nri-carnival/");
	
}

@AfterStep
public static void takeScreendown2(Scenario scenerio) 

{
	   TakesScreenshot ts= (TakesScreenshot) driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}



//******************************************SCENARIO-3: CapitalGain***********************************************************************



@When("user Clicks on the NoBroker logo")
public void user_clicks_on_the_no_broker_logo()

{
	cg=new CapitalGain(driver);
	cg.nblogo();
}

@When("user scrolls down to view the enquire now button")
public void user_scrolls_down_to_view_the_enquire_now_button() throws InterruptedException, AWTException 

{
    cg.scroll();
}

@When("user selects the enquire now button")
public void user_selects_the_enquire_now_button() throws InterruptedException, AWTException

{
    cg.enquire();
}


@When("user clicks on capital gain option")
public void user_clicks_on_capital_gain_option() throws InterruptedException, AWTException

{
	cg.capgain();
}

@When("click on capital gain option")
public void click_on_capital_gain_option() throws InterruptedException, AWTException 

{
	cg.cgclick();
}

@When("user enters the purchase price and sale price")
public void user_enters_the_purchase_price_and_sale_price(DataTable data) 

{
	List<List<String>> cells= data.cells();
	cg.priceCG(cells.get(0).get(0),cells.get(0).get(1));
   
}


@When("user selects parchase time, income slab and sale time from the drop down")
public void user_selects_parchase_time_income_slab_and_sale_time_from_the_drop_down() throws InterruptedException 

{
	cg.dropdowndeets();

}

@When("user clicks on the submit option")
public void user_clicks_on_the_submit_option() 

{
    cg.submit();
    String amount=cg.assertcapitalgain();
    AssertJUnit.assertEquals(amount,"Let us help you to find a property to invest in");
    
}

@AfterStep
public static void takeScreendown3(Scenario scenerio)

{
	   TakesScreenshot ts= (TakesScreenshot) driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}


//******************************************SCENARIO-4: DefectForm***********************************************************************



@When("user is taken to the next scenario through the privious one")
public void user_is_taken_to_the_next_scenario_through_the_privious_one() throws AWTException, InterruptedException 

{
 df = new DefectForm(driver);
 driver.get("https://www.nobroker.in/prophub/new-builder-projects/capital-gain/");
 Thread.sleep(2000); 
 df.followcode();
}




@When("user enters the details in the form name, email and  mobile")
public void user_enters_the_details_in_the_form_name_email_and_mobile(DataTable dataTable) throws AWTException, InterruptedException

{
	
List<List<String>> cells= dataTable.cells();
df.enterdf(cells.get(0).get(0),cells.get(0).get(1),cells.get(0).get(2));
	
}

@Then("click the submit button")
public void click_the_submit_button() 
{
  // submitdf.click
	String actual = driver.getCurrentUrl();
	String expected ="https://www.nobroker.in/prophub/new-projects/sheth-zuri-3";
	AssertJUnit.assertEquals(expected, actual);
}

@AfterStep
public static void takeScreendown5(Scenario scenerio) 

{
	   TakesScreenshot ts= (TakesScreenshot) driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}



//******************************************SCENARIO-5: SethZuri***********************************************************************


@When("user is directed to the url")
public void user_is_directed_to_the_url() 

{
	sz = new SethZuri(driver);
	driver.get("https://www.nobroker.in/prophub/new-builder-projects/?isHybrid=false");
}

@When("the user clicks on Seth Zuri option")
public void the_user_clicks_on_seth_zuri_option() throws AWTException 

{
    sz.godown();
}

@Then("the user is taken to the property listed pages")
public void the_user_is_taken_to_the_property_listed_pages() throws AWTException 

{
    sz.select();
    String actual = driver.getCurrentUrl();
	String expected ="https://www.nobroker.in/prophub/new-projects/sheth-zuri-3";
	AssertJUnit.assertEquals(expected, actual);
}

@AfterStep
public static void takeScreendown6(Scenario scenerio) 

{
	   TakesScreenshot ts= (TakesScreenshot) driver;
	   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	   scenerio.attach(src, "image/png",scenerio.getName());
}

}
