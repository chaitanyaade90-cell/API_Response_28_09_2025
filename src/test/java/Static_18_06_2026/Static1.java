package Static_18_06_2026;

public class Static1 {
	
	static int num;
	static String name;
	static int salary;
	
	public static void College() {
		
		System.out.println("My num is " + num);
	}
	
	public static void Student() {
		
		System.out.println("My name is " + name);
	}
	
	public static void Fees() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.num=99;
		Static1.name="Wipro";
		Static1.salary=100000;
		
		Static1.College();
		Static1.Student();
		Static1.Fees();

	}

}
