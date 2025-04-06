package DDT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTExample {
	
	/*
	 * 
	 * 
	 *	DataProvider is am method that returns array of array of objects.
		make sure data provider name is correct (for @Test(dataProvider = "LoginData") and @DataProvider(name="LoginData"))
		make sure number of arguments should matchwith number of column in data provider.
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test(dataProvider = "LoginData")
	public void test(String arg1,String arg2)
	{
		System.out.println("Data From first column "+ arg1);
		System.out.println("Data From Second column "+ arg2);
		System.out.println("**********************");
	}


	
	
	





}
