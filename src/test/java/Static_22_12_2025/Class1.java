package Static_22_12_2025;

public class Class1 {
	
	static int id;
	static String name;
	static int salary;
	
	static public void ADO() {
		System.out.println("My id is " + id);
	}
	
	static public void ACCES() {
		System.out.println("My name is " + name);
	}
	
	static public void Sanity() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1.id=99;
		Class1.name="Coforge";
		Class1.salary=100000;
		
		Class1.ADO();
		Class1.ACCES();
		Class1.Sanity();

	}

}
