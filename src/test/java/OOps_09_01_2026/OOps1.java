package OOps_09_01_2026;

public class OOps1 {
	
	int id;
	String name;
	int salary;
	
	public void display() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OOps1 op = new OOps1();
		
		op.id=11;
		op.name="UniversalTest";
		op.salary=90000;
		
		op.display();
		

	}

}
