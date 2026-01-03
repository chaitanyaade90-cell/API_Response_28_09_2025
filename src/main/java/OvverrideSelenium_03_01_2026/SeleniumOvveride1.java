package OvverrideSelenium_03_01_2026;

class BaseTest
{
	
	public void launchBrowser() {
		System.out.println("Launching Chrome browser");
	}
}

class LoginTest extends BaseTest{
	
	@Override
	public void launchBrowser() {
		
		System.out.println("Launching Google");
		
	}
	
}

public class SeleniumOvveride1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTest l1 = new LoginTest();
		l1.launchBrowser();
		
		
		

	}

}
