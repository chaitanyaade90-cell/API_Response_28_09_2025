package OverridingPackage_30_10_2025;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a)
	{
		System.out.println(a*a);
	}
	void m2(int a, int b)
	{
		System.out.println(a+b);
	}
}

public class Bothload_Ride_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZ xy=new XYZ();
		xy.m1(10);
		xy.m2(10);
		xy.m2(10, 20);
		

	}

}
