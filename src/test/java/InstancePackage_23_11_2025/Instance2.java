package InstancePackage_23_11_2025;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void AccelDevops() {
		System.out.println("My project id is " + id);
	}
	
	public void APIReport() {
		System.out.println("My name is : " + name );
	}
	
	public void TestAutomation() {
		System.out.println("My salary is : " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2=new Instance2();
		i2.id=99;
		i2.name="Regression";
		i2.salary=50000;
		
		i2.AccelDevops();
		i2.APIReport();
		i2.TestAutomation();
		

	}

}
