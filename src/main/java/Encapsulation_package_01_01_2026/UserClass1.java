package Encapsulation_package_01_01_2026;

class user
{
	private String username;
	
	public void setUsername(String username) {
		this.username=username;
		
	}
	
	public String getUsername() {
		return username;
		
	}
}

public class UserClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		user u = new user();
		u.setUsername("admin");
		System.out.println(u.getUsername());

	}

}
