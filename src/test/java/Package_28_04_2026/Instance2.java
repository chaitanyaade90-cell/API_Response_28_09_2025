package Package_28_04_2026;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void India() {
		
		System.out.println("My id is " + id);
	}
	
	public void Australia() {
		
		System.out.println("My name is " + name);
	}
	
	public void Switzerland() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=11;
		i2.name="NFR";
		i2.salary=200000;
		
		i2.India();
		i2.Australia();
		i2.Switzerland();

	}

}
