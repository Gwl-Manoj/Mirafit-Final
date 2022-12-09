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
import POM_Classes.Mirafit_CheckOut_Pre_Production_Pom;
import POM_Classes.Mirafit_Order_Page_Pre_Production_Pom;

public class Mirafit_Order_Page_Pre_Production_Test extends Mirafit_BaseClass_Pre_Production
{

	
	int TCID;
	Login_Pre_Production_Pom login;
	Logout_Pom logout;
	Mirafit_Order_Page_Pre_Production_Pom Order_Page;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pre_Production_Pom(driver);
		logout = new Logout_Pom(driver);
		Order_Page = new Mirafit_Order_Page_Pre_Production_Pom(driver);
		
		
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
	
		Order_Page.Click_My_Orders(driver);
		
		Order_Page.Get_Order_Details();
		
		Order_Page.Get_Product_Name(driver);
		
		Order_Page.Get_Product_SKU(driver);
		
		Order_Page.Get_Product_Price();
		
		Order_Page.Get_Product_Quantity();
		
		Order_Page.Get_Product_Subtotal();

		
		
		
		
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

