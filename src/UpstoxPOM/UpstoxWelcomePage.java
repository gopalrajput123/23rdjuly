package UpstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomePage
{

	//variable declaration
	
	@FindBy(xpath="//div[text()='No, I’m good']")private WebElement noIAmGoodButton;
	
	//variable initialization using constructor-->uses-->pageFactory class-->(method)-->initElements

	public UpstoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//variable usages using method
	
	public void ClickOnnoIAmGoodButton()
	{
		noIAmGoodButton.click();
	}
	
	
	
	
}
