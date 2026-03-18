package Static_Package_18_03_2026;

public class Static2 {
	
	static int number;
	static String name;
	static int salary;
	
	public static void RunTest() {
		
		System.out.println("My number is " + number);
	}
	
	public static void SQM() {
		
		System.out.println("My name is " + name);
	}

	public static void VSCode() {
		
		System.out.println("My salary is " + salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.number=99;
		Static2.name="Coforge";
		Static2.salary=100000;
		
		Static2.RunTest();
		Static2.SQM();
		Static2.VSCode();

	}

}
