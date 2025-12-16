package Instance_16_12_2025;

public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void ManualTesting() {
		System.out.println("My id is " + id);
	}
	
	public void WebAutomation() {
		System.out.println("My name is " + name);
	}
	
	public void APIAutomation() {
		System.out.println("My salary time is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1=new Instance1();
		i1.id=00;
		i1.name="Axa";
		i1.salary=100000;
		
		i1.ManualTesting();
		i1.WebAutomation();
		i1.APIAutomation();

	}

}
