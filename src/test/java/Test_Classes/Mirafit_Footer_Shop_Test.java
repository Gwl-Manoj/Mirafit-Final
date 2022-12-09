package Test_Classes;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass;
import Library_Files.Utility;
import POM_Classes.Mirafit_Footer_Company_Pom;
import POM_Classes.Mirafit_Footer_Pom;
import POM_Classes.Mirafit_Footer_Shop_Pom;

public class Mirafit_Footer_Shop_Test extends Mirafit_BaseClass 
{
	int TCID;
	
	Mirafit_Footer_Shop_Pom Footer_Shop_Options;
	
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		Footer_Shop_Options = new Mirafit_Footer_Shop_Pom(driver);
		
		
	}
	

	
	@Test(priority=1)
	public void Footer_Shop_Option() throws InterruptedException
	{
		TCID=001;
		
		Footer_Shop_Options.click_Strength_Equipment(driver);
		
		Footer_Shop_Options.click_Weights_Bars(driver);
		
		Footer_Shop_Options.click_Conditioning(driver);
		
		Footer_Shop_Options.click_Gym_Storage(driver);
		
		Footer_Shop_Options.click_Accessories(driver);
		
		Footer_Shop_Options.click_Packages(driver);
		
		Footer_Shop_Options.click_Shop_by_sport(driver);
		
	
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
