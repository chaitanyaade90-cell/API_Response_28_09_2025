package Instance_18_06_2026;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void Bank() {
		
		System.out.println("My id is " + id);
	}
	
	public void School() {
		
		System.out.println("My name is " + name);
	}
	
	public void Dividend() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=18;
		i2.name="Trader";
		i2.salary=100000;
		
		i2.Bank();
		i2.School();
		i2.Dividend();

	}

}
