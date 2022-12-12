package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class myTest 
{
  @Test
  public void A()
  {
	 System.out.println("A method is running"); 
	  Reporter.log("A method is running using-->log");
	  Reporter.log("A method is running using log true",true);
  }
  @Test
  public void B()
  {
	 System.out.println("B method is running"); 
	 Reporter.log("B method is running using-->log");
	 Reporter.log("B method is running using log true",true);
  }
}
