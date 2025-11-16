package Instance_Project_16_11_2025;

public class Instance_2 {
	
	int id;
	String name;
	int salary;
	
	public void Account() {
		System.out.println("My id is " + id);
	}
	
	public void Bank() {
		System.out.println("My Bank name " + id);
	}
	
	public void Amount() {
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance_2 i2=new Instance_2();
		i2.id=44;
		i2.name="Icici";
		i2.salary=20000;
		
		i2.Account();
		i2.Amount();
		i2.Amount();
		

	}

}
