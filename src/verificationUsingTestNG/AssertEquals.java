package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class AssertEquals {
  @Test
  public void TC1()
  {
	  String a="mona";
	  String b="mona";
	  String c="Tanu";
	  
	//I need to verify a and b are equal or not?
	//if a and b are equal TC is passed or TC is failed
	  
	// if(a.equals(b))
	// {
	// Reporter.log("a and b are matching TC is passed", true);
	// }
	// else {
	//
	// Reporter.log("a and b are not matching TC is failed", true);
	//
	// }
	  
	//using Hard assert using static methods of Assert class
	//1) assertEquals()
	  
	  Assert.assertEquals(a,b,"a and b are not matching TC is failed");
	 // Assert.assertEquals(a,c,"a and c are not matching TC is failed");
  }
}
