package Appium_PKG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void test_method_TestNG() {
	  System.out.println("TestNG world with one test case");
	  boolean actual = true;
	  boolean expected  = false;
	
	  if(actual == expected)
		  System.out.println("Assertion is successfully verified and it is Passed");
		  else
			  System.out.println("Assertion is successfully verified and it is failed");
		
	  Assert.assertEquals(actual, expected);
	  
  }
}
