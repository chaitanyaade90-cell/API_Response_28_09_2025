package Instance_24_01_2026;

public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void Methods() {
		System.out.println("My id is " + id);
	}
	
	public void MutualFund() {
		System.out.println("My name is " + name);
	}
	
	public void SIP() {
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1 = new Instance1();
		
		i1.id=11;
		i1.name="Wipro";
		i1.salary=90000;
		
		i1.Methods();
		i1.MutualFund();
		i1.SIP();

	}

}
