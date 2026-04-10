package Static_10_04_2026;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void RunTest() {
		
		System.out.println("My id is " + id);
	}
	
	public static void SearchResult() {
		
		System.out.println("My number is " + name);
	}
	
	public static void Onboarding() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.id=10;
		Static1.name="Sbi";
		Static1.salary=100000;
		
		Static1.RunTest();
		Static1.SearchResult();
		Static1.Onboarding();
		

	}

}
