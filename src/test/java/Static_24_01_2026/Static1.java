package Static_24_01_2026;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Account() {
		System.out.println("My id is " + id);
	}
	
	public static void Divident() {
		System.out.println("My name is " + name);
	}
	
	public static void Deposit() {
		System.out.println("My salary is " + salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.id=22;
		Static1.name="Flipkart";
		Static1.salary=80000;
		
		Static1.Account();
		Static1.Divident();
		Static1.Deposit();

	}

}
