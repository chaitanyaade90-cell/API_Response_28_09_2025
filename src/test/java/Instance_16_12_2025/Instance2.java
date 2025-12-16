package Instance_16_12_2025;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void FunctionalTesting() {
		System.out.println("My id is " + id);
	}
	
	public void ManualTesting() {
		System.out.println("My name is " + name);
	}
	
	public void Software() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2=new Instance2();
		i2.id=11;
		i2.name="Wipro";
		i2.salary=100000;
		
		i2.FunctionalTesting();
		i2.ManualTesting();
		i2.Software();

	}

}
