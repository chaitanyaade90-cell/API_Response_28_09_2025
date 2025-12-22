package Constructor_Package_22_12_2025;

public class Constructor2 {
	
	String EmpName;
	int EmpId;
	
	
	public Constructor2(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public void Constructor(String name, int Id) {
		this.EmpName=name;
		this.EmpId=Id;
		
		
	}
	void show () {
		System.out.println(EmpName + " " + EmpId);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor2 c1=new Constructor2("Chaitanya", 101);
		c1.show();

	}

}
