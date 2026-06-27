package Instance_27_06_2026;

public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void System() {
		
		System.out.println("My id is " + id);
	}
	
	public void Dev() {
		
		System.out.println("My name is " + name);
	}
	
	public void Prod() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1 = new Instance1();
		
		i1.id=22;
		i1.name="Ride";
		i1.salary=100000;
		
		i1.System();
		i1.Dev();
		i1.Prod();
		
		

	}

}
