package Inheritance_25_10_2025;

class OX
{
	
	int ox=200;
	
	public void inherit1() {
		
		System.out.println(ox);
	}
}

class XO extends OX
{
	
	int xo=100;
	
	public void inherit2() {
		
		System.out.println(xo);
	}
}

public class Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OX obj=new OX();
		obj.inherit1();
		
		System.out.println("************");
		
		XO obj2=new XO();
		obj2.inherit2();
		

	}

}
