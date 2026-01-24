
public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void Boards() {
		System.out.println("My id is " + id);
	}
	
	public void Spring() {
		System.out.println("My name is " + name);
	}
	
	public void Backlogs() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1 = new Instance1();
		i1.id=99;
		i1.name="Philips";
		i1.salary=90000;
		
		i1.Boards();
		i1.Spring();
		i1.Backlogs();

	}

}
