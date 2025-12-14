package Static_14_11_2025;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void FunctionalTesting() {
		System.out.println("My id is " + id);
	}
	
	public static void NonFunctionalTesting() {
		System.out.println("My name is " + name);
	}
	
	public static void SoftwareTesting() {
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2 s1=new Static2();
		s1.id=11;
		s1.name="Wipro";
		s1.salary=90000;
		
		s1.FunctionalTesting();
		s1.NonFunctionalTesting();
		s1.SoftwareTesting();
		
		

	}

}
