package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Mirafit_Footer_Pom
{  

	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/strength-equipment.html'])[3]") private WebElement Strength_Equipment;
//	@FindBy (xpath = "//a[text()='Strength Equipment'") private WebElement Strength_Equipment;
	@FindBy (xpath = "//a[@href='https://mirafit.co.uk/weights-bars.html']") private WebElement Weights_Bars;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/conditioning.html'])[3]") private WebElement Conditioning;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/storage.html'])[3]") private WebElement Gym_Storage;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/accessories.html'])[3]") private WebElement Accessories;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/packages.html'])[3]") private WebElement Packages;
	@FindBy (xpath = "(//a[@href='https://mirafit.co.uk/shop-by-sport.html'])[3]") private WebElement Shop_by_sport;
	
	@FindBy (xpath = "//a[text()='Contact Us']") private WebElement Contact_US;
	@FindBy (xpath = "(//a[text()='FAQs'])[1]") private WebElement FAQs;
	@FindBy (xpath = "(//a[text()='Delivery'])[1]") private WebElement Delivery;
	@FindBy (xpath = "(//a[text()='Returns'])[1]") private WebElement Returns;
	@FindBy (xpath = "(//a[text()='Finance'])[1]") private WebElement Finance;
	@FindBy(xpath = "(//a[text()='Privacy Policy'])[1]") private WebElement Privacy_Policy;
	@FindBy(xpath = "(//a[text()='Terms & Conditions'])[1]") private WebElement Terms_Conditions;
	@FindBy(xpath = "(//a[text()='Product Help Centre'])[1]") private WebElement Product_Help_Centre;
	@FindBy(xpath = "//a[@href='https://mirafit.co.uk/buyers-guides']") private WebElement buyers_guides;
	
	@FindBy (xpath = "//a[text()='About Us']") private WebElement About_US;
	@FindBy (xpath = "//a[text()='Athletes']") private WebElement Athletes;
	@FindBy (xpath = "//a[text()='Blog']") private WebElement Blog;
	@FindBy (xpath = "//a[text()='Careers']") private WebElement Careers;
	@FindBy (xpath = "(//a[text()='FAQs'])[2]") private WebElement FAQs1;
	
	@FindBy (xpath = "//span[@class='ib ib-hover ic ic-lg ic-facebook']") private WebElement Facebook;
	@FindBy (xpath = "//span[@class='ib ib-hover ic ic-lg ic-instagram']") private WebElement Instagram;
	@FindBy (xpath = "//span[@class='ib ib-hover ic ic-lg ic-youtube']") private WebElement Youtube;
	@FindBy (xpath = "//a[@class='tik-tok-icon ']") private WebElement Tik_Tok;
	
	
	
	
	public Mirafit_Footer_Pom(WebDriver driver)
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
	
	public void click_FAQs1(WebDriver driver) throws InterruptedException
	{
		String Text = FAQs1.getText();
		Reporter.log(Text, true);
		
		FAQs1.click();
		Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
		String actualurl = "https://mirafit.co.uk/faqs";
		Reporter.log("The URL for FAQs1 is "+URL,true);
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
