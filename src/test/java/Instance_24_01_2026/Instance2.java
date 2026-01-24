package Instance_24_01_2026;

public class Instance2 {
	
	int num;
	String name;
	int salary;
	
	public void TestCase() {
		System.out.println("My num is " + num);
	}
	
	public void TestScript() {
		System.out.println("My name is " + name);
	}
	
	public void TestScenario() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.num=22;
		i2.name="Philips";
		i2.salary=100000;
		
		i2.TestCase();
		i2.TestScript();
		i2.TestScenario();

	}

}
