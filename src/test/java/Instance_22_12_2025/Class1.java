package Instance_22_12_2025;

public class Class1 {
	
	int number;
	String name;
	int salary;
	
	public void SanaityTest() {
		System.out.println("My number is " + number);
	}
	
	public void RegressionTest() {
		System.out.println("My name is " + name);
	}
	
	public void SmokeTest() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1 c1= new Class1();
		c1.number=99;
		c1.name="Chaitanya";
		c1.salary=90000;
		
		c1.SanaityTest();
		c1.RegressionTest();
		c1.SmokeTest();
		

	}

}
