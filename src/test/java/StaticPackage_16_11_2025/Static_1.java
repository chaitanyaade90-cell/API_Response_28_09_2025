package StaticPackage_16_11_2025;

public class Static_1 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void B1() {
		System.out.println("My id is " + id);
	}
	
	public static void B2() {
		System.out.println("My bank name is " + name);
	}
	
	public static void B3() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_1 s1=new Static_1();
		s1.id=22;
		s1.name="Axis";
		s1.salary=20000;
		
		s1.B1();
		s1.B2();
		s1.B3();

	}

}
