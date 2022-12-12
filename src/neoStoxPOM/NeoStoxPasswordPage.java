package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxutility.Utility;

public class NeoStoxPasswordPage
   {

	    @FindBy(id="txt_accesspin")private WebElement PasswordField;
	    
	    @FindBy(id="lnk_submitaccesspin")private WebElement SubmitButton;
   

    public void PasswordPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void sendPassword(WebDriver driver,String pass)
    {
    	Utility.wait(driver,  1000);
    	PasswordField.sendKeys(pass);
    	Reporter.log("sending password",true);
    }
    
    public void ClickOnSubmitButton(WebDriver driver)
    {
    	Utility.wait(driver,  1000);
    	SubmitButton.click();
    	Reporter.log("clicking on submit button",true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
   }
