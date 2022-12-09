package POM_Classes;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Library_Files.Utility;

public class Mirafit_CheckOut_PayPalPre_Production_Pom 
{
	@FindBy(xpath = "(//span[@class='caret'])[7]") private WebElement Accessories;
	@FindBy (xpath = "(//ul[@class='level0 nav-submenu nav-panel--dropdown nav-panel']//span)[54]") private WebElement ClothingAndApparel;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//img[@class='product-image-photo']") private WebElement ProductImage;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//span[@class='icon ib ib-hover ic ic-heart ']") private WebElement wishlist;
	@FindBy(xpath = "//div[@class='message-success success message']") private WebElement wishlist_message;
	@FindBy(xpath = "//a[text()='here']") private WebElement Continue_Shopping;
	@FindBy(xpath = "(//div[@class='actions-primary'])[2]//button[@class='action tocart primary']") private WebElement ViewDetails;
	@FindBy(xpath = "//div[@class='stock available']") private WebElement Stock;
	@FindBy(xpath = "//a[@class='action view']") private WebElement Reviews;
	@FindBy(id = "attribute446") private WebElement Choice;
	@FindBy(id = "product-addtocart-button") private WebElement AddToCart;
//	@FindBy(xpath = "(//span[@class='caret'])[1]") private WebElement CartButton; 
	@FindBy(xpath = "//span[@class='inner-heading']") private WebElement CartButton; 
//	@FindBy(xpath = "//a[@class='action viewcart']") private WebElement ViewAndCartButton;
	@FindBy(xpath = "//button[@class='action primary checkout']") private WebElement ViewAndCartButton;
	@FindBy(xpath = "//span[@class='price']") private WebElement Cart_Price;
	
	@FindBy(xpath = "//button[@class='action primary checkout']") private WebElement CheckOut_Button;
	@FindBy(xpath = "(//input[@class='radio'])[3]") private WebElement Card_Radio_Button;
	@FindBy(xpath = "//input[@class='number']") private WebElement Card_Number;
	@FindBy(xpath = "//input[@id='expirationDate-target-prev']") private WebElement Card_Date_Year;
	@FindBy(xpath = "//input[@class='cvv']") private WebElement Card_CVV;
	@FindBy(xpath = "//button[@class='action primary checkout btn-placeorder']") private WebElement Placeorder;
	
	
	
	
	
	public Mirafit_CheckOut_PayPalPre_Production_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Move_To_Accessories(WebDriver driver) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(Accessories).perform();
		Thread.sleep(2000);
		ClothingAndApparel.click();
		Thread.sleep(2000);
		List<WebElement> allproducts = driver.findElements(By.xpath("//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']"));  // Get all product list
		
		for(WebElement s1:allproducts)
		{
			System.out.println(s1.getText());
		}
		
	}
	
	public void GetProductImage()
	{
		if(ProductImage.isDisplayed())
		{
			Reporter.log("Product Image Displayed", true);
		}
		else
		{
			Reporter.log("Product Image Not Displayed", true);
		}
	}
	
	public void click_Wish_List() throws InterruptedException
	{
		wishlist.click();
		Thread.sleep(2000);
	}
	
	public void Get_Wishlist_Message() throws InterruptedException
	{
		String Wishlistmessage = wishlist_message.getText();
		Reporter.log(Wishlistmessage, true);
		Thread.sleep(2000);
	}
	
	public void Click_Continue_shopping() throws InterruptedException
	{
		Continue_Shopping.click();
//		Thread.sleep(2000);
	}
	
	public void Click_View_Details(WebDriver driver) throws InterruptedException
	{
		ViewDetails.click();
//		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fotorama__stage__frame fotorama__active fotorama_vertical_ratio fotorama__loaded fotorama__loaded--img']")));
		
	}
	
	public void Get_Stock()
	{
		String stock = Stock.getText();
		Reporter.log(" The Product is "+stock, true);	
	}
	
	public void Get_Reviews()
	{
		String Reviews1 = Reviews.getText();
		Reporter.log(Reviews1, true);
	}
	
	public void Click_Choice()
	{	
		Select choice = new Select(Choice);
		choice.selectByValue("6335");
	}
	
	public void Click_Add_To_Cart(WebDriver driver) throws InterruptedException
	{
		AddToCart.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='minicart-icon-price']")));	
	}
	
	public void Click_On_Cart_Button(WebDriver driver) throws InterruptedException
	{
		String cart_price=Cart_Price.getText();
		Reporter.log("The cart price is "+cart_price, true);
		Actions act = new Actions(driver);
		act.moveToElement(CartButton).perform();
		ViewAndCartButton.click();
		Thread.sleep(2000);
	}
	
	
	public void Click_Checkout_button(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='data table totals']/tbody//td)[2]")));
		CheckOut_Button.click();
		Thread.sleep(2000);
		driver.get("https://preprod.mirafit.co.uk/onestepcheckout.html");
	
		String CheckOut_Url = driver.getCurrentUrl();
		Reporter.log("The URL for Checkout is "+CheckOut_Url, true);
		
		

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='checkout-payment-method']")));
//		String CheckOut_Url = driver.getCurrentUrl();
//		Reporter.log("The URL for Checkout is "+CheckOut_Url, true);
//		Card_Radio_Button.click();
		
		driver.findElement(By.xpath("//textarea[@class='admin__control-textarea']")).sendKeys("ABC");
		
		
	}
	
	public void Click_Checkout(WebDriver driver) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//div[@class='payment-method-title field choice'])[1]"))).perform();
		driver.findElement(By.xpath("(//input[@class='radio'])[2]")).click();
		
		
		driver.switchTo().frame("zoid-component-frame zoid-visible");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='paypal-button-text']")));
		
		act.moveToElement(driver.findElement(By.xpath("//span[@class='paypal-button-text']"))).perform();
		String text = driver.findElement(By.xpath("//*[@id=\"paypal-animation-content\"]/div[1]/div[1]/div/span")).getText();
		Reporter.log(text, true);
		driver.findElement(By.xpath("//*[@id=\"paypal-animation-content\"]/div[1]/div[1]/div/span")).click();
		
	}
	
	public void Set_Card_Number(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		driver.switchTo().frame("braintree-hosted-field-number");
		Thread.sleep(2000);
		Card_Number.sendKeys("4111 1111 1111 1111",Keys.TAB);
	}
	
	public void Set_Card_Date_Year(WebDriver driver) throws EncryptedDocumentException, IOException
	{
//		driver.findElement(By.xpath("//input[@class='expirationDate']")).click();
		driver.switchTo().frame("braintree-hosted-field-expirationDate");
		
		Card_Date_Year.sendKeys("112023",Keys.TAB);
	}
	
	public void Set_Card_CVV(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		driver.findElement(By.xpath("//input[@class='cvv']")).click();
		driver.switchTo().frame("braintree-hosted-field-cvv");
		Card_CVV.sendKeys("123",Keys.TAB);
	}
	
	public void Click_Placeorder_Button()
	{
		Placeorder.click();
	}
	
	public void Click_Checkoutpropcedure(WebDriver driver) throws InterruptedException
	{
		driver.navigate().to("https://preprod.mirafit.co.uk/onestepcheckout.html");
		String CheckOut_Url = driver.getCurrentUrl();
		Reporter.log("The URL for Checkout is "+CheckOut_Url, true);
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//textarea[@class='admin__control-textarea']")).sendKeys("ABC");
	}
	
	

}
