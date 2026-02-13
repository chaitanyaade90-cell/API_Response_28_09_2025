package Instance_13_02_2026;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	
	public void Onboarding() {
		
		System.out.println("My id is " + id);
	}
	
	public void Searchresult() {
		
		System.out.println("My name is " + name);
		
	}
	
	public void SQMMINION() {
		
		System.out.println("My salary is " + salary);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=22;
		i2.name="AXA";
		i2.salary=90000;
		
		i2.Onboarding();
		i2.Searchresult();
		i2.SQMMINION();

	}

}
