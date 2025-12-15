package Instance_15_12_2025;

public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void M1() {
		System.out.println("My id is " + id);
	}
	
	public void M2() {
		System.out.println("My name is " + name);
	}
	
	public void M3() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1=new Instance1();
		i1.id=11;
		i1.name="Wipro";
		i1.salary=50000;
		
		i1.M1();
		i1.M2();
		i1.M3();
		
		
		

	}

}
