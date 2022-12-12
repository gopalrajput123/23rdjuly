package UpstoxPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UpstoxLoginPage 
{
	//variable declaration
	
	@FindBy(name="userId")private WebElement userID;
	
	@FindBy(name="password")private WebElement password;
	
	@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement signInButton;
	
	
	//variable initializtion using constructor-->uses-->pageFactory class-->(method)-->initElements
	
	public UpstoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//variable usage using method
	
	public void enterUserID()
	{
		userID.sendKeys("6VBYG9");
	}
	
	public void enterPassword()
	{
		password.sendKeys("Nikhil@1234");
	}
	
	public void ClickonSignInButton()
	{
		signInButton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
