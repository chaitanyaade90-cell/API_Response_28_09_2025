package Instance_15_12_2025;

public class Instance2 {
	
	int number;
	String name;
	int salary;
	
	public void RegressionTesting() {
		System.out.println("My number is " + number);
	}
	
	public void SanaityTesting() {
		System.out.println("My name is " + name);
	}
	
	public void SmokeTesting() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2=new Instance2();
		i2.number=88;
		i2.name="Regression";
		i2.salary=90000;
		
		i2.RegressionTesting();
		i2.SanaityTesting();
		i2.SmokeTesting();
		
		

	}

}
