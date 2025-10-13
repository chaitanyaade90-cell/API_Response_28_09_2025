package Inheritance_13_10_2025;

class WW
{
	
	int ww=900;
	
	public void inherit1() {
		
		System.out.println(ww);
	}
}

class XX extends WW
{
	
	int xx=1000;
	
	public void inherit2() {
		
		System.out.println(xx);
	}
}

public class Inheritance_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WW obj=new WW();
		obj.inherit1();
		
		System.out.println("********");
		
		XX obj2=new XX();
		obj2.inherit2();
		
		

	}

}
