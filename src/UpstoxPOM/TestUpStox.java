package UpstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpStox {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://login-v2.upstox.com/");
		
		 Thread.sleep(1000);
		 //create object of UpStoxLogInPage
		 UpstoxLoginPage login=new UpstoxLoginPage(driver);
		 login.enterUserID();
		 login.enterPassword();
		 login.ClickonSignInButton();
		 
		//create an object UpstoxPassCodePage
		 Thread.sleep(1000);
		 UpstoxPasscodePage passcode=new UpstoxPasscodePage(driver);
		 passcode.enterPasscode();
		 
		//create an object of UpstoxWelcomePage
		 Thread.sleep(4000);
		 UpstoxWelcomePage welcome=new UpstoxWelcomePage(driver);
		 welcome.ClickOnnoIAmGoodButton();
		 
		//create an object of UpstoxHomePage
		 Thread.sleep(1000);
		 UpstoxHomePage home=new UpstoxHomePage(driver);
		 home.validateuserID(driver);
		 home.clickonFundsButton();
		 
		//create an object of UpStoxFundsPage
		 Thread.sleep(1000);
		 UpstoxFundsPage funds=new UpstoxFundsPage(driver);
		 funds.checkAvailableFunds();
		 home.logOutFromApplication();
		 
		 driver.close();
	}

}
