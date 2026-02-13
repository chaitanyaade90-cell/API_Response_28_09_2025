package Instance_13_02_2026;

public class Instance1 {
	
	int number;
	String name;
	int salary;
	
	public void Regression() {
		
		System.out.println("My number is " + number);
	}
	
	public void Sanity() {
		System.out.println("My name is " + name);
	}
	
	public void Smoke() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1 = new Instance1();
		
		i1.number=11;
		i1.name="Wipro";
		i1.salary=90000;
		
		i1.Regression();
		i1.Sanity();
		i1.Smoke();

	}

}
