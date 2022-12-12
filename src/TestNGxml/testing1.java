package TestNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testing1
{
	 @Test(groups="funds")
	  public void A() 
	  {
		  Reporter.log("A TC is running",true);  
	  }
	  
	 @Test
	  public void D() 
	  {
		  Reporter.log("D TC is running",true);  
	  }
	 
	 @Test(groups="funds")
	 public void C() 
	 {
		  
		  Reporter.log("C TC is running",true);  
	 }
	 
	 @Test
	 public void E() 
	 {
		  Reporter.log("E TC is running",true);  
	 }
	 
	 @Test(groups="un")
	 public void B() 
	 {
		  Reporter.log("B TC is running",true);  
	 }
	
	
	
}
