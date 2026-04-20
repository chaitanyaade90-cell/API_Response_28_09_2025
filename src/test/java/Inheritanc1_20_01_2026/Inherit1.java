package Inheritanc1_20_01_2026;

class BestTest
{
	public void openBrowser() {
		System.out.println("Browser Opened");
	}
}
  
  class LoginTest extends BestTest{
	  
	  public void Login() {
		  System.out.println("Login Executed");
	  }

	  public void Banking() {
		// TODO Auto-generated method stub
		
	  }
  }
public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTest test = new LoginTest();
		test.openBrowser();
		test.Login();
		
		

	}

}
