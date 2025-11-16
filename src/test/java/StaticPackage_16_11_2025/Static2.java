package StaticPackage_16_11_2025;

public class Static2 {
	
	static int number;
	static String name;
	static int salary;
	
	public static void Company() {
		System.out.println("My number is " + number);
	}
	
	public static void Companyname() {
		System.out.println("My Company name " + name);
	}
	
	public static void Companysalary() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2 s1= new Static2();
		s1.number=11;
		s1.name="Vivo";
		s1.salary=30000;
		
		s1.Company();
		s1.Companyname();
		s1.Companysalary();	}

}
