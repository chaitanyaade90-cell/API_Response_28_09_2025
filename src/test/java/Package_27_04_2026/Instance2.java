package Package_27_04_2026;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void AI() {
		
		System.out.println("My id is " + id);
	}
	
	public void IOC() {
		
		System.out.println("My name is " + name);
	}
	
	public void AIO() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=99;
		i2.name="Infra";
		i2.salary=100000;
		
		i2.AI();
		i2.AIO();
		i2.IOC();

	}

}
