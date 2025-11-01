package Inheritance_01_11_2025;

class ABC
{
	
	int abc=100;
	
	public void inheritance1() {
		
		System.out.println(abc);
		
		
	}
}

class XYZ extends ABC
{
	int xyz=200;
	
	public void inheritance2() {
		
		System.out.println(xyz);
		
		
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABC ab=new ABC();
		ab.inheritance1();
		
		System.out.println("***********");
		
		XYZ xy=new XYZ();
		xy.inheritance2();
		

	}

}
