package Instance_Package_18_03_2026;

public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void StringClass() {
		
		System.out.println("My id is " + id);
	}
	
	public void HashMap() {
		
		System.out.println("My name is " + name);
	}
	
	public void Link() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1 = new Instance1();
		
		i1.id=99;
		i1.name="Wipro";
		i1.salary=100000;
		
		i1.StringClass();
		i1.HashMap();
		i1.Link();

	}

}
