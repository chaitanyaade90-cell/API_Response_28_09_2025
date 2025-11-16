package Instance_Project_16_11_2025;

public class InstanceClass_1 {
	
	int id;
	String name;
	String location;
	
	public void A1() {
		System.out.println("My id is : " + id);
		
	}
	public void A2() {
		System.out.println("My name is : " + name);
	}
	
	public void A3() {
		System.out.println("My location is " + location);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceClass_1 i1=new InstanceClass_1();
		i1.id=22;
		i1.name="Sigity";
		i1.location="Pune";
		
		i1.A1();
		i1.A2();
		i1.A3();

	}

}
