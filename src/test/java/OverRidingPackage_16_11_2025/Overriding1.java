package OverRidingPackage_16_11_2025;

class ABC
{
	public void m1(int a)
	
	{
		System.out.println(a);
	}
	

   public void m2(int b)
   
   {
	   System.out.println(b);
   }
	   
	   
   }

class XYZ extends ABC

{
	public void m3(int c)
	
	
	{
		System.out.println(c);
		
	}
	
	void m2(int a, int b)
	
	{
		System.out.println(a+b);
	}
	
	
}

public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZ xy=new XYZ();
		xy.m1(12);
		xy.m2(20);
		

	}

}
