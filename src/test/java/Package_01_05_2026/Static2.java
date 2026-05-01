package Package_01_05_2026;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void India() {
		
		System.out.println("My id is " + id);
	}
	
	public static void Japan() {
		
		System.out.println("My name is " + name);
	}
	
	public static void China() {
		
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.id= 11;
		Static2.name="Random";
		Static2.salary=200000;
		
		Static2.India();
		Static2.Japan();
		Static2.China();

	}

}
