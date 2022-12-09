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
import POM_Classes.Login_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_Navigations_Pom;

public class Mirafit_Navigations_Test extends Mirafit_BaseClass
{
	
	int TCID;
	Login_Pom login;
	Logout_Pom logout;
	Mirafit_Navigations_Pom Navigations;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pom(driver);
		logout = new Logout_Pom(driver);
		Navigations = new Mirafit_Navigations_Pom(driver);
		
	}
	
	@Test
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		TCID=4;
		login.clickprofile();
		login.setLogin_PomUsername(Utility.getdata(0, 0));
		login.setLogin_Pompassword(Utility.getdata(1, 0));
		login.clickLogin_Pombtn();
	}
	
	
	@Test(priority=1)
	public void Page_Navigations() throws InterruptedException
	{
		Navigations.Click_Strength_Equipements(driver);
		
		Navigations.Click_Page2(driver);
		
		Navigations.Click_Page3(driver);
		
		Navigations.Click_Page4(driver);
		
		Navigations.Click_Page5(driver);
		
		Navigations.Click_Page6(driver);
		
		Navigations.Click_Page7(driver);
		
		Navigations.Click_Page8(driver);
		
		Navigations.Click_Page9(driver);
		
		
		
	
	}
	@Test(priority=2)
	public void logout() throws InterruptedException
	{
		TCID=006;
		
		
		logout.click_login_btn();
		logout.click_logout();
		logout.get_logout_message();
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
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	

}
