package Static_08_02_2026;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void RunTest() {
		
		System.out.println("My id is " + id);
	}
	
	public static void SearchResult() {
		
		System.out.println("My name is " + name);
	}
	
	public static void SQMMinion() {
		
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.id=33;
		Static2.name="UK";
		Static2.salary=100000;
		
		Static2.RunTest();
		Static2.SearchResult();
		Static2.SQMMinion();

	}

}
