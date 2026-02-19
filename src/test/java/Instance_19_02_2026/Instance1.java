package Instance_19_02_2026;

public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void NFR() {
		
		System.out.println("My id is " + id);
	}
	
	public void Trends() {
		
		System.out.println("My number is " + name);
	}
	
	public void CoreRef() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1 = new Instance1();
		
		i1.id=22;
		i1.name="Software";
		i1.salary=90000;
		
		i1.NFR();
		i1.CoreRef();
		i1.Trends();
		

	}

}
