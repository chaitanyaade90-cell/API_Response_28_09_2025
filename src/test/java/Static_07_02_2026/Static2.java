package Static_07_02_2026;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void Onboarding() {
		
		System.out.println("My id is " + id);
	}
	
	public static void Recordtest() {
		
		System.out.println("My name is " + name);
	}
	
	public static void RunTest() {
		
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2 s2 = new Static2();
		
		Static2.id=22;
		Static2.name="GoldCoin";
		Static2.salary=100000;
		
		Static2.Onboarding();
		Static2.Recordtest();
		Static2.RunTest();

	}

}
