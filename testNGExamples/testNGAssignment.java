package testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Utility;

public class testNGAssignment {
	
	
	
	@Test
	public void verifyTitle()
	{
		WebDriver driver =Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		String titlename = driver.getTitle();
		System.out.println("Title is "+ titlename);
		
		Assert.assertEquals(titlename, "Learn Automation Courses","match is not correct");
		driver.quit();
	}
	
	
	@Test
	public void loginInvalid() throws InterruptedException
	{
		WebDriver driver =Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin");
		driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);
		
		
		String actualErr = 	driver.findElement(By.className("errorMessage")).getText();
		//String actualErr = 	driver.findElement(By.className("errorMessage")).getDomAttribute("innerHTML");
		
		String experr = "Email and Password Doesn't match";
	
		//Type 1
		Assert.assertEquals(actualErr, experr);
		
		//Type 2
		Assert.assertTrue(actualErr.contains("Email and Password Doesn't"));
		driver.quit();
		
	}
	
	
	
	@Test
	public void loginLogout() throws InterruptedException
	{
		WebDriver driver =Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		driver.findElement(By.className("submit-btn")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();

		Thread.sleep(2000);
		
		String LoginURL = driver.getCurrentUrl();
		
		Assert.assertTrue(LoginURL.contains("learn-automation.vercel.app/login"));
		driver.quit();
		
	}

}
