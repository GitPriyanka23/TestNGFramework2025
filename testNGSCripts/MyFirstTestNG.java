package testNGSCripts;

import org.testng.annotations.Test;

public class MyFirstTestNG {
  @Test(priority = 1)
  public void login() 
  {
	  
	  System.out.println("Login to the application");
  }
  
  
  @Test(priority = 2)
 public void CreateCourse() {
	  
	  System.out.println("Create the course");
  }
 
  
  @Test(priority = 3)
 public void DeleteCourse() {
	  
	  System.out.println("Delete the course");
 }
 
  
  @Test(priority = 4)
 public void logout() {
	  
	  System.out.println("Logout to the application");
 }
  
  
  
  
}
