package Inheriance_22_10_2025;

class ZY
{
	
	int zy=200;
	
	public void inherit1() {
		
		System.out.println(zy);
	}
}

class WY extends ZY
{
	int wy=300;
	
	
	public void inherit2() {
		
		System.out.println(wy);
		
	}
}

public class Inherit_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZY obj=new ZY();
		obj.inherit1();
		
		System.out.println("***********");
		
		WY obj2=new WY();
		obj2.inherit2();
		

	}

}
