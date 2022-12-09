package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Mirafit_Footer_Shop_Pom
{

	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/strength-equipment.html'])[3]") private WebElement Strength_Equipment;
	@FindBy (xpath = "//a[@href='https://mirafit.co.uk/weights-bars.html']") private WebElement Weights_Bars;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/conditioning.html'])[3]") private WebElement Conditioning;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/storage.html'])[3]") private WebElement Gym_Storage;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/accessories.html'])[3]") private WebElement Accessories;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/packages.html'])[3]") private WebElement Packages;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/shop-by-sport.html'])[3]") private WebElement Shop_by_sport;

	
	
	
	
	
	public Mirafit_Footer_Shop_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_Strength_Equipment(WebDriver driver) throws InterruptedException
	{
		String Text = Strength_Equipment.getText();
		Reporter.log(Text, true);
		
		Strength_Equipment.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/strength-equipment.html";
		Reporter.log("The URL for Strength_Equipment is "+URL,true);
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
	
	public void click_Weights_Bars(WebDriver driver) throws InterruptedException
	{
		String Text = Weights_Bars.getText();
		Reporter.log(Text, true);
		
		Weights_Bars.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/weights-and-bars.html";
		Reporter.log("The URL for Weights_Bars is "+URL,true);
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
	
	public void click_Conditioning(WebDriver driver) throws InterruptedException
	{
		String Text = Conditioning.getText();
		Reporter.log(Text, true);
		
		Conditioning.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/conditioning.html";
		Reporter.log("The URL for Conditioning is "+URL,true);
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
	
	public void click_Gym_Storage(WebDriver driver) throws InterruptedException
	{
		String Text = Gym_Storage.getText();
		Reporter.log(Text, true);
		
		Gym_Storage.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/storage.html";
		Reporter.log("The URL for Gym_Storage is "+URL,true);
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
	
	public void click_Accessories(WebDriver driver) throws InterruptedException
	{
		String Text = Accessories.getText();
		Reporter.log(Text, true);
		
		Accessories.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/accessories.html";
		Reporter.log("The URL for Accessories is "+URL,true);
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
	
	public void click_Packages(WebDriver driver) throws InterruptedException
	{
		String Text = Packages.getText();
		Reporter.log(Text, true);
		
		Packages.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/packages.html";
		Reporter.log("The URL for Packages is "+URL,true);
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
	
	public void click_Shop_by_sport(WebDriver driver) throws InterruptedException
	{
		String Text = Shop_by_sport.getText();
		Reporter.log(Text, true);
		
		Shop_by_sport.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/shop-by-sport.html";
		Reporter.log("The URL for Shop_by_sport is "+URL,true);
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
