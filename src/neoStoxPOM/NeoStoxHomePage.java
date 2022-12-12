package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxutility.Utility;

public class NeoStoxHomePage
{
	@FindBy(id="lbl_username")private WebElement userName;
	
	@FindBy(id="lbl_curbalancetop")private WebElement balance;
	
	@FindBy(xpath="//span[text()='Logout']")private WebElement logoutbutton;

	
	
	public NeoStoxHomePage(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);
	}
	
	public String getUserName()
	{
		String actualuserName= userName.getText();
		Reporter.log("getting userName",true);
		return actualuserName;
	}
	
	public String getBalance(WebDriver driver)
	{
		
		Utility.wait(driver, 1000);
        String actualbalance=balance.getText();
		Reporter.log("getting balance",true);
		return actualbalance;
		
	}
	
	public void LogOutFromNeoStox(WebDriver driver)
	{
		Utility.wait(driver, 1000);
		userName.click();
		Utility.wait(driver, 1000);
		logoutbutton.click();
		Reporter.log("logout from neostox",true);
	}
	
	
	
	
	
	
	
	
	
	
}
