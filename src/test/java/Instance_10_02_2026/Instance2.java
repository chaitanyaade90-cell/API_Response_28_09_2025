package Instance_10_02_2026;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void Software() {
		
		System.out.println("My id is " + id);
	}
	
	public void Programming() {
		
		System.out.println("My name is " + name);
	}
	
	public void Coding() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=22;
		i2.name="Exceler";
		i2.salary=100000;
		
		i2.Software();
		i2.Programming();
		i2.Coding();

	}

}
