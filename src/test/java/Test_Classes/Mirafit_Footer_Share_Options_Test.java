package Test_Classes;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass;
import Library_Files.Utility;
import POM_Classes.Mirafit_Footer_Share_Options_Pom;

public class Mirafit_Footer_Share_Options_Test extends Mirafit_BaseClass 
{
	int TCID;
	
	Mirafit_Footer_Share_Options_Pom Footer_Share_Options;
	
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		Footer_Share_Options = new Mirafit_Footer_Share_Options_Pom(driver);
		
		
	}
	

	
	@Test(priority=1)
	public void Footer_Share_Option() throws InterruptedException
	{
		TCID=001;
		
		Footer_Share_Options.click_Facebook(driver);
		
		Footer_Share_Options.click_Instagram(driver);
		
		Footer_Share_Options.click_Youtube(driver);
		
		Footer_Share_Options.click_Tik_Tok(driver);
		
		
	
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
