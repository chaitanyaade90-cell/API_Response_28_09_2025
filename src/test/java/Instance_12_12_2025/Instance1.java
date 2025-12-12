package Instance_12_12_2025;

public class Instance1 {
	
	int number;
	String name;
	String location;
	
	public void M1() {
		System.out.println("My number is " + number);
	}
	
	public void M2() {
		System.out.println("My name is " + name);
	}
	public void M3() {
		System.out.println("My location is " + location);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1=new Instance1();
		i1.number=99;
		i1.name="Chaitanya";
		i1.location="Pune";
		
		i1.M1();
		i1.M2();
		i1.M3();

	}

}
