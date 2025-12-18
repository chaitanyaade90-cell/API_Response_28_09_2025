package Instance_package_18_12_2025;

public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void AzureDO() {
		System.out.println("My id is " + id);
	}
	
	public void Sanaity() {
		System.out.println("My name is " + name);
	}
	
	public void Regression() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1=new Instance1();
		i1.id=88;
		i1.name="Axa";
		i1.salary=90000;
		
		i1.AzureDO();
		i1.Sanaity();
		i1.Regression();

	}

}
