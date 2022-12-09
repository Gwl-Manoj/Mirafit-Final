package Test_Classes;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass;
import Library_Files.Utility;
import POM_Classes.Mirafit_Footer_Help_Pom;

public class Mirafit_Footer_Help_Test extends Mirafit_BaseClass 
{
	int TCID;
	
	Mirafit_Footer_Help_Pom Footer_Help;
	
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		Footer_Help = new Mirafit_Footer_Help_Pom(driver);
		
		
	}
	

	
	@Test(priority=1)
	public void Footer_Help_Menu() throws InterruptedException
	{
		TCID=001;
		
		Footer_Help.click_Contact_US(driver);
		
		Footer_Help.click_FAQs(driver);
		
		Footer_Help.click_Delivery(driver);
		
		Footer_Help.click_Returns(driver);
		
		Footer_Help.click_Finance(driver);
		
		Footer_Help.click_Privacy_Policy(driver);
		
		Footer_Help.click_Terms_Conditions(driver);
			
		Footer_Help.click_Product_Help_Centre(driver);
		
		Footer_Help.click_buyers_guides(driver);

		
	}
	
	@AfterMethod
	public void Screenshots(ITestResult result) throws IOException, InterruptedException  // Takes the failed TC screenshots
	{
		
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Utility.screenshot(driver, TCID);
		}
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}


}
