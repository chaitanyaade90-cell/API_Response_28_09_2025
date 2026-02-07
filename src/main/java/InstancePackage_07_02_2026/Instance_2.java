package InstancePackage_07_02_2026;

public class Instance_2 {
	
	int id;
	String name;
	int salary;
	
	public void Sanity() {
		
		System.out.println("My id is " + id);
	}
	
	public void Regression() {
		
		System.out.println("My name is " + name);
	}
	
	public void Smoke() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance_2 i2 = new Instance_2();
		
		i2.id=91;
		i2.name="Axa";
		i2.salary=100000;
		
		i2.Regression();
		i2.Smoke();
		i2.Sanity();
		

	}

}
