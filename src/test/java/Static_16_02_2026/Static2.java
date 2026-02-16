package Static_16_02_2026;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Physics() {
		
		System.out.println("My id is " + id);
	}
	
	public static void Chemestry() {
		
		System.out.println("My name is " + name);
	}
	
	public static void Maths() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2 s2 = new Static2();
		
		s2.id=55;
		s2.name="Coforge";
		s2.salary=200000;
		
		s2.Physics();
		s2.Chemestry();
		s2.Maths();

	}

}
