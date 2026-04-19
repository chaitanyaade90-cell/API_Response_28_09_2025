package Instance_19_04_2026;

public class Instance2 {
	
	int number;
	String name;
	int salary;
	
	public void Severity() {
		
		System.out.println("My number is " + number);
	}
	
	public void Priority() {
		
		System.out.println("My name is " + name);
	}
	
	public void Regression() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i1 = new Instance2();
		
		i1.number=99;
		i1.name="Axa";
		i1.salary=100000;
		
		i1.Severity();
		i1.Priority();
		i1.Regression();

	}

}
