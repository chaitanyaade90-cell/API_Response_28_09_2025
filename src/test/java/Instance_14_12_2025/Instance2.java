package Instance_14_12_2025;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void SQL() {
		System.out.println("My id is " + id);
	}
	
	public void Accel() {
		System.out.println("My name is " + name);
	}
	
	public void ADO() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2=new Instance2();
		
		i2.id=11;
		i2.name="Coforge";
		i2.salary=90000;
		
		i2.SQL();
		i2.Accel();
		i2.ADO();

	}

}
