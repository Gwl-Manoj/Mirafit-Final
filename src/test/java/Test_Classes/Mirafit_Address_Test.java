package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass;
import Library_Files.Utility;
import POM_Classes.Login_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_Address_Pom;
import POM_Classes.Mirafit_Homepage_Dumbbells_Pom;

public class Mirafit_Address_Test extends Mirafit_BaseClass
{
	
	int TCID;
	Login_Pom login;
	Logout_Pom logout;
	Mirafit_Address_Pom Address;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pom(driver);
		logout = new Logout_Pom(driver);
		Address = new Mirafit_Address_Pom(driver);
		
	}
	
	
	@Test (priority=3)
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=4;
		login.clickprofile();
		login.setLogin_PomUsername(Utility.getdata(0, 0));
		login.setLogin_Pompassword(Utility.getdata(1, 0));
		login.clickLogin_Pombtn();
		
		
	}

	@Test(priority=4)
	public void Address() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Address.Click_Manage_Address();
		
		Address.Click_Add_New_Address();
		
		Address.Set_Phone_Number();
		
		Address.Set_Street_Address();
		
		Address.Set_City();
		
		Address.Set_Zip_Code();
		
		Address.Click_Save_Address();
		
		Address.Click_Delete();
		
		
		
	}
	
	
	@Test
	public void GetTitle()
	{
		TCID=001;
		
		String Title = driver.getTitle();  // get the title of webpage
		System.out.println(Title);
	}
	
	@Test(priority=2)
	public void VerifyLogoDispalyed ()
	{
		TCID= 003;
		
		boolean Logo = driver.findElement(By.xpath("(//img[@src='https://mirafit.co.uk/pub/media/logo/stores/1/mirafit-logo.png'])[2]")).isDisplayed();
		System.out.println(Logo+" Logo is displayed");
	}
	
	
	@Test(priority=1)
	public void getcurrentURl()
	{
		TCID=002;
		
		String url = driver.getCurrentUrl();  // Get the current webpage url
		System.out.println(url);
		
		String Expurl="https://mirafit.co.uk/";
		if(url.equals(Expurl))
		{
			Reporter.log("Tc Pass", true);
			
		}
		else
		{
			Reporter.log("Tc Fail", true);
			
		}
	}
	
	@Test(priority=5)
	public void logout() throws InterruptedException
	{
		TCID=006;
		
		logout.click_logout();
		logout.get_logout_message();
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

