package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Mirafit_Footer_Company_Pom
{

	@FindBy (xpath = "//a[text()='About Us']") private WebElement About_US;
	@FindBy (xpath = "//a[text()='Athletes']") private WebElement Athletes;
	@FindBy (xpath = "//a[text()='Blog']") private WebElement Blog;
	@FindBy (xpath = "//a[text()='Careers']") private WebElement Careers;
	@FindBy (xpath = "(//a[text()='FAQs'])[2]") private WebElement FAQs;
	
	
	
	
	
	public Mirafit_Footer_Company_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_About_US(WebDriver driver) throws InterruptedException
	{
		String Text = About_US.getText();
		Reporter.log(Text, true);
		
		About_US.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/about-us";
		Reporter.log("The URL for About_US is "+URL,true);
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
	
	public void click_Athletes(WebDriver driver) throws InterruptedException
	{
		String Text = Athletes.getText();
		Reporter.log(Text, true);
		
		Athletes.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/athletes";
		Reporter.log("The URL for Athletes is "+URL,true);
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
	
	public void click_Blog(WebDriver driver) throws InterruptedException
	{
		String Text = Blog.getText();
		Reporter.log(Text, true);
		
		Blog.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/blog";
		Reporter.log("The URL for Blog is "+URL,true);
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
	
	public void click_Careers(WebDriver driver) throws InterruptedException
	{
		String Text = Careers.getText();
		Reporter.log(Text, true);
		
		Careers.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/careers";
		Reporter.log("The URL for Careers is "+URL,true);
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
	
	public void click_FAQs(WebDriver driver) throws InterruptedException
	{
		String Text = FAQs.getText();
		Reporter.log(Text, true);
		
		FAQs.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/faqs";
		Reporter.log("The URL for FAQs is "+URL,true);
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
