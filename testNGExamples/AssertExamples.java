package testNGExamples;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExamples {

	@Test
	public void test1() 
	{
		String actual = "Mukesh Otwani";
		String Exp = "Mukesh Otwani";
		
		Assert.assertEquals(actual, Exp);
		
	}

	@Test
	public void test2()
	{
		String actual="Selenium is for web automation";
		
		// partial match - Way 1
		Assert.assertEquals(actual.contains("web"), true,"Msg does not contain web");
		
	}
	
	@Test
	public void test3()
	{
		String actual="Selenium is for web automation";
		
		// partial match - Way 2
		Assert.assertTrue(actual.contains("web"),"Selenium not present");
		
	}
	
	@Test
	public void test4()
	{
		int actual=10;
		int expected=10;
		Assert.assertEquals(10, 10);
		Assert.assertTrue(actual==expected);
		
	}
	
	@Test
	public void test5()
	{
		System.out.println("Start");
		
		List<String> actual= Arrays.asList("Selenium","WebDriver","IDE","Grid");
		
		List<String> expected= Arrays.asList("Selenium","WebDriver","IDE","Grid");
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("End");
	}


	
}
