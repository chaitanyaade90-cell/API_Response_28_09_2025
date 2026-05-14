package Instance_14_05_2026;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void RunTest() {
		
		System.out.println("My id is " + id);
	}
	
	public void Severity() {
		
		System.out.println("my name is " + name);
	}
	
	public void Priority() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=22;
		i2.name="Xtra";
		i2.salary=900000;
		
		i2.RunTest();
		i2.Severity();
		i2.Priority();

	}

}
