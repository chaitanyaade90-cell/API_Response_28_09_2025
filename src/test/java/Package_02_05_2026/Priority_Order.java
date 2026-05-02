package Package_02_05_2026;

import org.testng.annotations.Test;

public class Priority_Order {

	@Test(priority = 1)
	public void login() {
		
		System.out.println("Login");
		
	}
	
	@Test(priority = 2)
	public void home () {
		
		System.out.println("Home");
	}

	}


