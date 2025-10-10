package Pckg_Inheritance_09_10_2025;

class X
{
	
	int x=500;
	
	void inherit() {
		
		System.out.println(x);
	}
	
	
	}

class Y extends X
{
	
	int y=1000;
	
	void inherit1() {
		
		System.out.println(y);
	}
		
}

public class Inheritance_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X obj=new X();
		obj.inherit();
		
		System.out.println("**********");
		
		Y obj1=new Y();
		
		obj1.inherit1();
		
		

	}

}
