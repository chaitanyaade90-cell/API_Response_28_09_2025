package Static_16_03_2026;

public class Static1 {
	
	static int number;
	static String name;
	static int salary;
	
	public static void RunTest() {
		
		System.out.println("My number is " + number);
	}
	
	public static void RecordTest() {
		
		System.out.println("My name is " + name);
	}
	
	public static void Onboarding() {
		
		System.out.println("My salary is " + name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.number=99;
		Static1.name="SBIL";
		Static1.salary=90000;
		
		Static1.RunTest();
		Static1.RecordTest();
		Static1.Onboarding();

	}

}
