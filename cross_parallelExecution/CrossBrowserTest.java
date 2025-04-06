package cross_parallelExecution;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	
	//With parameters Annotation
	
	@Parameters({"fname","lname"})
	@Test
	
	public void test1(String fname, String lname) {
		
		System.out.println(fname);
		System.out.println(lname);
	}
	
	
	
	//with parameters  and optional annotation	
//	@Parameters({"fname","lname"})
//	@Test
//	
//	public void test2(@Optional("maven") String fname, @Optional("Github")String lname) {
//		
//		System.out.println(fname);
//		System.out.println(lname);
//	}

}
