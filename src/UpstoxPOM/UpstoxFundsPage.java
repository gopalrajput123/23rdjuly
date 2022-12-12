package UpstoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxFundsPage
{

	@FindBy(xpath="(//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div[2]")private WebElement availabledFunds;
	
	
	public UpstoxFundsPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	
	}
	
	public void checkAvailableFunds()
	{
		String MyFunds=availabledFunds.getText();
		System.out.println("Funds available to trade is "+MyFunds);

	}

	
	
	
	
	
	
	
	
}
