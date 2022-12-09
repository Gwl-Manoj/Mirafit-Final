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
import POM_Classes.Mirafit_Sortby_Toggle_Pom;

public class Mirafit_Sortby_Toggle_test extends Mirafit_BaseClass
{
	int TCID;
	Login_Pom login;
	Logout_Pom logout;
	Mirafit_Sortby_Toggle_Pom Sortby_Toggle;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pom(driver);
		logout = new Logout_Pom(driver);
		Sortby_Toggle = new Mirafit_Sortby_Toggle_Pom(driver);
		
		
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
	public void sortby() throws InterruptedException
	{
	
		Sortby_Toggle.Click_Strength_Equipement();
		
		Sortby_Toggle.Click_SortBy(driver);
		
	
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

