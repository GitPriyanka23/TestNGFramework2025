package DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.Utility;

public class DDTExample3 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUpBrowser()
	{
		System.out.println("Browser getting started");
		driver =Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		System.out.println("Log INFO : Browser started");
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println(" Browser getting close ");
		driver.quit();
		System.out.println("Log INFO : Browser closed");
	}
	
	
	
	
	@Test(dataProvider = "LoginDataForApp",dataProviderClass = CustomDataProvider.class)
	public void test1(String email,String password)
	{
		
		driver.findElement(By.id("email1")).sendKeys(email);
		driver.findElement(By.id("password1")).sendKeys(password);
		driver.findElement(By.className("submit-btn")).click();
			
		String actualErr = 	driver.findElement(By.className("errorMessage")).getText();
	
		Assert.assertTrue(actualErr.contains("USER Email Doesn't Exist"),"Invalid user");
		
		
	}


	
	
	





}
