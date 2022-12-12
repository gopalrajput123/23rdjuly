package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxutility.Utility;

public class NeoStoxSignLogin
{
	
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobileNumField;
	
    @FindBy(xpath="//a[@id='lnk_signup1']")private WebElement singInButton;
    
    public NeoStoxSignLogin(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void sendMobileNum(WebDriver driver,String MobNumber)
    {
    	Utility.wait(driver,1000);
    	mobileNumField.sendKeys(MobNumber);
    	Reporter.log("sending mobile number",true);
    }
    
    public void clickOnSignInButton(WebDriver driver)
    {
    	Utility.wait(driver,1000);
    	singInButton.click();
    	Reporter.log("clicking on signInButton",true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
