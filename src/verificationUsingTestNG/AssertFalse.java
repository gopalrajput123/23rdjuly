package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void falseuse()
  {
	  
      boolean a=false;
	  
	  //if a is false then TC should b passed

	  Assert.assertFalse(a,"TC is failed if a is true");
	  
	  
	  
	  
	  
  }
}
