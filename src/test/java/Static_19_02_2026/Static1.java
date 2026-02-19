package Static_19_02_2026;

public class Static1 {
	
	static int number;
	static String name;
	static int salary;
	
	public static void Tester() {
		
		System.out.println("My number is " + number);
	}
	
	public static void Developer() {
		
		System.out.println("My name is " + name);
	}
	
	public static void ProjectManager() {
		
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.number=99;
		Static1.name="Frameworks";
		Static1.salary=100000;
		
		Static1.Tester();
		Static1.Developer();
		Static1.ProjectManager();

	}

}
