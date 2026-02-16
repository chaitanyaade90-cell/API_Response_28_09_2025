package Instance_16_02_2026;

public class Instance1 {
	
	int number;
	String name;
	int salary;
	
	public void QA1() {
		
		System.out.println("My number is " + number);
	}
	
	public void TE1() {
		
		System.out.println("My name is " + name);
	}
	
	public void TM1() {
		
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1 = new Instance1();
		
		i1.number=99;
		i1.name="Tester";
		i1.salary=90000;
		
		i1.QA1();
		i1.TE1();
		i1.TM1();

	}

}
