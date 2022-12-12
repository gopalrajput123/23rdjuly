package upstoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UpstoxPasscodePage
{

	//variable declaration
	
	@FindBy(name="yob")private WebElement passcodeField;
	
	//variable initisialization using constructor-->uses-->pageFactory class-->(method)-->initElements
	
	public UpstoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//variable usages using method
	
	public void enterPasscode()
	{
		passcodeField.sendKeys("1993");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
