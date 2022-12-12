package UpstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import screenShot.Scrolling;


public class UpstoxHomePage
{

	//variable declaration
	
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userID;
	
	@FindBy(id="funds")private WebElement fundsButton;

	@FindBy(xpath="//div[text()='Logout']")private WebElement logoutButton;

	
	public UpstoxHomePage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}

	public void validateuserID(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		Scrolling.scrollIntoView(driver,userID);
		
		String actualUserID=userID.getText();
		String expectedUserID="nikhil.s";
		
		if(actualUserID.equalsIgnoreCase(expectedUserID))
		{
			System.out.println("Expected and Actual userID are mathching, TC is passed");
		}
		else
		{
			System.out.println("Expected and Actual userID are not mathching, TC is failled");
		}
		
	}
	
	    public void clickonFundsButton()
	   {
	    	fundsButton.click();
	   }
	
	   
	    public void logOutFromApplication() throws InterruptedException
	    {
	    	userID.click();
			Thread.sleep(500);
	    	logoutButton.click();
	    }
	
	
	
	
	
	
	
}
