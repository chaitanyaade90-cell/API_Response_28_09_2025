package Instance_01_07_2026;

public class Instance1 {
	
	int id;
	String name;
	int Salary;
	
	public void Runtest() {
		
		System.out.println("My id is " + id);
		
	}
	
	public void SearchR() {
		
		System.out.println("My name is " + name);
	}
	
	public void Onboard() {
		
		System.out.println("My salary is " + Salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1 = new Instance1();
		
		i1.id=99;
		i1.name="Wipro";
		i1.Salary=100000;
		
		i1.Runtest();
		i1.SearchR();
		i1.Onboard();

	}

}
