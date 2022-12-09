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
import POM_Classes.Login_Pre_Production_Pom;
import POM_Classes.Logout_Pom;
import POM_Classes.Mirafirt_Remove_AllFromCart_Pom;

public class Mirafirt_Remove_AllFromCart_Test extends Mirafit_BaseClass
{

	int TCID;
	Login_Pom login;
	Login_Pre_Production_Pom login_preproduction;
	Logout_Pom logout;
	Mirafirt_Remove_AllFromCart_Pom Remove_AllFrom_Cart;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		
		login=new Login_Pom(driver);
		login_preproduction = new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Remove_AllFrom_Cart = new Mirafirt_Remove_AllFromCart_Pom(driver);
		
	} 
	
	@Test()
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=4;
		login.clickprofile();
		login.setLogin_PomUsername(Utility.getdata(0, 0));
//		login_preproduction.setLogin_PomUsername();
//		login_preproduction.setLogin_Pompassword();
		login.setLogin_Pompassword(Utility.getdata(1, 0));
		login.clickLogin_Pombtn();
		
	}
	
	
	@Test(priority=1)
	public void Clear_Shopping_Cart() throws InterruptedException
	{
		TCID=5;
		
		Remove_AllFrom_Cart.Moveto_Strength(driver);
		
		Remove_AllFrom_Cart.GetProductImage();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,300)");
		
//		Remove_AllFrom_Cart.click_Wish_List();
//		
//		Remove_AllFrom_Cart.Get_Wishlist_Message();
//		
//		Remove_AllFrom_Cart.Click_Continue_shopping();
		
//		js.executeScript("window.scrollBy(0,300)");
		
		Remove_AllFrom_Cart.Click_View_Details(driver);
		
		Remove_AllFrom_Cart.Get_Stock();
		
		Remove_AllFrom_Cart.Get_Reviews();
		
		Remove_AllFrom_Cart.Click_Choice();
		
		Remove_AllFrom_Cart.Click_Add_To_Cart(driver);
		
		Remove_AllFrom_Cart.Click_On_Cart_Button(driver);
		
		
		///////////////////////////////////////////////////////////////////////////
		
		
		Remove_AllFrom_Cart.Click_Continue_Shopping1();
	
//		js.executeScript("window.scrollBy(0,500)");
		
		Remove_AllFrom_Cart.Click_Power_Racks();
		
//		js.executeScript("window.scrollBy(0,300)");
		
		Remove_AllFrom_Cart.Click_View_Details1(driver);
		
		Remove_AllFrom_Cart.Get_Stock1();
		
		Remove_AllFrom_Cart.Get_Reviews1();
		
		Remove_AllFrom_Cart.Click_Size();
		
		Remove_AllFrom_Cart.Click_Choice1();
		
		Remove_AllFrom_Cart.Click_Add_To_Cart1(driver);
		
		Remove_AllFrom_Cart.Click_On_Cart_Button1(driver);
		
		Remove_AllFrom_Cart.Clear_cart();
	
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



