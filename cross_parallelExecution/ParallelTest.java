package cross_parallelExecution;

import org.testng.annotations.Test;

public class ParallelTest {
	
	/* we can achieve parallel execution in below levels-
	 * 		methods
	 * 		classes
	 * 		tests
	 * 
	 */
	
	
	
	@Test
	public void loginApplication()
	{
		System.out.println("**************************");
		
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		
		System.out.println("Thread name "+ Thread.currentThread().getName());
		
		System.out.println("Thread priority "+ Thread.currentThread().getPriority());
		
		System.out.println("**************************");
	}

	
	@Test
	public void logoutApplication()
	{
		System.out.println("*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		
		System.out.println("Thread name "+ Thread.currentThread().getName());
		
		System.out.println("Thread priority "+ Thread.currentThread().getPriority());
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}

	
	
	@Test
	public void addcourse()
	{
		System.out.println("*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		
		System.out.println("Thread name "+ Thread.currentThread().getName());
		
		System.out.println("Thread priority "+ Thread.currentThread().getPriority());
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
	
	
	
	@Test
	public void deleteCourse()
	{
		System.out.println("*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		
		System.out.println("Thread name "+ Thread.currentThread().getName());
		
		System.out.println("Thread priority "+ Thread.currentThread().getPriority());
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
}
