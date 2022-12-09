package POM_Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Mirafit_Categories_Strength_Equipement_Pom 
{
	
	@FindBy (xpath = "(//a[@class='level-top'])[1]") private WebElement Strength_Equipment;
	@FindBy(xpath = "(//div[@class='block-title'])[2]") private WebElement Categories_Title;
	@FindBy(xpath = "(//ul[@class='level0 nav-submenu'])[1]") private List<WebElement> All_Categories;
	@FindBy (xpath = "((//ul[@class='level0 nav-submenu'])[1]//a)[1]") private WebElement Cable_Machines_Attachments;
	@FindBy (xpath = "(//span[text()='Landmine Posts & Handles'])[3]") private WebElement Landmine_Posts_Handles;
	@FindBy (xpath = "(//span[text()='Parallel Bars'])[3]") private WebElement Parallel_Bars;
	@FindBy (xpath = "(//span[text()='Power Cages & Racks'])[3]") private WebElement Power_Cages_Racks;
	@FindBy (xpath = "(//span[text()='Pull Up Bars'])[3]") private WebElement Pull_Up_Bars;
	
	@FindBy (xpath = "(//button[@class='action tocart primary'])[1]") private WebElement Add_To_cart_Button;
	@FindBy(xpath = "(//span[@class='caret'])[1]") private WebElement CartButton;
	@FindBy(xpath = "//a[@class='action viewcart']") private WebElement ViewAndCartButton;
	@FindBy(xpath = "//a[@class='action action-delete']") private WebElement RemoveItemfromcart;
	
	

	
	
	public Mirafit_Categories_Strength_Equipement_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Click_Strength_Equipment(WebDriver driver) throws InterruptedException
	{
		Strength_Equipment.click();
		Thread.sleep(2000);
	}
	
	public void Click_Categories_Title()
	{
		String Categories_Title_text = Categories_Title.getText();
		Reporter.log(Categories_Title_text, true);
		
	}
	
	public void Get_All_Categories()
	{
		 List<WebElement> alltext = All_Categories;
		 for(WebElement s1:alltext)
		 {
			 Reporter.log(s1.getText(), true);
			 
		 }
	}
	
	
	public void Click_Cable_Machines_Attachments(WebDriver driver) throws InterruptedException
	{
		Cable_Machines_Attachments.click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		String expected_url = "https://mirafit.co.uk/strength-equipment/gym-machines-attachments.html";
		if(url.equalsIgnoreCase(expected_url))
		{
			Reporter.log("The actual and expected URL's are same ", true);
		}
		else
		{
			Reporter.log("The actual and expected URL's are different ", true);
		}
	}
	
	public void Click_Landmine_Posts_Handles(WebDriver driver) throws InterruptedException
	{
		Landmine_Posts_Handles.click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		String expected_url = "https://mirafit.co.uk/strength-equipment/cable-machines-attachments.html";
		if(url.equalsIgnoreCase(expected_url))
		{
			Reporter.log("The actual and expected URL's are same ", true);
		}
		else
		{
			Reporter.log("The actual and expected URL's are different ", true);
		}
	}
	
	public void Click_Parallel_Bars(WebDriver driver) throws InterruptedException
	{
		Parallel_Bars.click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		String expected_url = "https://mirafit.co.uk/strength-equipment/cable-machines-attachments.html";
		if(url.equalsIgnoreCase(expected_url))
		{
			Reporter.log("The actual and expected URL's are same ", true);
		}
		else
		{
			Reporter.log("The actual and expected URL's are different ", true);
		}
	}
	
	public void Click_Power_Cages_Racks(WebDriver driver) throws InterruptedException
	{
		Power_Cages_Racks.click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		String expected_url = "https://mirafit.co.uk/strength-equipment/cable-machines-attachments.html";
		if(url.equalsIgnoreCase(expected_url))
		{
			Reporter.log("The actual and expected URL's are same ", true);
		}
		else
		{
			Reporter.log("The actual and expected URL's are different ", true);
		}
	}
	
	public void Click_Pull_Up_Bars(WebDriver driver) throws InterruptedException
	{
		Pull_Up_Bars.click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		String expected_url = "https://mirafit.co.uk/strength-equipment/cable-machines-attachments.html";
		if(url.equalsIgnoreCase(expected_url))
		{
			Reporter.log("The actual and expected URL's are same ", true);
		}
		else
		{
			Reporter.log("The actual and expected URL's are different ", true);
		}
	}
	
	
	
	
	public void Click_Add_To_cart_Button(WebDriver driver) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(Add_To_cart_Button).perform();
		Add_To_cart_Button.click();
//		Thread.sleep(2000);
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
	
	public void Click_Remove_item_from_Cart(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table[@class='data table totals']/tbody//td)[2]")));
		RemoveItemfromcart.click();
		Thread.sleep(2000);
		driver.navigate().to("https://mirafit.co.uk/strength-equipment.html");
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}








