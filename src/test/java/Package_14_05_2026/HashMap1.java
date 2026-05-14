package Package_14_05_2026;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> login = new HashMap<>();
		
		login.put("username", "admin");
		login.put("password", "admin123");
		
		System.out.println("Username: " + login.get("username"));
		System.out.println("password: " + login.get("password"));

	}

}
