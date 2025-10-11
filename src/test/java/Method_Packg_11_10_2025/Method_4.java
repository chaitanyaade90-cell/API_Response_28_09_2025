package Method_Packg_11_10_2025;

public class Method_4 {
	
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
		
		System.out.println(name);
		System.out.println(number);
		System.out.println(salary);
	}
	
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	
	    Method_4 ME=new Method_4();
	    ME.sum(200, "Rock", 30000);
	    ME.display();

	}

}
