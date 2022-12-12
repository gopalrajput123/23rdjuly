package TestNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testing2 
{
  
	 @Test
	  public void H() 
	  {
		  Reporter.log("H TC is running",true);  
	  }
	  
	 @Test(groups="un")
	  public void I() 
	  {
		  Reporter.log("I TC is running",true);  
	  }
	 
	 @Test(groups="funds")
	 public void J() 
	 {
		  
		  Reporter.log("J TC is running",true);  
	 }
	 
	 @Test(groups="funds")
	 public void K() 
	 {
		  Reporter.log("K TC is running",true);  
	 }
	 
	 @Test
	 public void L() 
	 {
		  Reporter.log("L TC is running",true);  
	 }
	
	
	
	
	
	
}
