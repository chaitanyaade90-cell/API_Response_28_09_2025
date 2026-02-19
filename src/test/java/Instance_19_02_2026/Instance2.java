package Instance_19_02_2026;

public class Instance2 {
	
	int id; 
	String name;
	int salary;
	
	public void MNC() {
		
		System.out.println("My id is " + id);
	}
	
	public void CMD() {
		
		System.out.println("My name is " + name);
	}
	
	public void SQM() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=11;
		i2.name="NT";
		i2.salary=90000;
		
		i2.MNC();
		i2.CMD();
		i2.SQM();

	}

}
