package PriorityExamples_22_12_2025;

import org.testng.annotations.Test;

public class Priority2 {
	
	@Test (priority=1)
	public void OpenBrowser() {}

	@Test(priority=2)
	public void Login() {}
	
	@Test(priority=3)
	public void Logout() {}

	}


