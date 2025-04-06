package DDT;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	/*
	 * 
	 * This clas will maintain all data providers, which will be used in current project.
	 * make the method as static
	 * 
	 */

	@DataProvider(name="LoginData")
	public static Object[][] getData()
	{
		
		System.out.println("Test data getting generated");
		
		Object[][] arr = new Object[2][2];
		arr[0][0] ="selenium";
		arr[0][1] ="Grid";
		
		arr[1][0] ="Maven";
		arr[1][1] ="Gradle";
		
		System.out.println("Test data generated");
		
		return arr;	
	}
	
	
	
	
	@DataProvider(name="LoginDataForApp")
	public static Object[][] getDataFoApp()
	{
		
		System.out.println("Test data getting generated");
		
		Object[][] arr = new Object[3][2];
		
		arr[0][0] ="Mukesh@gmail.com";
		arr[0][1] ="Mukesh@123";
		
		arr[1][0] ="Umang@gmail.com";
		arr[1][1] ="Umang@123";
		
		arr[2][0] ="Shiva@gmail.com";
		arr[2][1] ="Mukesh@123";
	
		
		System.out.println("Test data generated");
		
		return arr;
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
