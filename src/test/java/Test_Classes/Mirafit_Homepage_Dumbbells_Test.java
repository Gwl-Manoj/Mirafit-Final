package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import POM_Classes.Mirafit_Homepage_Dumbbells_Pom;

public class Mirafit_Homepage_Dumbbells_Test extends Mirafit_BaseClass
{
	
	int TCID;
	Login_Pom login;
	Logout_Pom logout;
	Mirafit_Homepage_Dumbbells_Pom Search;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		login=new Login_Pom(driver);
		logout = new Logout_Pom(driver);
		Search = new Mirafit_Homepage_Dumbbells_Pom(driver);
		
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
	public void AddToCart() throws InterruptedException
	{
		
		TCID=005;
		

		Search.Click_Dumbbells_Button(driver);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		Search.GetProductImage();
		
		Search.click_Wish_List();
		
		Search.Get_Wishlist_Message();
		
		Search.Click_Continue_shopping();
		
		js.executeScript("window.scrollBy(0,500)");
		
		Search.Click_View_Details(driver);
		
		Search.Get_Stock();
		
		Search.Get_Reviews();
		
		Search.Click_Choice();
		
		Search.Quantity_Increment();
		
		Search.Click_Add_To_Cart(driver);
		
		Search.Click_On_Cart_Button(driver);
		
		Search.Click_Remove_item_from_Cart(driver);
		
		Search.Get_EmptyCartMessage();
		
	
			
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
		
		
		logout.click_login_btn();
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


