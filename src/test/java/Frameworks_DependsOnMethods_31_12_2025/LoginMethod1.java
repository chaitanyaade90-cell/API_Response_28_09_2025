package Frameworks_DependsOnMethods_31_12_2025;

import org.testng.annotations.Test;

public class LoginMethod1 {
	
	@Test
	public void login() {
		System.out.println("Login Success");
	}

    @Test(dependsOnMethods = "login") 
	public void dashboard() {
		System.out.println("Dashboard loaded");
	}

	}


