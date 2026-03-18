package Static_Package_18_03_2026;

public class Static1 {
	
	static int number;
	static String name;
	static int salary;
	
	
	public static void Method1() {
		
		System.out.println("My number is " + number);
	}
	
	public static void Method2() {
		
		System.out.println("My name is " + name);
	}
	
	public static void Method3() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.number=12;
		Static1.name="SBil";
		Static1.salary=90000;
		
		Static1.Method1();
		Static1.Method2();
		Static1.Method3();
		
		

	}

}
