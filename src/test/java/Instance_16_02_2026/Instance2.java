package Instance_16_02_2026;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void Severity() {
		
		System.out.println("My id is " + id);
	}
	
	public void Priority() {
		
		System.out.println("My name is " + name);
	}
	
	public void Defect() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=22;
		i2.name="TestBook";
		i2.salary=100000;
		
		i2.Severity();
		i2.Priority();
		i2.Defect();
		

	}

}
