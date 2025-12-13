package InstancePackage_13_12_2025;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void AgileMethod() {
		System.out.println("My id is " + id);
	}
	
	public void Kanben() {
		System.out.println("My name is " + name);
	}
	
	public void Crystal() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2=new Instance2();
		
		i2.id=22;
		i2.name="Coforge";
		i2.salary=50000;
		
		i2.AgileMethod();
		

	}

}
