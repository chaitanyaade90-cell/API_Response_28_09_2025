package InstancePackage_23_11_2025;

public class Instance1 {
	
	int id=23;
	String name;
	int salary;
	
	public void M1() {
		
		
		System.out.println("My id is " + id);
	}
	
	public void M2() {
		
		System.out.println("My name is " + name);
	}
	
	public void M3() {
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1=new Instance1();
		i1.id=22;
		i1.name="Coforge";
		i1.salary=300000;
		
		i1.M1();
		i1.M2();
		i1.M3();
		
		

	}

}
