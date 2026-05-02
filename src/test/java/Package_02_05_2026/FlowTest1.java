package Package_02_05_2026;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlowTest1 {
	
	@BeforeTest
	public void before() {
		
		
		System.out.println("Open Browser");
		
		
	}
	
	@Test
	public void test() {
			
		System.out.println("Run Test");
	}
	
	@AfterMethod
	public void after() {
		
		System.out.println("Closer Browser");
	}

	
		

	}


