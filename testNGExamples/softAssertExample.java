package testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertExample {

	@Test
	public void test1() 
	{
		System.out.println("Start");
		String actual = "Mukesh Otwani";
		String exp = "Mukesh Otwani ";
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actual, exp);
		softAssert.assertFalse(true);
		softAssert.assertNull(null);
		System.out.println("End");
		
		softAssert.assertAll();
	}
	
	
	@Test
	public void test2() 
	{
		SoftAssert softAssert = new SoftAssert();
		
		String tool ="Selenium";
		
		if(tool.equalsIgnoreCase("Katalon"))
		{
			Assert.fail();
		}
		softAssert.assertAll();

	}
	
}
