package StaticPackage_19_04_2026;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Onboarding() {
		
		System.out.println("My id is " + id);
	}
	
	public static void SearchResult() {
		
		System.out.println("My name is " + name);
	}
	
	public static void SQM() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2 s1 = new Static2();
		
		s1.id=99;
		s1.name="Xaco";
		s1.salary=100000;
		
		s1.Onboarding();
		s1.SearchResult();
		s1.SQM();
		

	}

}
