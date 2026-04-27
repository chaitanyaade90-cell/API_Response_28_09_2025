package Package_27_04_2026;

public class Static1 {
	
	static int number;
	static String name;
	static int salary;
	
	public static void ATR() {
		System.out.println("My number is " + number);
	}
	
	public static void NFR() {
		
		System.out.println("My name is " + name);
	}
	
	public static void Corerefrence() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.number=12;
		Static1.name="Crystal";
		Static1.salary=100000;
		
		Static1.ATR();
		Static1.NFR();
		Static1.Corerefrence();

	}

}
