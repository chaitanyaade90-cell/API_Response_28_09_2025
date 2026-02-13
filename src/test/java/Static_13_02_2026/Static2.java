package Static_13_02_2026;

public class Static2 {
	
	static int num;
	static String name;
	static int salary;
	
	public static void ADO() {
		
		System.out.println("My num is " + num);
	}
	
	public static void Agile() {
		
		System.out.println("My name is " + name);
	}
	
	public static void Testing() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.num=33;
		Static2.name="QA";
		Static2.salary=100000;
		
		Static2.ADO();
		Static2.Agile();
		Static2.Testing();
				

	}

}
