package Static_14_11_2025;

public class Static1 {
	
	static int number;
	static String name;
	static int salary;
	
	public static void BlackBoxTesting() {
		System.out.println("My number is " + number);
	}
	
	public static void WhiteBoxTesting() {
		System.out.println("My name is " + name);
	}
	
	public static void GrayBoxTesting() {
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1 s1=new Static1();
		s1.number=11;
		s1.name="SBIL";
		s1.salary=100000;
		
		s1.BlackBoxTesting();
		s1.WhiteBoxTesting();
		s1.GrayBoxTesting();

	}

}
