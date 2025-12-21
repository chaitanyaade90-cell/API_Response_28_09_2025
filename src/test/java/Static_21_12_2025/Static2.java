package Static_21_12_2025;

public class Static2 {
	
	static int number;
	static String name;
	static int salary;
	
	static public void NonFunctional() {
		System.out.println("My number is " + number);
	}
	
	static public void Software() {
		System.out.println("my name is " + name);
	}
	
	static public void NonTech() {
		System.out.println("my salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.number=10;
		Static2.name="Axa";
		Static2.salary=90000;
		
		Static2.NonFunctional();
		Static2.Software();
		Static2.NonTech();

	}

}
