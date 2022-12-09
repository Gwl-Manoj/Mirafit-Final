package Test_Classes;

import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass;
import Library_Files.Utility;
import POM_Classes.Mirafit_Footer_Pom;
import net.bytebuddy.dynamic.ClassFileLocator.ForUrl;

public class Mirafit_Footer_Test extends Mirafit_BaseClass 
{
	int TCID;
	
	Mirafit_Footer_Pom Footer_Options;
	
//	public static final String USERNAME = "sonambindal_DGyqAH";
//	public static final String AUTOMATE_KEY = "ixYMdE6jb3MEDZJr46XX";
//	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("browserstack.os", "Windows");
//		caps.setCapability("browserstack.os_version", "10");
//		caps.setCapability("browser", "Chrome");
//		caps.setCapability("browser_version", "100.0");
//		caps.setCapability("browserstack.local", "false");
//		caps.setCapability("browserstack.selenium_version", "3.14.0");

		
		
		
		
		Footer_Options = new Mirafit_Footer_Pom(driver);
		
	}
	

	
	@Test(priority=1)
	public void Footer_Shop_Option() throws InterruptedException
	{
		TCID=001;
		
		Footer_Options.click_Strength_Equipment(driver);
		
		Footer_Options.click_Weights_Bars(driver);
		
		Footer_Options.click_Conditioning(driver);
		
		Footer_Options.click_Gym_Storage(driver);
		
		Footer_Options.click_Accessories(driver);
		
		Footer_Options.click_Packages(driver);
		
		Footer_Options.click_Shop_by_sport(driver);
		
	
	}
	@Test(priority=2)
	public void Footer_Company_Option() throws InterruptedException
	{
		Footer_Options.click_About_US(driver);
		
		Footer_Options.click_Athletes(driver);
		
		Footer_Options.click_Blog(driver);
		
		Footer_Options.click_Careers(driver);
		
		Footer_Options.click_FAQs1(driver);
		
	}
	
	@Test(priority=3)
	public void Footer_Help_Option() throws InterruptedException
	{
		Footer_Options.click_Contact_US(driver);
		
		Footer_Options.click_FAQs(driver);
		
		Footer_Options.click_Delivery(driver);
		
		Footer_Options.click_Returns(driver);
		
		Footer_Options.click_Finance(driver);
		
		Footer_Options.click_Privacy_Policy(driver);
		
		Footer_Options.click_Terms_Conditions(driver);
			
		Footer_Options.click_Product_Help_Centre(driver);
		
		Footer_Options.click_buyers_guides(driver);
		
	}
	
	@Test(priority=4)
	public void Footer_Share_Option() throws InterruptedException
	{
		Footer_Options.click_Facebook(driver);
		
		Footer_Options.click_Instagram(driver);
		
		Footer_Options.click_Youtube(driver);
		
		Footer_Options.click_Tik_Tok(driver);
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
