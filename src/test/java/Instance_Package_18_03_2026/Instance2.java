package Instance_Package_18_03_2026;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void Regression() {
		
		System.out.println("My id is " + id);
	}
	
	public void Sanity() {
		
		System.out.println("My name is " + name);
	}
	
	public void Smoke() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=88;
		i2.name="Axa";
		i2.salary=90000;
		
		i2.Regression();
		i2.Sanity();
		i2.Smoke();

	}

}
