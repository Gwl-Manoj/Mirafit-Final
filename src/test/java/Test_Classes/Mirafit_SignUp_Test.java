package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass;
import Library_Files.Utility;
import POM_Classes.Mirafit_SignUp_Pom;

public class Mirafit_SignUp_Test extends Mirafit_BaseClass
{
	
	int TCID;
	Mirafit_SignUp_Pom SignUp;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		SignUp = new Mirafit_SignUp_Pom(driver);
		
		
	}
	

	@Test
	public void Sign_Up() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		TCID=01;
	
		SignUp.Click_ProfileButton();
		
		SignUp.SignUpButton();
			
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


