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
import POM_Classes.Mirafit_Offers_Pom;

public class Mirafit_Offers_test extends Mirafit_BaseClass
{

	int TCID;
	Login_Pom login;
	Logout_Pom logout;
	Mirafit_Offers_Pom Offers;
	
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		login=new Login_Pom(driver);
		logout = new Logout_Pom(driver);
		Offers = new Mirafit_Offers_Pom(driver);
		
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
	public void Offers() throws InterruptedException
	{
		
		Offers.Moveto_Offers(driver);
		
		Offers.GetProductImage();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Offers.click_Wish_List();
		
		Offers.Get_Wishlist_Message();
		
		Offers.Click_Continue_shopping();
		
		js.executeScript("window.scrollBy(0,300)");
		
		Offers.Click_View_Details(driver);
		
		Offers.Get_Stock();
		
		Offers.Get_Reviews();
		
		Offers.Click_Choice();
		
		Offers.Click_Add_To_Cart(driver);
		
		Offers.Click_On_Cart_Button(driver);
		
		Offers.Click_Remove_item_from_Cart(driver);
		
		Offers.Get_EmptyCartMessage();
			
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
