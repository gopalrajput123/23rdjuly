package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.Reporter;

public class UpStoxApplicationStudy
{
  @Test
  
  public void validateUserName()
  {
	  Reporter.log("user name is validated",true);
  }
  
  @BeforeMethod
  public void logInToUpstox()
  {
	  Reporter.log("Enter UM,Enter PWD,Enter Passcode,Login to Appliction",true);
 
  }
  
  @AfterMethod
  public void logOutFromeUpstoxApplication() 
  {
	  Reporter.log("Click on logout,logout to Appliction",true);
  }

  @BeforeClass
  public void LaunchTheBrowser()
  {
	  Reporter.log("Launch Browser And Enter URL",true);

  }
  
  @AfterClass
  public void CloseBrowser() 
  {
	  Reporter.log("Close Browser",true);
 
  }

}
