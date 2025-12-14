package Instance_14_12_2025;

public class Instance1 {
	
	int number;
	String name;
	int salary;
	
	public void Method1() {
		System.out.println("My number is " + number);
	}
	
	public void Method2() {
		System.out.println("My name is " + name);
	}
	
	public void Method3() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1=new Instance1();
		i1.number=99;
		i1.name="Axa";
		i1.salary=90000;
		
		i1.Method1();
		i1.Method2();
		i1.Method3();

	}

}
