package Inheritanc1_20_01_2026;

class BasicTest
{
	public void Banking() {
		System.out.println("Browser Opened");
	}
}

class LoginTest1 extends BasicTest{
	
	public void Login() {
		System.out.println("Login Executed");
	}
	
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTest test = new LoginTest();
		
		test.Banking();
		test.Login();

	}

}
