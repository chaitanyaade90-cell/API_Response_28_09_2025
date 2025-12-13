package InstancePackage_13_12_2025;

public class Instance_1 {
	
	int id;
	String name;
	int salary;
	
	public void M1() {
		System.out.println("My id is " + id);
	}
	
	public void M2() {
		System.out.println("My name is " + name);
	}
	
	public void M3() {
		System.out.println("My name is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance_1 i1=new Instance_1();
		
		i1.id=99;
		i1.name="Axis";
		i1.salary=60000;
		
		i1.M1();
		i1.M2();
		i1.M3();
		
		

	}

}
