package Inhertitance_Package_21_10_2025;

class CS
{
	
	int cs=200;
	
	public void Inherit() {
		
		System.out.println(cs);
	}
}

class SC extends CS
{
	int sc=100;
	
	public void Inherit2() {
		
		System.out.println(sc);
	}
	
}

public class Inherit_class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CS obj=new CS();
		obj.Inherit();
		
		System.out.println("**************");
		
		SC obj1=new SC();
		obj1.Inherit2();

	}

}
