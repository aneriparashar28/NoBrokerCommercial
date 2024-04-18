package CommercialRunner;

import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions	
	

	
	

(

features="src\\test\\resources\\Features\\Commercial.feature",
glue="CommercialStepDefination",
//tags="@EnterDetails"
//tags="@NriCarnival"
//tags="@CapitalGain
//tags = "@defectform"
//tags = "@SethZuri",

plugin={"pretty","html:target/HTMLReports/RentReports.html",
		"json:target/JSONReports/RentReports.json",
		"junit:target/JUNITReports/RentReports.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
 

public class Runner extends AbstractTestNGCucumberTests
{
	
	
}

 


