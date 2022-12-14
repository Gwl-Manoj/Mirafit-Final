package POM_Classes;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Mirafit_ParallelBars_Pom 
{

	
	@FindBy (xpath = "(//span[@class='caret'])[2]") private WebElement strength;
	@FindBy(xpath = "(//ul[@class='level0 nav-submenu nav-panel--dropdown nav-panel']//a)[6]") private WebElement parallelBars;
	@FindBy(xpath = "//div[@class='products wrapper grid items-grid items-grid-partitioned category-products-grid single-line-name hover-effect equal-height ']") private WebElement Allproducts;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//img[@class='product-image-photo']") private WebElement ProductImage;
	@FindBy(xpath = "(//div[@class='product-item-info imgdim-x'])[2]//span[@class='icon ib ib-hover ic ic-heart ']") private WebElement wishlist;
	@FindBy(xpath = "//div[@class='message-success success message']") private WebElement wishlist_message;
	@FindBy(xpath = "//div[@class='message-error error message']") private WebElement wishlist_error_message;
	@FindBy(xpath = "//a[text()='here']") private WebElement Continue_Shopping;
	@FindBy(xpath = "(//a[@class='product-item-link'])[2]") private WebElement ViewDetails;
	@FindBy(xpath = "//div[@class='stock available']") private WebElement Stock;
	@FindBy(xpath = "//div[@class='reviews-actions']") private WebElement Reviews;
	@FindBy(id = "attribute447") private WebElement Choice;
	@FindBy(id = "product-addtocart-button") private WebElement AddToCart;
	@FindBy(xpath = "(//span[@class='caret'])[1]") private WebElement CartButton;
	@FindBy(xpath = "//a[@class='action viewcart']") private WebElement ViewAndCartButton;
	@FindBy(xpath = "//div[@class='message message-success success']") private WebElement CartMessage;
	@FindBy(id = "empty_cart_button") private WebElement RemoveItemfromcart;
	@FindBy(xpath = "//div[@class='cart-empty']") private WebElement EmptyCartMessage;
	
	
	
	public Mirafit_ParallelBars_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Moveto_Strength(WebDriver driver) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(strength).perform();
		parallelBars.click();
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
	
	public void Get_Wishlist_Message(WebDriver driver) throws InterruptedException
	{
		if(wishlist_error_message.isDisplayed())
		{
			
			String wishlist_error_message1=wishlist_error_message.getText();
			Reporter.log(wishlist_error_message1, true);
			driver.navigate().refresh();
			Thread.sleep(2000);
			wishlist.click();
			Thread.sleep(2000);
			String Wishlistmessage = wishlist_message.getText();
			Reporter.log(Wishlistmessage, true);
			Thread.sleep(2000);
			
			
		}
		
		
		if(wishlist_message.isDisplayed())
		{
				
			String Wishlistmessage = wishlist_message.getText();
			Reporter.log(Wishlistmessage, true);
			Thread.sleep(2000);
			
		}
		
		
//		String Wishlistmessage = wishlist_message.getText();
//		Reporter.log(Wishlistmessage, true);
//		Thread.sleep(2000);
		
		
		
	}
	
	public void Click_Continue_shopping() throws InterruptedException
	{
		Continue_Shopping.click();
		Thread.sleep(2000);
	}
	
	public void Click_View_Details(WebDriver driver) throws InterruptedException
	{
		ViewDetails.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='fotorama__img magnify-opaque']")));
	}
	
	public void Get_Stock()
	{
		if(Stock.isDisplayed())
		{
			String stock = Stock.getText();
			Reporter.log(" The Product is "+stock, true);	
		}
		else
		{
			Reporter.log("No Stock", true);
		}
		
	}
	
	public void Get_Reviews()
	{
		if(Reviews.isDisplayed())
		{
			String Reviews1 = Reviews.getText();
			Reporter.log(Reviews1, true);
		}
		
		else
		{
			Reporter.log("No reviews", true);
		}
		
	}
	
	public void Click_Choice()
	{	
		Select choice = new Select(Choice);
		choice.selectByValue("5438");
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
		Actions act = new Actions(driver);
		act.moveToElement(CartButton).perform();
		ViewAndCartButton.click();
		
		Thread.sleep(2000);

		
	}
	
	
	public void Click_Remove_item_from_Cart(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='data table totals']/tbody//td)[2]")));
		RemoveItemfromcart.click();
	}
	
	public void Get_EmptyCartMessage()
	{
		String Emptycart = EmptyCartMessage.getText();
		Reporter.log(Emptycart, true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
