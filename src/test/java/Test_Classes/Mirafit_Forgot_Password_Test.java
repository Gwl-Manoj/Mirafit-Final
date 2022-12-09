package Test_Classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Mirafit_BaseClass;
import POM_Classes.Mirafit_Forgot_Password_Pom;

public class Mirafit_Forgot_Password_Test extends Mirafit_BaseClass
{

	int TCID;
	Mirafit_Forgot_Password_Pom Forgot_Password;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{
		open_browser();
		
		Forgot_Password = new Mirafit_Forgot_Password_Pom(driver);
		
		
	}
	

	@Test
	public void Forgot_password() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		TCID=01;
	
		Forgot_Password.Click_ProfileButton();
		
		Forgot_Password.Forgot_Password();
		
	}
}
