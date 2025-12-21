package Instance_21_12_2025;

public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void Access() {
		System.out.println("My id is " + id);
	}
	
	public void ADO() {
		System.out.println("My name is " + name);
	}
	
	public void Sanity() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1=new Instance1();
		i1.id=22;
		i1.name="Coforge";
		i1.salary=50000;
		
		i1.Access();
		i1.ADO();
		i1.Sanity();

	}

}
