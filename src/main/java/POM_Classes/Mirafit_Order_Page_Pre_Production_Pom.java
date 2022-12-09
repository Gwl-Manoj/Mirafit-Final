package POM_Classes;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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

public class Mirafit_Order_Page_Pre_Production_Pom 
{
	@FindBy(xpath = "//a[text()='My Orders']") private WebElement My_Orders;
	@FindBy (xpath = "//td[@class='col id']") private WebElement Order_ID;
	@FindBy(xpath = "//td[@class='col date']") private WebElement Order_Date;
	@FindBy(xpath = "//td[@class='col total']") private WebElement Order_Total;
	@FindBy(xpath = "//td[@class='col status']") private WebElement Order_Status;
	@FindBy(xpath = "//td[@class='col actions']") private WebElement Order_Actions;
	@FindBy(xpath = "(//a[@class='action view'])[1]") private WebElement View_Order_Button;
	@FindBy(xpath = "//span[@class='order-status']") private WebElement Order_Status1;
	@FindBy(xpath = "//tbody/tr/td/strong[@class='product name product-item-name']") private WebElement Product_Name;
	@FindBy(xpath = "//td[@class='col sku']") private WebElement Product_SKU; 
	@FindBy(xpath = "//td[@class='col price']") private WebElement Product_Price; 
	@FindBy(xpath = "//td[@class='col qty']") private WebElement Product_Quantity;
	@FindBy(xpath = "//td[@class='col subtotal']") private WebElement Product_Subtotal;
	
	@FindBy(xpath = "//li/strong[text()='Items Ordered']") private WebElement Items_Ordered_Button;
//	@FindBy(xpath = "(//input[@class='radio'])[3]") private WebElement Card_Radio_Button;
//	@FindBy(xpath = "//input[@class='number']") private WebElement Card_Number;
//	@FindBy(xpath = "//input[@id='expirationDate-target-prev']") private WebElement Card_Date_Year;
//	@FindBy(xpath = "//input[@class='cvv']") private WebElement Card_CVV;
//	@FindBy(xpath = "//button[@class='action primary checkout btn-placeorder']") private WebElement Placeorder;
	
	
	
	
	
	public Mirafit_Order_Page_Pre_Production_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_My_Orders(WebDriver driver) throws InterruptedException
	{
		
		My_Orders.click();
		Thread.sleep(2000);
		String Actual_Url = driver.getCurrentUrl();
		String  Expected_Url = "https://preprod.mirafit.co.uk/sales/order/history/";
		if(Expected_Url.equals(Actual_Url))
		{
			Reporter.log("The Actual and Expected URL's are same i.e. "+Actual_Url, true);
		}
		
		
	}
	

	
	public void Get_Order_Details() throws InterruptedException
	{
		String orderid = Order_ID.getText();
		String expected_orderID = "101486290";
		if(expected_orderID.equals(orderid))
		{
			Reporter.log("The Order_ID is same i.e. "+orderid, true);
		}
		else
		{
			Reporter.log("The Order_ID is different i.e. "+orderid, true);
		}
		
		String order_Date = Order_Date.getText();
		String expected_order_Date = "7/19/22";
		if(expected_order_Date.equals(order_Date))
		{
			Reporter.log("The Order_Date is same i.e. "+order_Date, true);
		}
		else
		{
			Reporter.log("The Order_Date is different i.e. "+order_Date, true);
		}
		
		
		String order_Total = Order_Total.getText();
		String expected_order_Total = "£4.95";
		if(expected_order_Total.equals(order_Total))
		{
			Reporter.log("The Order_Total is same i.e. "+order_Total, true);
		}
		else
		{
			Reporter.log("The Order_Total is different i.e. "+order_Total, true);
		}
		
		String order_Status = Order_Status.getText();
		String expected_order_Status = "Processing";
		if(expected_order_Status.equals(order_Status))
		{
			Reporter.log("The Order_Status is same i.e. "+order_Status, true);
		}
		else
		{
			Reporter.log("The Order_Status is different i.e. "+order_Status, true);
		}
		
		String order_Actions = Order_Actions.getText();
		String expected_order_Actions = "View Order Reorder";
		if(expected_order_Actions.equals(order_Actions))
		{
			Reporter.log("The Order_Actions is same i.e. "+order_Actions, true);
		}
		else
		{
			Reporter.log("The Order_Actions is different i.e. "+order_Actions, true);
		}
		
		View_Order_Button.click();
		Thread.sleep(2000);
		String expected_Order_Status = Order_Status1.getText();
		
		if(order_Status.equals(expected_Order_Status))
		{
			Reporter.log("The Order_Status is same i.e. "+order_Status, true);
		}
		else
		{
			Reporter.log("The Order_Status is different i.e. "+order_Status, true);
		}
//		Thread.sleep(2000);
		
		
//		Items_Ordered_Button.click();
//		
//		String product_Name = Product_Name.getText();
//		Reporter.log(product_Name);
//		
		
	}
	
