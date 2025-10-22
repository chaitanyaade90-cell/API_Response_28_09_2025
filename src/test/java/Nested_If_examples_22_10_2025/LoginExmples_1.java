package Nested_If_examples_22_10_2025;

public class LoginExmples_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username="Admin";
		String password="12345";
		
		if(username.equals("Admin")) {
			if(password.equals("12345")) {
				System.out.println("Login Succesfull");
			
			}else {
				System.out.println("Invalid Password!");
			}
			
		}else {
			System.out.println("Invalid Username!");
		}

		
	}

}
