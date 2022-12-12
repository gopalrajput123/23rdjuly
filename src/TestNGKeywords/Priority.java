package TestNGKeywords;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Priority 
{
  @Test(priority=-4)
  public void A() 
  {
	  Reporter.log("A TC is running",true);  
  }
  
 @Test(priority=1)
  public void D() 
  {
	  Reporter.log("D TC is running",true);  
  }
 
 @Test
 public void C() 
 {
	  Reporter.log("C TC is running",true);  
 }
 
 @Test(priority=-1)
 public void E() 
 {
	  Reporter.log("E TC is running",true);  
 }
 
 @Test(priority=3)
 public void B() 
 {
	  Reporter.log("B TC is running",true);  
 }
}
