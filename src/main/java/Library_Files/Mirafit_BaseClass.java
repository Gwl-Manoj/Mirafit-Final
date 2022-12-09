package Library_Files;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mirafit_BaseClass 
{
	public static final String USERNAME = "sonambindal_dgyqah";
	public static final String AUTOMATE_KEY = "ixYMdE6jb3MEDZJr46XX";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public WebDriver driver;
	public void open_browser() throws InterruptedException     // Open the Browser

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("acceptInsecureCerts");
		
//		MutableCapabilities capabilities = new MutableCapabilities();
//		capabilities.setCapability("browserName", "Chrome");
//		capabilities.setCapability("browserVersion", "latest");
//		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//		browserstackOptions.put("os", "Windows");
//		browserstackOptions.put("osVersion", "11");
//		browserstackOptions.put("local", "false");
//		browserstackOptions.put("seleniumVersion", "3.14.0");
//		capabilities.setCapability("bstack:options", browserstackOptions);
//
////		driver = new RemoteWebDriver(new URL(URL), capabilities);
//		driver = new RemoteWebDriver(new java.net.URL(URL), capabilities);
	
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Softwares\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();// Maximize the browser
		driver.get("https://mirafit.co.uk/");  // Hit/open the url "https://gwl:gwl@preprod.mirafit.co.uk/"
//		driver.get("https://gwl:gwl@preprod.mirafit.co.uk/");
		
	
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept Cookies']")));
		driver.findElement(By.xpath("//button[text()='Accept Cookies']")).click();
		Thread.sleep(2000);

		
//		
	
	
	
	
	
	
	
	}	
}
