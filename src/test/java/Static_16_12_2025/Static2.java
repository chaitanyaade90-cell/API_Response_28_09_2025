package Static_16_12_2025;

public class Static2 {
	
	static int num;
	static String name;
	static int salary;
	
	static public void PerformingTesting() {
		System.out.println("My num is " + num);
	}
	
	static public void Integration() {
		System.out.println("My name is " + name);
	}
	
	static public void Sanity() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.num=889;
		Static2.name="Education";
		Static2.salary=100000;
		
		Static2.PerformingTesting();
		Static2.Integration();
		Static2.salary=200000;
		

	}

}
