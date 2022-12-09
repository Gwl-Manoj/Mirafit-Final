package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass_Pre_Production;
import Library_Files.Utility;
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafit_CheckOut_PayPalPre_Production_Pom;
import POM_Classes.Mirafit_CheckOut_Pre_Production_Pom;

public class Mirafit_CheckOut_PayPalPre_Production_Test extends Mirafit_BaseClass_Pre_Production
{

	
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_CheckOut_PayPalPre_Production_Pom CheckOut;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		CheckOut = new Mirafit_CheckOut_PayPalPre_Production_Pom(driver);
		
		
	}
	
	@Test()
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=4;
		login.clickprofile();
		login.setLogin_PomUsername();
		login.setLogin_Pompassword();
		login.clickLogin_Pombtn();
		
		
	}
	
	
	@Test(priority=1)
	public void Accessories() throws InterruptedException, EncryptedDocumentException, IOException
	{
//		CheckOut.Move_To_Accessories(driver);
//		
//		CheckOut.GetProductImage();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,300)");
		
		
		
		
//		//CheckOut.click_Wish_List();
//		
//		//CheckOut.Get_Wishlist_Message();
//		
//		//CheckOut.Click_Continue_shopping();
//		
//		//js.executeScript("window.scrollBy(0,300)");
		
		
		
		
//		CheckOut.Click_View_Details(driver);
		
		
		
		
//		//CheckOut.Get_Stock();
//		
//		//CheckOut.Get_Reviews();
//		
//		//CheckOut.Click_Choice();
//		
//		//CheckOut.Click_Add_To_Cart(driver);
		
//		CheckOut.Click_On_Cart_Button(driver);
//		
//		CheckOut.Click_Checkout_button(driver);
//		
//		CheckOut.Click_Checkout(driver);
		
		
		CheckOut.Click_Checkoutpropcedure(driver);
		
		CheckOut.Click_Checkout(driver);
		
		CheckOut.Set_Card_Number(driver);
		
		CheckOut.Set_Card_Date_Year(driver);
		
		CheckOut.Set_Card_CVV(driver);
		
		CheckOut.Click_Placeorder_Button();
		
		
		
		
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

