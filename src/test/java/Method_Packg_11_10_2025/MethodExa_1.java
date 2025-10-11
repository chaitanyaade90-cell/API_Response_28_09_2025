package Method_Packg_11_10_2025;

public class MethodExa_1 {
	
	int number;
	String name;
	int salary;
	
	void sum(int number1, String name1, int salary1)
	
	{
		
		number=number1;
		name=name1;
		salary=salary1;
		
		
		
	}
	
	void Display() {
		
		System.out.println(number);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodExa_1 ME=new MethodExa_1();
		ME.sum(101, "Chaitanya", 20000);
		ME.Display();

	}

}
