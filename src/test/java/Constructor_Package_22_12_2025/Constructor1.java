package Constructor_Package_22_12_2025;

public class Constructor1 {
	
	private static final int id = 0;
	String empname;
	int empid;
	
	public Constructor1(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	void Employee(String name, int empid) {
		empname =name;
		empid =id;
	}
	
	void show () {
		System.out.println(empname+" "+empid);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor1 c1=new Constructor1("Chaitanya", 101);
		c1.show();
		
		

	}

}
