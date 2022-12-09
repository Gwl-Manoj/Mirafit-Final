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

public class Mirafit_Footer_Company_Test extends Mirafit_BaseClass 
{
	int TCID;
	
	Mirafit_Footer_Company_Pom Footer_Company;
	
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		Footer_Company = new Mirafit_Footer_Company_Pom(driver);
		
	}
	

	
	@Test(priority=1)
	public void Footer_Help_Menu() throws InterruptedException
	{
		TCID=001;
		
		Footer_Company.click_About_US(driver);
		
		Footer_Company.click_Athletes(driver);
		
		Footer_Company.click_Blog(driver);
		
		Footer_Company.click_Careers(driver);
		
		Footer_Company.click_FAQs(driver);
		
	
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
