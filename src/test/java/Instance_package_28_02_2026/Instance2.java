package Instance_package_28_02_2026;

public class Instance2 {
	
	int number;
	String name;
	int salary;
	
	public void Sanity() {
		
		System.out.println("My number is " + number);
	}
	
	public void Regression() {
		
		System.out.println("My name is " + name);
	}
	
	public void Smoke() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.number=90;
		i2.name="Axa";
		i2.salary=100000;
		
		i2.Sanity();
		i2.Regression();
		i2.Smoke();

	}

}
