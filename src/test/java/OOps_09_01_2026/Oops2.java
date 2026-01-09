package OOps_09_01_2026;

public class Oops2 {
	
	int number;
	String name;
	int salary;
	
	public void display() {
		
		System.out.println(number);
		System.out.println(name);
		System.out.println("salary");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oops2 op = new Oops2();
		
		op.number=99;
		op.name="ATR";
		op.salary=90000;
		
		op.display();

	}

}
