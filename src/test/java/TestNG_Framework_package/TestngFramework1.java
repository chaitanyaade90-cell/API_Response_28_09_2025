package TestNG_Framework_package;

import org.testng.annotations.Test;

public class TestngFramework1 {
	
	@Test(priority=1)
	public void Login() {
		
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void addToCart() {
		System.out.println("Add to Cart");
	}
	
	@Test(priority=3)
	public void logout() {
		System.out.println("Logout");
	}

	
		
		

	}


