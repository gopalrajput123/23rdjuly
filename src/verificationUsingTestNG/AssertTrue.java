package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AssertTrue {
  @Test
  public void Trueuse()
  { 
	  boolean a=true;
	  
	  //if a is true then TC should b passed

	  Assert.assertTrue(a,"TC is failed if a is false");
	  
}
  
}