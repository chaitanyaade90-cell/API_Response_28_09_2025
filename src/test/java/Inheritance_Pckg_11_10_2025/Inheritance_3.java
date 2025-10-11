package Inheritance_Pckg_11_10_2025;

import Method_Packg_11_10_2025.Method_5;

class XY

{
	
	int xy=100;
	
	public void inherit() {
		
		System.out.println(xy);
	}
	
}

class YZ extends XY
{
	
	int yz=200;
	
	public void inherit1() {
		
		System.out.println(yz);
	}
}

public class Inheritance_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XY obj=new XY();
		obj.inherit();
		
		System.out.println("*******");
		
		YZ obj1=new YZ();
		obj1.inherit1();
		
		
		

	}

}
