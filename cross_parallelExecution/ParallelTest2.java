package cross_parallelExecution;

import org.testng.annotations.Test;

public class ParallelTest2 {
	
	/* we can achieve parallel execution in below levels-
	 * 		methods
	 * 		classes
	 * 		tests
	 * 
	 */
	
	
	
	@Test
	public void checkTitle()
	{
		System.out.println("**************************");
		
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		
		System.out.println("Thread name "+ Thread.currentThread().getName());
		
		System.out.println("Thread priority "+ Thread.currentThread().getPriority());
		
		System.out.println("**************************");
	}

	
	@Test
	public void checkURL()
	{
		System.out.println("*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		
		System.out.println("Thread name "+ Thread.currentThread().getName());
		
		System.out.println("Thread priority "+ Thread.currentThread().getPriority());
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}

	
	
	@Test
	public void checkSocialmediaCount()
	{
		System.out.println("*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		
		System.out.println("Thread name "+ Thread.currentThread().getName());
		
		System.out.println("Thread priority "+ Thread.currentThread().getPriority());
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
	
	
	
	@Test
	public void checkLinks()
	{
		System.out.println("*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		
		System.out.println("Thread name "+ Thread.currentThread().getName());
		
		System.out.println("Thread priority "+ Thread.currentThread().getPriority());
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
}
