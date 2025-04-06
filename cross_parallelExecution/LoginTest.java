package cross_parallelExecution;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.Utility;

public class LoginTest {
	
	@Parameters("Browser")
	@Test
	public void loginApp(@Optional("Chrome") String browser) throws InterruptedException
	{
		
		WebDriver driver = Utility.startBrowser(browser, "https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://freelance-learn-automation.vercel.app/");
		
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		
		driver.findElement(By.xpath("//button[text() = 'Sign out']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		
		driver.quit();
	}

}
