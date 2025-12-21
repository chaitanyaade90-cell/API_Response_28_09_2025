package Instance_21_12_2025;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void RegressionTesting() {
		System.out.println("My id is " + id);
	}
	
	public void SmokeTesting() {
		System.out.println("My name is " + name);
	}
	
	public void FunctionalTesting() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2= new Instance2();
		i2.id=12;
		i2.name="Signity";
		i2.salary=90000;
		
		i2.RegressionTesting();
		i2.SmokeTesting();
		i2.FunctionalTesting();

	}

}
