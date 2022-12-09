package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Mirafit_Footer_Share_Options_Pom
{

	@FindBy (xpath = "//span[@class='ib ib-hover ic ic-lg ic-facebook']") private WebElement Facebook;
	@FindBy (xpath = "//span[@class='ib ib-hover ic ic-lg ic-instagram']") private WebElement Instagram;
	@FindBy (xpath = "//span[@class='ib ib-hover ic ic-lg ic-youtube']") private WebElement Youtube;
	@FindBy (xpath = "//a[@class='tik-tok-icon ']") private WebElement Tik_Tok;
	
	
	
	public Mirafit_Footer_Share_Options_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_Facebook(WebDriver driver) throws InterruptedException
	{
	
		
		Facebook.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://www.facebook.com/MirafitOfficial/";
		Reporter.log("The URL for Facebook is "+URL,true);
		if(URL.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The actual and expected URL is same ", true);
		}
		else
		{
			Reporter.log("The actual and expected URL is different ", true);
		}
		
		driver.navigate().back();
		Thread.sleep(2000);
		Reporter.log("-----------------------------------------", true);
		
	}
	
	public void click_Instagram(WebDriver driver) throws InterruptedException
	{
		
		
		Instagram.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://www.instagram.com/mirafitofficial/";
		Reporter.log("The URL for Instagram is "+URL,true);
		if(URL.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The actual and expected URL is same ", true);
		}
		else
		{
			Reporter.log("The actual and expected URL is different ", true);
		}
		
		driver.navigate().back();
		Thread.sleep(2000);
		Reporter.log("-----------------------------------------", true);
		
	}
	
	public void click_Youtube(WebDriver driver) throws InterruptedException
	{
		
		Youtube.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://www.youtube.com/c/mirafitofficial";
		Reporter.log("The URL for Youtube is "+URL,true);
		if(URL.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The actual and expected URL is same ", true);
		}
		else
		{
			Reporter.log("The actual and expected URL is different ", true);
		}
		driver.navigate().back();
		Thread.sleep(2000);
		Reporter.log("-----------------------------------------", true);
		
	}
	
	public void click_Tik_Tok(WebDriver driver) throws InterruptedException
	{
		
		
		Tik_Tok.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://www.tiktok.com/notfound";
		Reporter.log("The URL for Tik_Tok is "+URL,true);
		if(URL.equalsIgnoreCase(actualurl))
		{
			Reporter.log("The actual and expected URL is same ", true);
		}
		else
		{
			Reporter.log("The actual and expected URL is different ", true);
		}
		driver.navigate().back();
		Thread.sleep(2000);
		Reporter.log("-----------------------------------------", true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
