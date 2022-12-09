package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Mirafit_Footer_Help_Pom
{

	@FindBy (xpath = "//a[text()='Contact Us']") private WebElement Contact_US;
	@FindBy (xpath = "(//a[text()='FAQs'])[1]") private WebElement FAQs;
	@FindBy (xpath = "(//a[text()='Delivery'])[1]") private WebElement Delivery;
	@FindBy (xpath = "(//a[text()='Returns'])[1]") private WebElement Returns;
	@FindBy (xpath = "(//a[text()='Finance'])[1]") private WebElement Finance;
	@FindBy(xpath = "(//a[text()='Privacy Policy'])[1]") private WebElement Privacy_Policy;
	@FindBy(xpath = "(//a[text()='Terms & Conditions'])[1]") private WebElement Terms_Conditions;
	@FindBy(xpath = "(//a[text()='Product Help Centre'])[1]") private WebElement Product_Help_Centre;
	@FindBy(xpath = "//a[@href='https://mirafit.co.uk/buyers-guides']") private WebElement buyers_guides;

	
	
	
	
	public Mirafit_Footer_Help_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_Contact_US(WebDriver driver) throws InterruptedException
	{
		String Text = Contact_US.getText();
		Reporter.log(Text, true);
		
		Contact_US.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/contact";
		Reporter.log("The URL for Contact us is "+URL,true);
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
	
	public void click_Delivery(WebDriver driver) throws InterruptedException
	{
		String Text = Delivery.getText();
		Reporter.log(Text, true);
		
		Delivery.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/delivery";
		Reporter.log("The URL for Delivery is "+URL,true);
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
	
	public void click_Returns(WebDriver driver) throws InterruptedException
	{
		String Text = Returns.getText();
		Reporter.log(Text, true);
		
		Returns.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/returns";
		Reporter.log("The URL for Returns is "+URL,true);
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
	
	public void click_Finance(WebDriver driver) throws InterruptedException
	{
		String Text = Finance.getText();
		Reporter.log(Text, true);
		
		Finance.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/finance";
		Reporter.log("The URL for Finance is "+URL,true);
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
	
	public void click_Privacy_Policy(WebDriver driver) throws InterruptedException
	{
		String Text = Privacy_Policy.getText();
		Reporter.log(Text, true);
		
		Privacy_Policy.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/privacy-policy";
		Reporter.log("The URL for Privacy_Policy is "+URL,true);
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
	
	public void click_Terms_Conditions(WebDriver driver) throws InterruptedException
	{
		String Text = Terms_Conditions.getText();
		Reporter.log(Text, true);
		
		Terms_Conditions.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/terms-and-conditions";
		Reporter.log("The URL for Terms_Conditions is "+URL,true);
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
	
	public void click_Product_Help_Centre(WebDriver driver) throws InterruptedException
	{
		String Text = Product_Help_Centre.getText();
		Reporter.log(Text, true);
		
		Product_Help_Centre.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/product-help-centre";
		Reporter.log("The URL for Product_Help_Centre is "+URL,true);
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
	
	public void click_buyers_guides(WebDriver driver) throws InterruptedException
	{
		String Text = buyers_guides.getText();
		Reporter.log(Text, true);
		
		buyers_guides.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/buyers-guides";
		Reporter.log("The URL for buyers_guides is "+URL,true);
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
	}
	
	
	
	
	
	
	
	
	
	
}