	public void Get_Product_Name(WebDriver driver)
	{
		String product_Name = Product_Name.getText();
		Reporter.log(product_Name);
	}
	
	public void Get_Product_SKU(WebDriver driver)
	{
		String product_SKU = Product_SKU.getText();
		Reporter.log(product_SKU);
	}
	
	public void Get_Product_Price()
	{
		String product_Price = Product_Price.getText();
		Reporter.log(product_Price);
	}
	
	public void Get_Product_Quantity()
	{
		String product_Quantity = Product_Quantity.getText();
		Reporter.log(product_Quantity);
	}
	
	public void Get_Product_Subtotal()
	{
		String product_Subtotal = Product_Subtotal.getText();
		Reporter.log(product_Subtotal);
	}
	
	public void Get_Product_Name()
	{
		String product_Name = Product_Name.getText();
		Reporter.log(product_Name);
	}
	
	public void Click_View_Order_Button(WebDriver driver) throws InterruptedException
	{
		View_Order_Button.click();
		Thread.sleep(2000);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fotorama__stage__frame fotorama__active fotorama_vertical_ratio fotorama__loaded fotorama__loaded--img']")));
		
	}
	

	
	
	
//	public void Click_Checkout(WebDriver driver)
//	{
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("(//div[@class='payment-method-title field choice'])[2]"))).perform();
//		driver.findElement(By.xpath("(//input[@class='radio'])[3]")).click();
//		
//	}
//	
//	public void Set_Card_Number(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
//	{
//		
//		driver.switchTo().frame("braintree-hosted-field-number");
//		Thread.sleep(2000);
//		Card_Number.sendKeys("4111 1111 1111 1111",Keys.TAB);
//	}
//	
//	public void Set_Card_Date_Year(WebDriver driver) throws EncryptedDocumentException, IOException
//	{
////		driver.findElement(By.xpath("//input[@class='expirationDate']")).click();
//		driver.switchTo().frame("braintree-hosted-field-expirationDate");
//		
//		Card_Date_Year.sendKeys("112023",Keys.TAB);
//	}
//	
//	public void Set_Card_CVV(WebDriver driver) throws EncryptedDocumentException, IOException
//	{
//		driver.findElement(By.xpath("//input[@class='cvv']")).click();
//		driver.switchTo().frame("braintree-hosted-field-cvv");
//		Card_CVV.sendKeys("123",Keys.TAB);
//	}
//	
//	public void Click_Placeorder_Button()
//	{
//		Placeorder.click();
//	}
//	
//	public void Click_Checkoutpropcedure(WebDriver driver) throws InterruptedException
//	{
//		driver.navigate().to("https://preprod.mirafit.co.uk/onestepcheckout.html");
//		String CheckOut_Url = driver.getCurrentUrl();
//		Reporter.log("The URL for Checkout is "+CheckOut_Url, true);
//		Thread.sleep(2000);
//		
////		driver.findElement(By.xpath("//textarea[@class='admin__control-textarea']")).sendKeys("ABC");
//	}
//	
	

}
