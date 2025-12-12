package Instance_12_12_2025;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void AgileMethod() {
		System.out.println("My id is " + id);
	}
	public void Selenium() {
		System.out.println("My name is " + name);
	}
	public void Maven() {
		System.out.println("My slary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i1=new Instance2();
		i1.id=11;
		i1.name="Wipro";
		i1.salary=60000;
		
		i1.AgileMethod();
		i1.Selenium();
		i1.Maven();

	}

}
