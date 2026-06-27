package Instance_27_06_2026;

public class Instance2 {
	
	int number;
	String name;
	int Salary;
	
	public void Maths() {
		
		System.out.println("My number is " + number);
	}
	
	public void Science() {
		
		System.out.println("My name is " + name);
	}
	
	public void Physics() {
		
		System.out.println("My Salary is " + Salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.number=11;
		i2.name="Class";
		i2.Salary=90000;
		
		i2.Maths();
		i2.Science();
		i2.Physics();

	}

}
