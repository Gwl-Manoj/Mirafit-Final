package Library_Files;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mirafit_BaseClass_Pre_Production 
{

	public WebDriver driver;
	public void open_browser()     // Open the Browser
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("acceptInsecureCerts");
		
	
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Softwares\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();// Maximize the browser  
		
		driver.get("https://gwl:gwl@preprod.mirafit.co.uk/");   // Hit/open the url
	
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept Cookies']")));
		driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();

		
		
	
	
	
	
	
	
	
	}	
}
