package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass;
import Library_Files.Utility;
import POM_Classes.Login_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_GymStorage_Pom;

public class Mirafit_GymStorage_test extends Mirafit_BaseClass
{

	int TCID;
	Login_Pom login;
	Logout_Pom logout;
	Mirafit_GymStorage_Pom Gym_Storage;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pom(driver);
		logout = new Logout_Pom(driver);
		Gym_Storage = new Mirafit_GymStorage_Pom(driver);
		
	}
	
	@Test()
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=4;
		login.clickprofile();
		login.setLogin_PomUsername(Utility.getdata(0, 0));
		login.setLogin_Pompassword(Utility.getdata(1, 0));
		login.clickLogin_Pombtn();
		
	}
	
	
	@Test(priority=1)
	public void GymStorage() throws InterruptedException
	{
		
		Gym_Storage.Moveto_Gym_Storage(driver);
		
		Gym_Storage.GetProductImage();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Gym_Storage.click_Wish_List();
		
		Gym_Storage.Get_Wishlist_Message();
		
		Gym_Storage.Click_Continue_shopping();
		
		js.executeScript("window.scrollBy(0,300)");
		
		Gym_Storage.Click_View_Details(driver);
		
		Gym_Storage.Get_Stock();
		
//		Gym_Storage.Get_Reviews();
		
		Gym_Storage.Click_Choice();
		
		Gym_Storage.Click_Add_To_Cart(driver);
		
		Gym_Storage.Click_On_Cart_Button(driver);
		
		Gym_Storage.Click_Remove_item_from_Cart(driver);
		
		Gym_Storage.Get_EmptyCartMessage();
		
			
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
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
}
