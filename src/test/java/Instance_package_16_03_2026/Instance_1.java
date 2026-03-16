package Instance_package_16_03_2026;

public class Instance_1 {
	
	int id;
	String name;
	int salary;
	
	public void Method1() {
		
		System.out.println("My id is " + id);
	}
	
    public void Method2() {
	
	System.out.println("My name is "  + name);
}
    
    public void Method3() {
    	System.out.println("My salary is " + salary);
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	Instance_1 i1 = new Instance_1();
    	
    	i1.id=99;
    	i1.name="Axa";
    	i1.salary=90000;
    	
    	i1.Method1();
    	i1.Method2();
    	i1.Method3();
    	

	}

}
