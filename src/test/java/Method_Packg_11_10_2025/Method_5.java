package Method_Packg_11_10_2025;

public class Method_5 {
	
	int number;
	String name;
	int salary;
	
	void sum(int number1, String name1, int salary1)
	
	{
		number=number1;
		name=name1;
		salary=salary1;
		
		
	}
	
	void display()
	
	{
		System.out.println(number);
		System.out.println(name);
		System.out.println(salary);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_5 ME=new Method_5();
		ME.sum(300, "Folder", 30000);
		ME.display();

	}

}
