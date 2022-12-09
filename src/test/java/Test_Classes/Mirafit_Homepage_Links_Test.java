package Test_Classes;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass;
import Library_Files.Utility;
import POM_Classes.Mirafit_Homepage_Links_Pom;

public class Mirafit_Homepage_Links_Test extends Mirafit_BaseClass
{
	
	int TCID;

	Mirafit_Homepage_Links_Pom Links;
			
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		Links = new Mirafit_Homepage_Links_Pom(driver);
		
	}
	

	@Test(priority=1)
	public void Verify_Homepage_Links() throws InterruptedException
	{
		
		TCID=005;
		
		Links.Click_Weight_Benches(driver);
		
		Links.Click_Squat_Racks(driver);
		
		Links.Click_Power_Racks(driver);
		
		Links.Click_Conditioning(driver);
		
		Links.Click_Bars(driver);
		
		Links.Click_Bumper_Plates(driver);
		
		

		
			
	}
	
	

	@AfterMethod
	public void Screenshots(ITestResult result) throws IOException, InterruptedException			// Capturing the screenshot of failed TC
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


