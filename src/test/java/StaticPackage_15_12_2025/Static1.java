package StaticPackage_15_12_2025;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	static public void Software() {
		System.out.println("My id is " + id);
		
	}
	
    static public void Functional() {
    	System.out.println("My name is " + name);
    }
    
    static public void NonFunctional() {
    	System.out.println("My salary is " + salary);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.id=9;
		Static1.name="RegressionTesting";
		Static1.salary=100000;
		
		Static1.Software();
		Static1.Functional();
		Static1.NonFunctional();

	}

}
