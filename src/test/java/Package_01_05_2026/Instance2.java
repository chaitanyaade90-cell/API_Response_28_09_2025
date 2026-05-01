package Package_01_05_2026;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void Car() {
		
		System.out.println("My id is " + id);
	}
	
	public void Bike() {
		
		System.out.println("My name is " + name);
	}
	
	public void Aeroplane(){
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		
		i2.id=99;
		i2.name="Voltas";
		i2.salary=200000;
		
		
		i2.Car();
		i2.Bike();
		i2.Aeroplane();

	}

}
